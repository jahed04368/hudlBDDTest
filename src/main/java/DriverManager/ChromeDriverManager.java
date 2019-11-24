package DriverManager;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends DriverManager {

    @Before
    public void createWebDriver(){


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/Resources/chromedriver 5");
        ChromeOptions options =new ChromeOptions();
        //browser here
        this.driver =new ChromeDriver(options);
        this.driver.manage().window().maximize();
        this.driver.manage().window().fullscreen();
        this.driver.manage().deleteAllCookies();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    @After
    public void tearDown() {
        this.driver.manage().deleteAllCookies();
        this.driver.close();
        this.driver.quit();
    }
}
