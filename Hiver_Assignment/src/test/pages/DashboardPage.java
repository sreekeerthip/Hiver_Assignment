package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(css="a[href='/app/sharedmailbox?appview=gmail&usersession=693936']")
     WebElement sharedMailbox;

    public void mailboxIcon() throws Exception{
        driver.switchTo().frame("Hiver_iframe_content");
        driver.switchTo().frame("iframe_handler");
        sharedMailbox.click();


    }
}
