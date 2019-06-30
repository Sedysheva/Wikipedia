import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuCurrentEvents extends TestBrowser {

    String expectedResult = "Портал:Текущие события — Википедия";

    @Test
    public void testCurrentEvents() throws InterruptedException {
        mainPage.clickCurrentEvents();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
