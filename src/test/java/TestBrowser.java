import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.MainPage;
import pageObject.StartPage;
import sun.applet.Main;

import java.util.concurrent.TimeUnit;

public class TestBrowser {

    StartPage startPage;
    MainPage mainPage;
    ChromeDriver driver;

    @Before
    public void createBrowser() {
        System.getProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
        startPage = new StartPage(driver);
        mainPage = new MainPage(driver);
        startPage.goStartWikiPageRu();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}

