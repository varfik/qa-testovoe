package tests;

import org.junit.jupiter.api.Test;
import pages.DocumentationPage;
import pages.MainPage;

/**
 * Тест проверяет открытие раздела "Документация"
 */
public class OpenDocumentationTest extends BaseTest {

    /**
     * Тест открытия страницы "Документация"
     */
    @Test
    void documentationShouldOpenInNewTab() {
        MainPage mainPage = new MainPage();
        mainPage.documentationLink().open();

        DocumentationPage.switchTo()
                .shouldBeOpened();
    }
}