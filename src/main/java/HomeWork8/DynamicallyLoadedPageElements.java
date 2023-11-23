package HomeWork8;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DynamicallyLoadedPageElements {
    static SelenideElement button = $(byXpath("//button[text()='Start']"));
    static SelenideElement textHello = $(byXpath("//h4[text()='Hello World!']"));

    public static void loaded(String BASE_URI) {
        open(BASE_URI + "dynamic_loading/2");
        button.click();
        Configuration.timeout = 10000;
        textHello.shouldHave(visible);
        System.out.println("Дождать текста после лоадера");
    }
}