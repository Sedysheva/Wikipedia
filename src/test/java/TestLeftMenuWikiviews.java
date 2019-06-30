import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuWikiviews extends TestBrowser {

    String expectedResult = "Заглавная страница - Wikispecies";

    @Test
    public void testWikiviews() throws InterruptedException {
        mainPage.clickWikiVews();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
