package StepsDef;

import Locators.LocatorsUtility;
import DriverManager.DriverManager;
import DriverManager.DriverManagerFactory;
import DriverManager.DriverType;
import Locators.Locators;
import Utilities.waitFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class loginStepsDef {

    DriverManager driverManager;
    WebDriver driver;


    @Given("user is on Hudl login page")
    public void user_is_on_Hudl_login_page() {

        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.hudl.com/");
        driver.findElement(LocatorsUtility.getBy(Locators.hudlHomepage.loginButton)).click();
    }

    @When("the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_enters_and(String Username, String Password) {

        driver.findElement(LocatorsUtility.getBy(Locators.hudlHomepage.email)).sendKeys(Username);
        driver.findElement(LocatorsUtility.getBy(Locators.hudlHomepage.password)).sendKeys(Password);

    }

    @When("clicks login")
    public void clicks_login() {
        driver.findElement(LocatorsUtility.getBy(Locators.hudlHomepage.loginButton2)).click();
    }

    @Then("User is shown their homepage")
    public void user_is_shown_their_homepage() {
        //driver.close();
        System.out.println("User log into their account successfully");
    }

    @Then("User is shown error message")
    public void error_message() {

        WebElement passwordErrorMessage = driver.findElement(LocatorsUtility.getBy(Locators.hudlHomepage.invalidEmailOrPassword));
        waitFunction.waitForElementTobeVisibile(driver, passwordErrorMessage, 10000);

        String errorMessage = driver.findElement(LocatorsUtility.getBy(Locators.hudlHomepage.invalidEmailOrPassword)).getText();
        //Thread.sleep(3000);
        System.out.println(errorMessage);
        String actualErrormessage = "We didn't recognize that email and/or password. Need help?";
        Assert.assertEquals(errorMessage, actualErrormessage);
        System.out.println(errorMessage);

    }

    @When("user searches for \"([^\"]*)\"$")
    public void the_user_enters_and(String Team) {

        //WebElement searchTextBox = driver.findElement(LocatorsUtility.getBy(Locators.usersHome.searchTextBox));
        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.usersHome.searchTextBox)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.searchTextBox)).sendKeys(Team);
        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.liverpoolLink)).click();

    }

    @Then("user watches a video and logs out")
    public void videoAndReact() {

        //WebElement searchTextBox = driver.findElement(LocatorsUtility.getBy(Locators.usersHome.searchTextBox));
        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.usersHome.yourTeam)), 120);
        //driver.findElement(LocatorsUtility.getBy(Locators.usersHome.searchTextBox)).sendKeys(Team);
        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.yourTeam)).click();
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.usersHome.frame)), 120);
        waitFunction.waitForElementToBeClickable(driver, driver.findElement(LocatorsUtility.getBy(Locators.usersHome.video)), 200);
        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.video)).click();

        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(LocatorsUtility.getBy(Locators.usersHome.profile));
        //WebElement item = driver.findElement(by.cssSelector("css selector values for Búsqueda"));
        action.moveToElement(menu).click().build().perform();

        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.profile)).click();
        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.logOut)).click();

    }
}
