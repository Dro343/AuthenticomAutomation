package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;
    public static WebDriver browserLaunch() {
       System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
       driver = new ChromeDriver();
        ///System.setProperty("webdriver.edge.driver", "src/main/resources/Drivers/msedgedriver.exe");
        //driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.authenticom.com/#1");
        return driver;
    }
    public static void browserClose(){
        driver.quit();
    }
}
