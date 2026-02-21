package pages.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Header extends BaseElement {

    private static final SelenideElement ROOT = $("div.header-main__inner");

    public Header() {
        super(ROOT);
    }

    public SelenideElement logo() {
        return baseElement.$("a.header-main__logo");
    }

    public boolean isLogoDisplayed() {
        return logo().isDisplayed();
    }
}