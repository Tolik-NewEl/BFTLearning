package page;

import io.qameta.allure.Step;
import page.elements.Picture;

import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {
    protected final Picture logo = new Picture("Логотип Википедия", $x("//div[@class='branding-box']"));
    protected final Picture logoText = new Picture("Лого", $x("//div[@class='branding-box']/a/span/img"));

    @Step("Проверяем наличие лого Википедия")
    public boolean logoVisibleCheck(){
        logo.viewCheck();
        return true;
    }

    @Step("Проверяем атрибут лого")
    public String getLogoText(){
        return logoText.viewAttributText("alt");
    }
}