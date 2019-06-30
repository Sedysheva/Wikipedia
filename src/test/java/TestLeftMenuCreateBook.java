import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuCreateBook extends TestBrowser {

    String expectedResult = "Создание книги — Википедия";

    @Test
    public void testCreateBook() throws InterruptedException {
        mainPage.clickCreateBook();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
