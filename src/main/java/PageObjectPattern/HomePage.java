package PageObjectPattern;

import BasePage.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class HomePage extends DriverClass {
 @FindBy(id="site-search")
    WebElement search;








    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void setSearch(String text){
        sendTextToElement(search,text);
//        search.sendKeys("jeans");
        search.sendKeys(Keys.ENTER);
    }
    public void verifyUrl(String url){
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
        log.info("HomePage Url is "+actualUrl+ " is verified");
    }
}
