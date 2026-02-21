package pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

/**
 * Ссылка
 */
public class Link extends BaseElement {

    /**
     * Конструктор класса
     */
    public Link(SelenideElement element) {
        super(element);
    }

    /**
     * Открыть ссылку
     */
    public void open() {
        baseElement.shouldBe(Condition.visible).click();
    }

}