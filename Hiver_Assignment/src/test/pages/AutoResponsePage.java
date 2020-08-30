package test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoResponsePage {

    WebDriver driver;

    public AutoResponsePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css="div.Toastify__toast-body")
     WebElement enabledMsg;

    @FindBy(css="iframe[title='Rich Text Editor, editor1']")
     WebElement enterText;

    @FindBy (css="div.h-app-titlebar>div:nth-child(2)>div>label")
    WebElement ckBox;

    @FindBy (css="button.h-primary-button")
    WebElement element;

    public void enableButton() throws Exception {
        ckBox.click();
    }
    public void enterTheMsg() throws Exception {
        (new WebDriverWait(driver, 40)).until(ExpectedConditions.visibilityOf(driver.findElement(By.className("cke_wysiwyg_frame"))));
        WebElement iframe = driver.findElement(By.className("cke_wysiwyg_frame"));
        driver.switchTo().frame(iframe);
        WebElement el = driver.findElement(By.cssSelector("body"));
        el.sendKeys("Your Ticket is Resolved");
        driver.switchTo().defaultContent();
    }
    public void clickOnSaveBtn() throws Exception{

        driver.switchTo().frame("Hiver_iframe_content");
        driver.switchTo().frame("iframe_handler");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void validationOfSuccessfullSaveMsg() throws Exception{
        System.out.println(enabledMsg.getText());
        Assert.assertTrue((enabledMsg.getText()).contains("edited"),"Auto Responder message is not popped");
    }
}
