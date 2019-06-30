import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuChanges extends TestBrowser {

    String expectedResult = "Связанные правки — Википедия";

    @Test
    public void testChanges() throws InterruptedException {
        mainPage.clickChanges();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
