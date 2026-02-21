package pages.utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;
import java.util.Set;

import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Переход на другую владку
 */
public final class TabSwitcher {

    private TabSwitcher() {
    }

    /**
     * Переключается на вкладку, URL которой начинается с заданного префикса
     *
     * @param urlPrefix URL-префикс, например "https://docs.selectel.ru/"
     * @param timeout   максимальное ожидание появления/открытия вкладки
     * @return handle вкладки, на которую переключились
     * @throws IllegalStateException если вкладка не найдена за timeout
     */
    public static String switchToTabByUrlPrefix(String urlPrefix, Duration timeout) {
        String originalWindow = WebDriverRunner.getWebDriver().getWindowHandle();

        Selenide.Wait()
                .withTimeout(timeout)
                .until(driver -> WebDriverRunner.getWebDriver().getWindowHandles().size() > 1);

        Set<String> handles = WebDriverRunner.getWebDriver().getWindowHandles();
        for (String handle : handles) {
            if (handle.equals(originalWindow)) continue;

            switchTo().window(handle);
            if (WebDriverRunner.url().startsWith(urlPrefix)) {
                return handle;
            }
        }

        throw new IllegalStateException("Не найдена вкладка с URL, начинающимся на: " + urlPrefix);
    }

    /**
     * Переключение назад на исходную вкладку
     */
    public static void switchToTab(String windowHandle) {
        switchTo().window(windowHandle);
    }
}