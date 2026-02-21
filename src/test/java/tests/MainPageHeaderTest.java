package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Тесты отображения верхней панели на главной странице
 */
public class MainPageHeaderTest extends BaseTest {

    /**
     * Тест проверяет видимость верхней панели
     */
    @Test
    void mainPage_shouldShowHeader() {
        MainPage mainPage = new MainPage();
        assertTrue(mainPage.header().isDisplayed(), "Header должен отображаться на главной странице");
    }

    /**
     * Тест проверяет наличие логотипа в верхней панели
     */
    @Test
    void mainPage_shouldShowLogoInHeader() {
        MainPage mainPage = new MainPage();
        assertTrue(mainPage.header().isLogoDisplayed(), "Логотип Selectel должен отображаться в header на главной странице");
    }
}