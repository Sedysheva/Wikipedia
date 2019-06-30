import org.junit.Test;
import pageObject.MainPage;

public class TestMainPageLMDescription extends TestBrowser {

    @Test
    public void testDescription() {

        mainPage.clickDescription();
        mainPage.clickRubric();
        mainPage.clickIndex();
        mainPage.clickFeatured();
        mainPage.clickRandom();
        mainPage.clickCurrentEvents();
        mainPage.clickBugReport();
        mainPage.clickCommunity();
        mainPage.clickForum();
        mainPage.clickRecentChanges();
        mainPage.clickNewPages();
        mainPage.clickHelp();
        mainPage.clickSupport();
        mainPage.clickLinks();
        mainPage.clickChanges();
        mainPage.clickSpecialPages();
        mainPage.clickCreateBook();
        mainPage.clickPrintVersion();
        mainPage.clickWikiVews();
    }

}
