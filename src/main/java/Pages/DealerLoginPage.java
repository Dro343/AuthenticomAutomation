package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DealerLoginPage extends BasePage{

    public static WebElement emailAddressField = driver.findElement(By.id("username"));
    public static WebElement passwordField = driver.findElement(By.id("password"));
    public static WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
    public DealerLoginPage() {PageFactory.initElements(BasePage.driver, this);}

    public static void loginDealer(){
        emailAddressField.sendKeys("andrei.hnedchyk+selenium@authenticom.com");
        passwordField.sendKeys("Dro343Dro343$$$");
        continueButton.click();
    }




}
