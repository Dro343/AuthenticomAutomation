package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage{
    static WebElement dealerVaultLabel = driver.findElement(By.xpath("//p[text()='DEALER VAULT']"));
    static WebElement recordRechargeLabel = driver.findElement(By.xpath("//p[text()='RECORD RECHARGE']"));
    static WebElement contactViaLabel = driver.findElement(By.xpath("//p[text()='CONTACT VIA']"));
////add another label here. there are 4 in total, not 3 QQQQQQQ
    public ProductsPage(){PageFactory.initElements(BasePage.driver,this);}

    public static String readDealerVaultLabel(){
        String label1Text = dealerVaultLabel.getText();
        return label1Text;

    }
    public static String readRecordRechargeLabel(){
        String label2Text = recordRechargeLabel.getText();
        return label2Text;

    }
    public static String readContactViaLabel(){
        String label3Text = contactViaLabel.getText();
        return label3Text;

    }
    public static String readURL(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;

    }
}
