package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartPage {

    ChromeDriver driver;

    public StartPage(ChromeDriver driver) {
            this.driver=driver;
        }

    public void goStartWikiPageRu(){
        WebElement startWikiPageRu = driver.findElement(By.xpath("//a[@id=\"js-link-box-ru\"]"));
        startWikiPageRu.click();
    }

    public void goStartWikiPageEn(){

        WebElement startWikiPageEn = driver.findElement(By.xpath("//a[@id=\"js-link-box-en\"]"));
        startWikiPageEn.click();
    }

    public void goStartWikiPageEs(){

        WebElement startWikiPageEs = driver.findElement(By.xpath("//a[@id=\"js-link-box-es\"]"));
        startWikiPageEs.click();
    }

    public void goStartWikiPageIt(){

        WebElement startWikiPageIt = driver.findElement(By.xpath("//a[@id=\"js-link-box-it\"]"));
        startWikiPageIt.click();
    }

    public void goStartWikiPagePt(){

        WebElement startWikiPagePt = driver.findElement(By.xpath("//a[@id=\"js-link-box-pt\"]"));
        startWikiPagePt.click();
    }

    public void goStartWikiPageJa(){

        WebElement startWikiPageJa = driver.findElement(By.xpath("//a[@id=\"js-link-box-ja\"]"));
        startWikiPageJa.click();
    }

    public void goStartWikiPageDe(){

        WebElement startWikiPageDe = driver.findElement(By.xpath("//a[@id=\"js-link-box-de\"]"));
        startWikiPageDe.click();
    }

    public void goStartWikiPageFr(){

        WebElement startWikiPageFr = driver.findElement(By.xpath("//a[@id=\"js-link-box-fr\"]"));
        startWikiPageFr.click();
    }

    public void goStartWikiPageZh(){

        WebElement startWikiPageZh = driver.findElement(By.xpath("//a[@id=\"js-link-box-zh\"]"));
        startWikiPageZh.click();
    }

    public void goStartWikiPagePl(){

        WebElement startWikiPagePl = driver.findElement(By.xpath("//a[@id=\"js-link-box-pl\"]"));
        startWikiPagePl.click();
    }


}
