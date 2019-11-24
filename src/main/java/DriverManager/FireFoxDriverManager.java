package DriverManager;


import cucumber.api.java.After;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class FireFoxDriverManager extends DriverManager{

    @Override
    public void createWebDriver(){


        System.setProperty("webdriver.firefox.marionette",
                "src/main/resources/Resources/geckodriver");
        FirefoxOptions options =new FirefoxOptions();

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        //WebDriver driver = new FirefoxDriver(capabilities);

        this.driver =new FirefoxDriver(options);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
        this.driver = null;

    }
}
