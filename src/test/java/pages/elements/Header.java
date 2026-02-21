package pages.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Верхняя панель страницы
 */
public class Header extends BaseElement {

    private static final SelenideElement ROOT = $("div.header-main__inner");

    /**
     * Логотип "Selectel"
     */
    private final SelenideElement logo = baseElement.$("a.header-main__logo");

    /**
     * Конструктор класса
     */
    public Header() {
        super(ROOT);
    }

    /***
     * Проверка, что логотип отображается
     */
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}