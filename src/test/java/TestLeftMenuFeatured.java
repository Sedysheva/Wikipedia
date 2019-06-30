import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuFeatured extends TestBrowser {

    String expectedResult = "Википедия:Избранные статьи — Википедия";

    @Test
    public void testFeatured() throws InterruptedException {
        mainPage.clickFeatured();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
