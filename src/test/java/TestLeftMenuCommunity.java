import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuCommunity extends TestBrowser {

    String expectedResult = "Википедия:Сообщество — Википедия";

    @Test
    public void testCommunity() throws InterruptedException {
        mainPage.clickCommunity();
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
