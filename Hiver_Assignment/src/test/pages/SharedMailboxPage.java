package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SharedMailboxPage {

    WebDriver driver;

    public SharedMailboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "div.h-trow.h-pointer")
     List<WebElement> sharedMailboxes;

    @FindBy(xpath="//span[contains(text(),'HR')]")
     WebElement sharedEmail;

    @FindBy(xpath="//div[@class='c0136']/child::a/div//span[contains(text(),'Auto Responder')]")
     WebElement autoResponder;

    public void mailboxIcon() throws Exception {
        Assert.assertTrue(sharedMailboxes.size()>0,"No Shared E-mail's are present");
    }

    public void selectARecord() throws Exception {
        sharedEmail.click();
    }

    public void selectAutoResponder() throws Exception {
        autoResponder.click();
    }
}
