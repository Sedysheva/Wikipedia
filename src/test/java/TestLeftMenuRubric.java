import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuRubric extends TestBrowser {

    String expectedResult = "Википедия:Поиск по категориям — Википедия";

    @Test
    public void testRubric() throws InterruptedException {
        mainPage.clickRubric();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
