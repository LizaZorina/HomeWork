package HomeWork8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormAuthentication {
    static SelenideElement username = $("#username");
    static SelenideElement password = $("#password");
    static SelenideElement button = $(byXpath("//button[@type='submit']"));
    static SelenideElement correctData = $(byXpath("//div[@class='flash success']"));

    static SelenideElement incorrectData = $(byXpath("//div[@class='flash error']"));


    public static void positiveFormAuthentication(String BASE_URI) {
        open(BASE_URI + "login");
        username.setValue("tomsmith");
        password.setValue("SuperSecretPassword!");
        button.click();
        correctData.shouldBe(Condition.text(" You logged into a secure area!"));
        System.out.println("Авторизация с корректыми данными");
    }

    public static void negativeFormAuthentication(String BASE_URI) {
        open(BASE_URI + "login");
        username.setValue("tommi");
        password.setValue("Super");
        button.click();
        incorrectData.shouldBe(Condition.text("Your username is invalid!"));
        System.out.println("Авторизация с некорректыми данными");
    }
}