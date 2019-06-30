import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuRecentChanges extends TestBrowser {

    String expectedResult = "Свежие правки — Википедия";

    @Test
    public void testRecentChanges() throws InterruptedException {
        mainPage.clickRecentChanges();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
