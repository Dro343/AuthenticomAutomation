package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends BasePage {

    public static WebElement careersContactUsButton = driver.findElement(By.xpath("//a[text()='Contact Us']"));
    public CareersPage() {PageFactory.initElements(BasePage.driver, this);}
}
