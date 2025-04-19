package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {
    protected final SelenideElement logo = $x("//div[@class='branding-box']");
    protected final SelenideElement logoText = $x("//div[@class='branding-box']/a/span/img");

    @Step("Проверяем наличие лого Википедия")
    public boolean logoVisibleCheck(){
        logo.shouldBe(Condition.visible);
        return true;
    }

    @Step("Проверяем атрибут лого")
    public String getLogoText(){
        return logoText.getDomAttribute("alt");
    }
}