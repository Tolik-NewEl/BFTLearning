package page.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class Picture {
    private String name;
    private SelenideElement selector;

    public Picture(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    @Step("Проверяем видимость")
    public void viewCheck(){
        selector.shouldBe(Condition.visible);
    }

    @Step("Проверяем наличие текста")
    public String viewAttributText(String attribut){
        return selector.getDomAttribute(attribut);
    }
}
