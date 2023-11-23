package HomeWork8;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

public class KeyPresses {
    static SelenideElement input = $("#target");
    static SelenideElement result = $("#result");

    public static void keyPresses(String BASE_URI) {
        open(BASE_URI + "key_presses");
        input.sendKeys(Keys.F6);
        result.shouldBe(text("You entered: F6"));
    }
}