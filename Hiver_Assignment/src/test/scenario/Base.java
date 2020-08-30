package test.scenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Base {
     WebDriver driver;

    @BeforeSuite
    public void initializeTheBrowser()  {
        WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src\\main\\resources\\extension\\5.6_0.crx"));
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void TeardownTest() {
        driver.quit();
    }

    @Test
    public void waitUntilPageLoad()
    {
        String xpath = "//img[@src='/images/newIframe/spinner-identity.gif']]";
        (new WebDriverWait(driver,20)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }
    @Test
    public void waitUntilGmailLoad()
    {
       String css= "div.MyvhI.sUoeld>span.l3q5xe.SQxu9c";
        (new WebDriverWait(driver,40)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(css)));
    }

}
