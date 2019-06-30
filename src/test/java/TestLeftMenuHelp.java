import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuHelp extends TestBrowser {

    String expectedResult = "Википедия:Справка — Википедия";

    @Test
    public void testHelp() throws InterruptedException {
        mainPage.clickHelp();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
