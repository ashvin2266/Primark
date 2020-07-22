package PageObjectPattern;

import BasePage.DriverClass;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItemPage extends DriverClass {

@FindBy(xpath = "//li[@class='breadcrumb__item breadcrumbs__item--active']")
    WebElement headingOfPage;
@FindBy(xpath = "//button[@class='cookie-message__close handle js-cookie-notification-accept']")
WebElement cookies;





    public SearchItemPage(){
        PageFactory.initElements(driver,this);
    }
    public void verifySearchPageTitle(String pageTitle){
        verifyPageTitle(pageTitle);

    }
    public void verifySearchPage(){
        headingOfPage.isDisplayed();
        String expected ="Search Results";
        String headingOfpage=headingOfPage.getText();
        Assert.assertEquals(expected,headingOfpage);
        cookies.click();
        log.info("Heading of search page is "+headingOfpage+ " is verified");


    }
}
