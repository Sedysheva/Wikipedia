package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainPage {

    private ChromeDriver driver;

    By wikiMainPageDescription = By.xpath("//li[@id=\"n-mainpage-description\"]/a");
    By wikiMainPAgeRubric = By.xpath("//li[@id=\"n-browse\"]");
    By wikiMainPageIndexAB = By.xpath("//li[@id=\"n-index\"]");
    By wikiMainPageFeatured = By.xpath("//li[@id=\"n-featured\"]");
    By wikiMainPageRandom = By.xpath("//li[@id=\"n-randompage\"]");
    By wikiMainPageRandomText = By.xpath("//a[text()=\"Случайная статья\"]");
    By wikiMainPageCurrentEvents = By.xpath("//li[@id=\"n-currentevents\"]");
    By wikiMainPageBugReport = By.xpath("//li[@id=\"n-bug_in_article\"]");
    By wikiMainPageBugReportText = By.xpath("//label[@title=\"Сообщение об ошибке\"]");
    By wikiMainPageCommunity = By.xpath("//li[@id=\"n-portal\"]");
    By wikiMainPageForum = By.xpath("//li[@id=\"n-forum\"]");
    By wikiMainPageRecentChanges = By.xpath("//li[@id=\"n-recentchanges\"]");
    By wikiMainPageNewPages = By.xpath("//li[@id=\"n-newpages\"]");
    By wikiMainPageHelp = By.xpath("//li[@id=\"n-help\"]/a");
    By getWikiMainPageSupport = By.xpath("//li[@id=\"n-sitesupport\"]");
    By wikiMainPageLinks = By.xpath("//li[@id=\"t-whatlinkshere\"]");
    By wikiMainPageChanges = By.xpath("//li[@id=\"t-recentchangeslinked\"]");
    By wikiMainPageSpecialPages = By.xpath("//li[@id=\"t-specialpages\"]");
    By wikiMainPageCreateBook = By.xpath("//li[@id=\"coll-create_a_book\"]");
    By wikiMainPagePrintVersion = By.xpath("//li[@id=\"t-print\"]");
    By wikiMainPagePrintVersionText = By.xpath("//li[@id=\"t-print\"]/a[text()=\"Версия для печати\"]");
    By wikiMainPageWikivews = By.xpath("//a[text()=\"Викивиды\"]");

    public MainPage(ChromeDriver driver) {
        this.driver=driver;
    }

    private void clickMainPageLefMenu(By Description) {
        WebElement descriptionElement = driver.findElement(Description);
        descriptionElement.click();
    }

    public void clickDescription() {
        clickMainPageLefMenu(wikiMainPageDescription);
    }

    public void clickRubric() {
        clickMainPageLefMenu(wikiMainPAgeRubric);
    }

    public void clickIndex() {
        clickMainPageLefMenu(wikiMainPageIndexAB);
    }

    public void clickFeatured() {
        clickMainPageLefMenu(wikiMainPageFeatured);
    }

    public void clickRandom() {
        clickMainPageLefMenu(wikiMainPageRandom);
    }

    public void clickCurrentEvents() {
        clickMainPageLefMenu(wikiMainPageCurrentEvents);
    }

    public void clickBugReport() {
        clickMainPageLefMenu(wikiMainPageBugReport);
    }

    public void clickCommunity() {
        clickMainPageLefMenu(wikiMainPageCommunity);
    }

    public void clickForum() {
        clickMainPageLefMenu(wikiMainPageForum);
    }
    public void clickRecentChanges() {
        clickMainPageLefMenu(wikiMainPageRecentChanges);
    }

    public void clickNewPages() {
        clickMainPageLefMenu(wikiMainPageNewPages);
    }

    public void clickHelp() {
        clickMainPageLefMenu(wikiMainPageHelp);
    }

    public void clickSupport() {
        clickMainPageLefMenu(getWikiMainPageSupport);
    }

    public void clickLinks() {
        clickMainPageLefMenu(wikiMainPageLinks);
    }

    public void clickChanges() {
        clickMainPageLefMenu(wikiMainPageChanges);
    }

    public void clickSpecialPages() {
        clickMainPageLefMenu(wikiMainPageSpecialPages);
    }

    public void clickCreateBook() {
        clickMainPageLefMenu(wikiMainPageCreateBook);
    }

    public void clickPrintVersion() {
        clickMainPageLefMenu(wikiMainPagePrintVersion);
    }

    public void clickWikiVews() {
        clickMainPageLefMenu(wikiMainPageWikivews);
    }

    public String getTextBugReport() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement bugReportElement = driver.findElement(wikiMainPageBugReportText);
        return bugReportElement.getText();
    }

     public String getTextPrintVersion() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement printVersionElement = driver.findElement(wikiMainPagePrintVersionText);
        return printVersionElement.getText();
    }

    public String getTextRandom() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        WebElement randomElement = driver.findElement(wikiMainPageRandomText);
        return randomElement.getText();
    }
}
