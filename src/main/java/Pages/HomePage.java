package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
   // @FindBy(className = "menu-icon")
    //public static WebElement burgerMenu;

    public static WebElement burgerMenu = driver.findElement(By.className("menu-icon"));
    public static WebElement productsButton = driver.findElement(By.xpath("//a[text()='Products']"));
    public static WebElement supportButton = driver.findElement(By.xpath("//a[text()='Support' and @target='_blank']"));
    public static WebElement vendorsButton = driver.findElement(By.xpath("//a[text()='Vendors' and contains(@class,'navbar_link')]"));
    public static WebElement careersButton = driver.findElement(By.xpath("//a[text()='Careers' and contains(@class,'navbar_link')]"));
    public HomePage(){PageFactory.initElements(BasePage.driver,this);
    }

    public static void brgrMenuClick (){
        burgerMenu.click();
    }
    public static void productsButtonClick () {
        productsButton.click();
    }
    public static void careersButtonClick (){careersButton.click();}
}
