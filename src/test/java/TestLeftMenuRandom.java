import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuRandom extends TestBrowser {

    String expectedResult = "Случайная статья";

    @Test
    public void testRandom() throws InterruptedException {
        mainPage.clickRandom();
        System.out.println(mainPage.getTextRandom());
        Assert.assertEquals(expectedResult,mainPage.getTextRandom());
    }
}
