package Utils;

import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods extends BasePage {
    public static void enterText(WebElement element, String textValue) {
        element.sendKeys(textValue);
    }

    public static void selectValueFromDD(WebElement dd, String value) {
        Select select = new Select(dd);
        select.selectByValue(value);
    }

    public static void clickElement(WebElement element) {
        waitExplicitly(element);
        element.click();
    }

    public static boolean isElementDisplayed(WebElement element) {
        boolean textDisplayed = element.isDisplayed();
        return textDisplayed;
    }

    public static boolean compareElementText(WebElement element, String expectedText){
        String actualText = element.getText();
        boolean comparisonResult = actualText.equals(expectedText);
        return comparisonResult;
    }
    public static void scrollToElement(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void highlightElement(WebElement element) {
        ((JavascriptExecutor)driver).executeScript(
                "arguments[0].style.border='3px solid green'",element
        );
    }

    public static void waitExplicitly(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void javaScriptClick (WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }






}
