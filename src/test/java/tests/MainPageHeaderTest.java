package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageHeaderTest extends BaseTest {

    @Test
    void mainPage_shouldShowHeader() {
        MainPage mainPage = new MainPage();
        assertTrue(mainPage.header().isDisplayed(), "Header должен быть видимым на главной странице");
    }

    @Test
    void mainPage_shouldShowLogoInHeader() {
        MainPage mainPage = new MainPage();
        assertTrue(mainPage.header().isLogoDisplayed(), "Логотип должен быть видимым в header на главной странице");
    }
}