package pages;

import pages.elements.Header;

import static com.codeborne.selenide.Selenide.$;

/**
 * Класс главной страницы
 */
public class MainPage extends BasePage {

    /**
     * Верхняя панель страницы
     */
    private final Header header = new Header();

    /**
     * Конструктор класса
     */
    public MainPage() {
        super(MainPage.class, $("body"));
    }

    /**
     * Метод возращает верхнюю панель
     */
    public Header header() {
        return header;
    }
}