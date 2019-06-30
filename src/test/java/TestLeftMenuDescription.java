import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuDescription extends TestBrowser {

    String expectedResult = "Википедия — свободная энциклопедия";

    @Test
    public void testDescription() throws InterruptedException {
        mainPage.clickDescription();
            System.out.println(driver.getTitle());
            Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
