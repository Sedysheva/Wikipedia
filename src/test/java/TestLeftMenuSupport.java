import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuSupport extends TestBrowser {

    String expectedResult = "Сделайте пожертвование сейчас — Donate";

    @Test
    public void testSupport() throws InterruptedException {
        mainPage.clickSupport();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
