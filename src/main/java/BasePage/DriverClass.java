package BasePage;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class DriverClass {
    public static WebDriver driver;
    public static Properties prop;
    public static Logger log= LogManager.getLogger(DriverClass.class.getName());

    public String getProperty(String key) throws IOException {

        prop = new Properties();
        FileInputStream file = new FileInputStream("src/main/java/PropertyFile/Configuration.properties");
        prop.load(file);
        return prop.getProperty(key);
    }

    public void OpenBrowser() throws IOException {

        String browser = getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            log.info("Chrome browser is opened");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }
    public  String TakeAscreenShot( Scenario scenario) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String  ScreenShotPath = "./target/screenshots/"+scenario.getName()+dateName+".png";
        Reporter.addScreenCaptureFromPath(ScreenShotPath);
        try {
            FileUtils.copyFile(srcFile, new File("./target/screenshots/"+scenario.getName()+dateName+".png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return ScreenShotPath;
    }
    public void closeBrowser(){
        driver.close();
    }
//    This method click on elements
    public void clickOnElement(WebElement element){
        element.click();
    }
//    This method  send  text on element
    public void sendTextToElement(WebElement element,String text){
        element.sendKeys(text);
    }
//    this method verify page title
    public void verifyPageTitle(String pageTitle){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(pageTitle,actualTitle);
        log.info("Page title of this page is "+pageTitle+ " is verified");
    }


}
