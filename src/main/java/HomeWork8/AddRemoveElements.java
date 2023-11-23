package HomeWork8;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class AddRemoveElements {
    static SelenideElement addElement = $(byXpath("//button[@onclick='addElement()']"));
    static ElementsCollection button = $$("button[onclick='deleteElement()']");

    public static void elements(String BASE_URI, int number) {
        open(BASE_URI + "add_remove_elements/");
        for (int i = 0; i < number; i++) {
            addElement.click();
        }
        button.shouldHave(size(number));
        System.out.println("Добавили элементы, пока не появилось необходимое кол-во, переданное на вход");
    }
}