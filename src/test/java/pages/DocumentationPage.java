package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import pages.utils.TabSwitcher;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


/**
 * Страница "Документация"
 */
public class DocumentationPage extends BasePage {
    public static final String DOCS_URL_PREFIX = "https://docs.selectel.ru/";

    public DocumentationPage() {
        super(DocumentationPage.class, $("body"));
    }

    /**
     * Переход на страницу
     */
    public static DocumentationPage switchTo() {
        TabSwitcher.switchToTabByUrlPrefix(DOCS_URL_PREFIX, Duration.ofSeconds(8));
        return new DocumentationPage();
    }

    /**
     * Проверка, что страница открыта
     */
    public DocumentationPage shouldBeOpened() {
        String currentUrl = WebDriverRunner.url();
        $("body").shouldBe(Condition.visible);
        return this;
    }
}