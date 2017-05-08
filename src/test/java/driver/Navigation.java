package driver;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;


public class Navigation {

    @Step("Navigate To <url>")
    public void navigateTo(String url) {
        Driver.webDriver.get(url);
        WebElement title = Driver.webDriver.findElement(By.tagName("title"));
        System.out.println(title);
        Assert.assertTrue(Driver.webDriver.getTitle().contains("Gauge"));
        System.out.println("Successfully navigated to Gauge page");
        Driver.webDriver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        Gauge.writeMessage("Page title is ", driver.Driver.webDriver.getTitle());
    }

    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws Exception {
        Driver.webDriver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        WebElement getStartedButton = driver.Driver.webDriver.findElement(By.xpath("html/body/header/div/nav/ul/li[2]/a"));
        getStartedButton.click();
        Gauge.writeMessage("Page title is ", driver.Driver.webDriver.getTitle());
        System.out.println("get started page");
    }

    @Step("Open contribute page")
    public void openContributePage() {
        Driver.webDriver.findElement(By.linkText("Contribute")).click();
    }

    @Step ("Open gauge documentation")
    public void openDocs() {
        Driver.webDriver.findElement(By.linkText("Documentation")).click();
    }
}
