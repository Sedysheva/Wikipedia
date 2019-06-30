import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuSpecialPages extends TestBrowser {

    String expectedResult = "Служебные страницы — Википедия";

    @Test
    public void testSpecialPages() throws InterruptedException {
        mainPage.clickSpecialPages();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
