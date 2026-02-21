package pages;

import pages.elements.Header;
import pages.elements.Link;

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
     * Раздел "Документация"
     */
    private final Link documentationLink = new Link($("a[data-qa='main-nav__link-documentation']"));

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

    /**
     * Переход в раздел "Документация"
     */
    public void clickDocumentationLink() {
        documentationLink.open();
    }
}