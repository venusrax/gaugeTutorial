package driver;

import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;


public class Driver {

    //Holds the WebDriver instance
    public static WebDriver webDriver;

    //Initialize a Webdriver instance of required browser
    @BeforeScenario
    public void initializeDriver() {
        webDriver = DriverFactory.getDriver();
    }

    //Close the WebDriver instance
    //@AfterScenario
    /*public void closeDriver() {
        webDriver.quit();
    }*/

}
