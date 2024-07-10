package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DealerHomePageElements extends BasePage {
    public static WebElement loggedUser = driver.findElement(By.xpath("//div[contains(text(),'Andrei Hnedchyk')]"));
    public static WebElement dashBoardBtn = driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
    public static WebElement addTab = driver.findElement(By.linkText("Add"));
    ///public static WebElement addStoreBtn = driver.findElement(By.id("addStoreBtn"));
    ////public static WebElement feedBtn = driver.findElement(By.xpath("//a[text()='Feed']"));
   /// public static WebElement userBtn = driver.findElement(By.linkText("User"));
    ///public static WebElement storeSummaryBtn = driver.findElement(By.linkText("Store Summary"));
    ///public static WebElement groupManagBtn = driver.findElement(By.linkText("Group Management"));

    public DealerHomePageElements() {PageFactory.initElements(BasePage.driver, this);}



  public static String getLoggedUsername(){
     String loggedUserName = loggedUser.getText();
     return loggedUserName;
    }
}

