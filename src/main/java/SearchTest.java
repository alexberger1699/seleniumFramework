import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.io.File;

public class SearchTest {
        @Test
        public void  openGoogleComInChromeTest(){
                File file = new File("/Users/alex/seleniumFramework/src/resources/chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                WebDriver driver = new ChromeDriver();
                driver.navigate().to("https://www.google.com/");
                System.out.println(driver.getTitle());
                WebElement searchField = driver.findElement(By.name("q"));


                driver.quit();
        }



        }
