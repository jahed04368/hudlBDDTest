package StepsDef;

import DriverManager.DriverManager;
import Locators.Locators;
import Locators.LocatorsUtility;
import Utilities.waitFunction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManagerFactory;
import DriverManager.DriverType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class signUpStepsDef {

    DriverManager driverManager;
    WebDriver driver;

    @When("user is on sign up page")
    public void user_clicks_on_sign_up() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.hudl.com/register/signup");

    }

    @When("user enters about organization")
    public void user_enters_about_organization() {

        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.signUp.newTeam)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.newTeam)).click();
        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.signUp.continueButton)), 120);
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(LocatorsUtility.getBy(Locators.signUp.secondarySchool));
        action.moveToElement(menu).click().build().perform();
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.continueButton)).click();
    }

    @When("user selects sport")
    public void user_selects_sport() {

        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.signUp.football)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.football)).click();

    }

    @When("user selects their package")
    public void user_selects_their_package() {

        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.signUp.goldPackage)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.goldPackage)).click();
    }

    @When("user enters relevant information")
    public void user_enters_and() {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);

        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.signUp.createAccount)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.organizationName)).sendKeys("Jahed's Organization");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.teamName)).sendKeys("Liverpool FC");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.leagueName)).sendKeys("Premier League");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.address)).sendKeys("41 Monopoly Close");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.address2)).sendKeys("Test Town");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.city)).sendKeys("London");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.postalCode)).sendKeys("W6 9DL");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.firstName)).sendKeys("Jahed");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.lastName)).sendKeys("Miah");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.email)).sendKeys("random"+randomInt+"@gmail.com");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.password)).sendKeys("Passw0rd");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.phoneNumber)).sendKeys("7983431778");
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.createAccount)).click();
    }

    @Then("user is redirected to homepage")
    public void user_is_redirected_to_homepage() {

        waitFunction.waitForElementTobeVisibile(driver, driver.findElement(LocatorsUtility.getBy(Locators.signUp.letsGo)), 120);
        driver.findElement(LocatorsUtility.getBy(Locators.signUp.letsGo)).click();
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(LocatorsUtility.getBy(Locators.usersHome.profile));
        //WebElement item = driver.findElement(by.cssSelector("css selector values for Búsqueda"));
        action.moveToElement(menu).click().build().perform();

        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.profile)).click();
        driver.findElement(LocatorsUtility.getBy(Locators.usersHome.logOut)).click();

    }
}
