package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {

    static WebElement getInTouchText = driver.findElement(By.xpath("//h1[text()='Get in Touch']"));
    static WebElement firstNameField = driver.findElement(By.id("Contact-First-Name"));
    static WebElement lastNameField = driver.findElement(By.id("Contact-Last-Name"));
    static WebElement emailField = driver.findElement(By.id("Contact-Email"));
    static WebElement phoneField = driver.findElement(By.id("Contact-Phone"));
    static WebElement companyField = driver.findElement(By.id("Company"));
    static WebElement countryRegionDD = driver.findElement(By.id("Contact-Country"));
    static WebElement supportDD = driver.findElement(By.id("Request"));
    static WebElement additionalCommentsField = driver.findElement(By.id("Comments"));
    static WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
    public static WebElement finalThankYouMessage = driver.findElement(By.xpath("//div[text()='Thank you! Your request has been received!']"));


    public ContactUsPage() {PageFactory.initElements(BasePage.driver, this);}

    public static boolean getInTouchTextDisplayValidation(){
        boolean textDisplayed = getInTouchText.isDisplayed();
        return textDisplayed;
    }
    public static void submitApplication () {
        CommonMethods.enterText(firstNameField,"Andrei Automation Test");
        CommonMethods.enterText(lastNameField,"Hnedchyk Automation Test");
        CommonMethods.enterText(emailField,"andreihqa@gmail.com");
        CommonMethods.enterText(phoneField,"347 580 9541");
        CommonMethods.enterText(companyField,"Authenticom QA");
        CommonMethods.selectValueFromDD(countryRegionDD,"United States" );
        CommonMethods.selectValueFromDD(supportDD, "Other");
        CommonMethods.enterText(additionalCommentsField, "This is an automation testing test");
        CommonMethods.clickElement(submitButton);
    }
    public static void verifyFinalMessage(){
        CommonMethods.compareElementText(finalThankYouMessage,"Thank you! Your request has been received!");
    }
}
