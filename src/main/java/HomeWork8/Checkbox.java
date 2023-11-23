package HomeWork8;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Checkbox {

    static SelenideElement checkbox = $(byXpath("//*[@type='checkbox'][1]"));
    static SelenideElement clickTestCheckbox = $(byXpath("//*[@checked][1]"));

    public static void checkbox(String BASE_URI) {
        open(BASE_URI + "checkboxes");
        checkbox.click();
        clickTestCheckbox.shouldBe();
        System.out.println("Checkbox 1 нажат");
    }
}