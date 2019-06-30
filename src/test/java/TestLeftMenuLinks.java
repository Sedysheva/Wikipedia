import org.junit.Assert;
import org.junit.Test;

public class TestLeftMenuLinks extends TestBrowser {

    String expectedResult = "Страницы, ссылающиеся на «Заглавная страница» — Википедия";

    @Test
    public void testLinks() throws InterruptedException {
        mainPage.clickLinks();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
