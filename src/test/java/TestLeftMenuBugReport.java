import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuBugReport extends TestBrowser {

    String expectedResult = "Сообщение об ошибке";

    @Test
    public void testBugReport() throws InterruptedException {
        mainPage.clickBugReport();
        System.out.println(mainPage.getTextBugReport());
        Assert.assertEquals(expectedResult,mainPage.getTextBugReport());
    }
}
