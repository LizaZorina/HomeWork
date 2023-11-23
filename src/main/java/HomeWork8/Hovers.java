package HomeWork8;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Hovers {
    static SelenideElement hoversOne = $(byXpath("//div[@class='figure'][1]"));
    static SelenideElement text = $(byXpath("//a[@href='/users/1']"));

    public static void hovers(String BASE_URI) {
        open(BASE_URI + "hovers");
        hoversOne.hover();
        text.shouldBe();
        System.out.println("Навели на нужного пользователя, проверили что отображается текст");
    }
}