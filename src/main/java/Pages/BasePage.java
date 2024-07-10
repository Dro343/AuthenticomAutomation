package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public static WebDriver browserLaunch() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
       driver = new ChromeDriver();
        ///System.setProperty("webdriver.edge.driver", "src/main/resources/Drivers/msedgedriver.exe");
        //driver = new EdgeDriver();

        driver.manage().window().maximize();
        ///driver.navigate().to("https://www.authenticom.com/#1");
        driver.navigate().to("https://dealervault-dealer-dev.azurewebsites.net");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        Thread.sleep(3000);
        return driver;
    }
    public static void browserClose(){
        driver.quit();
    }
}
