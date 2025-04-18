package test;

import org.junit.jupiter.api.Test;
import page.MainPage;
import page.SearchResultPage;
import settings.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

class MainPageTest extends BaseTest {

    @Test
    public void isSearchWork(){
        SearchResultPage searchResultPage = new MainPage()
                .openPage("https://ru.m.wikipedia.org/wiki/")
                .searchInputClick()
                .inputText("БФТ-Холдинг")
                .pressEnter();
        assertTrue(searchResultPage.logoVisibleCheck());
        assertEquals(searchResultPage.getLogoText(), "Википедия");
    }
}