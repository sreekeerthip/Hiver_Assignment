package test.scenario;


import org.testng.annotations.Test;
import test.pages.*;
import java.io.FileInputStream;
import java.util.Properties;


public class HiverTest extends Base {

    @Test
public void login() throws Exception
    {
        Properties obj = new Properties();
        FileInputStream confFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\config.properties");
        obj.load(confFile);
        String implicitlyWait = obj.getProperty("IMPLICIT_WAIT");
        LoginPage lp= new LoginPage(driver);
        lp.clickOnNextBtn();
       Thread.sleep(4000);
        lp.enterPwd(obj.getProperty("password"));
        lp.clickOnSubmitBtn();

        GmailHomePage ghPage= new GmailHomePage(driver);
        ghPage.clickOnNonLoggedInHiverBtn();
        ghPage.clickOnLoginToHiverBtn();
        waitUntilGmailLoad();
        ghPage.hIcon();
        ghPage.selectAdminPanel();


        DashboardPage dbPage=new DashboardPage(driver);
        waitUntilPageLoad();
        dbPage.mailboxIcon();

        SharedMailboxPage smbPage=new SharedMailboxPage(driver);
        smbPage.mailboxIcon();
        smbPage.selectARecord();
        smbPage.selectAutoResponder();

        AutoResponsePage arPage=new AutoResponsePage(driver);
        arPage.enableButton();
        arPage.enterTheMsg();
        arPage.clickOnSaveBtn();
        arPage.validationOfSuccessfullSaveMsg();
    }

}
