package StepDefination;

import BasePage.DriverClass;
import PageObjectPattern.HomePage;
import PageObjectPattern.SearchItemPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class Search_sd extends DriverClass {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() throws IOException {
       driver.get(getProperty("url"));
    }
    @Given("^I verify Homepage url as \"([^\"]*)\"$")
    public void iVerifyHomepageUrlAs(String expUrl)  {
        new HomePage().verifyUrl(expUrl);
    }
    @Given("^I enter search item in search bar as\"([^\"]*)\"$")
    public void iEnterSearchItemInSearchBarAs(String searchItem)  {
        new HomePage().setSearch(searchItem);

    }

    @Then("^I should search item page$")
    public void iShouldSearchItemPage() {
        new SearchItemPage().verifySearchPage();
    }

    @And("^I verify the search item page title is \"([^\"]*)\"$")
    public void iVerifyTheSearchItemPageTitleIs(String pageTitle)  {
        new SearchItemPage().verifyPageTitle(pageTitle);

    }
}
