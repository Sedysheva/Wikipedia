import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuNewPages extends TestBrowser {

    String expectedResult = "Новые страницы — Википедия";

    @Test
    public void testNewPages() throws InterruptedException {
        mainPage.clickNewPages();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
