package page.elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class Input {
    private String name;
    private SelenideElement selector;

    public Input(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    @Step("Кликаем на Input")
    public void click(){
        selector.click();
    }

    @Step("Вводим значение")
    public void setValue(String value){
        selector.shouldBe(visible, ofSeconds(10))
                .setValue(value);
    }

    @Step("Нажимаем Enter")
    public void sendEnter(){
        selector.sendKeys(Keys.ENTER);
    }
}
