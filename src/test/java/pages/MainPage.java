package pages;

import pages.elements.Header;

import static com.codeborne.selenide.Selenide.$;

/**
 * Класс главной страницы
 */
public class MainPage extends BasePage {

    private final Header header = new Header();

    public MainPage() {
        super(MainPage.class, $("body"));
    }

    public Header header() {
        return header;
    }
}