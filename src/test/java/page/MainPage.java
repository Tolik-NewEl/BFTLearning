package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    protected final SelenideElement searchFieldBefore = $x("//input[@class='search skin-minerva-search-trigger']");
    protected final SelenideElement searchFieldAfter = $x("//input[@class='search mf-icon-search']");

    @Step("Открываем страницу сайта")
    public MainPage openPage(String url){
        open(url);
        return this;
    }

    @Step("Нажимаем на Инпут для ввода значения")
    public MainPage searchInputClick(){
        searchFieldBefore.click();
        return this;
    }

    @Step("Вводим текст для поиска")
    public MainPage inputText(String value){
        searchFieldAfter.setValue(value);
        return this;
    }

    @Step("Нажимаем Enter")
    public SearchResultPage pressEnter(){
        searchFieldAfter.sendKeys(Keys.ENTER);
        return new SearchResultPage();
    }
}
