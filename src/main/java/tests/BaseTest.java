package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import steps.SearchSteps;
import utils.Browser;
import utils.DriverFactory;

import java.io.File;

public class BaseTest {


    public static WebDriver driver;
    SearchSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }


    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to("https://www.tami4.co.il/");
        steps = new SearchSteps();

    }

    @AfterMethod
    public void tearDown() {
        //driver.navigate().back();
        //driver.quit();

    }

    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"selenium java"}, {"selenium javascript"}};

    }
}
