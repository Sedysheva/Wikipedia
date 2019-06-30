import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuIndex extends TestBrowser {

    String expectedResult = "Википедия:Алфавитный указатель — Википедия";

    @Test
    public void testRubric() throws InterruptedException {
        mainPage.clickIndex();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
