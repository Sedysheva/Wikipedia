import org.junit.Assert;
import org.junit.Test;

public class TestStartPageLanguage extends TestBrowser {

    @Test
    public void testRubric() throws InterruptedException {
        driver.navigate().back();
        startPage.goStartWikiPageEn();
        driver.navigate().back();
        startPage.goStartWikiPageEs();
        driver.navigate().back();
        startPage.goStartWikiPageIt();
        driver.navigate().back();
        startPage.goStartWikiPagePt();
        driver.navigate().back();
        startPage.goStartWikiPageJa();
        driver.navigate().back();
        startPage.goStartWikiPageDe();
        driver.navigate().back();
        startPage.goStartWikiPageFr();
        driver.navigate().back();
        startPage.goStartWikiPageZh();
        driver.navigate().back();
        startPage.goStartWikiPagePl();
        driver.navigate().back();
    }
}
