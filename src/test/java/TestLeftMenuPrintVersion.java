import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuPrintVersion extends TestBrowser {

    String expectedResult = "";

    @Test
    public void testPrintVersion() throws InterruptedException {
        mainPage.clickPrintVersion();
        System.out.println(mainPage.getTextPrintVersion());
        //Assert.assertEquals(expectedResult,mainPage.detTextPrintVersion());
    }
}
