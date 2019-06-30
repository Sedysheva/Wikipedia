import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuForum extends TestBrowser {

    String expectedResult = "Википедия — свободная энциклопедия";

    @Test
    public void testForum() throws InterruptedException {
        mainPage.clickForum();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
