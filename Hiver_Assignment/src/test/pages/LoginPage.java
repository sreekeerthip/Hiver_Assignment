package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using="//input[@type='email']")
    WebElement userName;

    @FindBy(css="div.VfPpkd-RLmnJb")
    WebElement nextBtn;

    @FindBy(xpath="//input[@name='password']")
    WebElement pwd;

    @FindBy(css="div.VfPpkd-RLmnJb")
    WebElement submitBtn;


    public void enterEmail(String emailId) {
        userName.sendKeys(emailId);
    }

    public void clickOnNextBtn() {
            nextBtn.click();
    }
    public void enterPwd(String password) {
        pwd.sendKeys(password);
    }
    public void clickOnSubmitBtn() {
        submitBtn.click();
    }

}
