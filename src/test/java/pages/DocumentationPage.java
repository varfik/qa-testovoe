package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

/**
 * Страница "Документация"
 */
public class DocumentationPage extends BasePage {

    public static final String DOCS_URL_PREFIX = "https://docs.selectel.ru/";

    public DocumentationPage() {
        super(DocumentationPage.class, $("body"));
    }

    public DocumentationPage shouldBeOpened() {
        webdriver().shouldHave(Condition.urlStartingWith(DOCS_URL_PREFIX));
        $("body").shouldBe(Condition.visible);
        return this;
    }
}