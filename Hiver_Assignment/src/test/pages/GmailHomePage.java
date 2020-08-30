package test.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailHomePage {

    WebDriver driver;

    public GmailHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(css="div#hq-accounts-icon")
     WebElement hiverIcon;

    @FindBy(css="div.admin-guider")
    WebElement adminPanel;

    @FindBy(css="div.h-h1")
    WebElement dashboardPage;

    @FindBy(css="a.hiver-loginTohiver-btn")
    WebElement loginToHiverBtn;

    @FindBy(css="div[class='hiver-nonLogged-btn']")
    WebElement hiverNonLoggedBtn;

    public void hIcon()
    {
        hiverIcon.click();

    }

    public void selectAdminPanel()
    {
        (new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOf(adminPanel)).click();

    }

    public void clickOnNonLoggedInHiverBtn()

    {
        (new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOf(hiverNonLoggedBtn)).click();

    }

    public void clickOnLoginToHiverBtn()
    {

        loginToHiverBtn.click();
    }

}
