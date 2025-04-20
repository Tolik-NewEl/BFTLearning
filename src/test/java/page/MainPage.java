package page;

import io.qameta.allure.Step;
import page.elements.Input;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    protected final Input searchFieldBefore = new Input("Инпут Искать в Википедии", $x("//input[@class='search skin-minerva-search-trigger']"));
    protected final Input searchFieldAfter = new Input("Инпут поиска после нажатия", $x("//input[@class='search mf-icon-search']"));

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
        searchFieldAfter.sendEnter();
        return new SearchResultPage();
    }
}
