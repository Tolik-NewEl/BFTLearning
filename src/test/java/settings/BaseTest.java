package settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        Configuration.headless = false;
    }
    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
