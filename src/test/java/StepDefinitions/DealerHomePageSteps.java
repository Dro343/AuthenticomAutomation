package StepDefinitions;

import Pages.BasePage;
import Pages.DealerHomePageElements;
import Pages.DealerLoginPage;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DealerHomePageSteps extends BasePage {
    @Given("user logs in as a dealer")
    public void user_logs_in_as_a_dealer() {
        DealerLoginPage.loginDealer();
    }
    @When("user lands on home page")
    public void user_lands_on_home_page() {
        Assert.assertEquals(DealerHomePageElements.getLoggedUsername(),"Andrei Hnedchyk");

    }
    @Then("user navigates to all tabs")
    public void user_navigates_to_all_tabs() throws InterruptedException {
        DealerHomePageElements.dashBoardBtn.click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Dashboard')]")).isDisplayed());
        CommonMethods.staleElementClick(By.linkText("Add"));
        CommonMethods.staleElementClick(By.id("addStoreBtn"));
        CommonMethods.staleElementClick(By.linkText("Add"));
        CommonMethods.staleElementClick(By.xpath("//a[text()='Feed']"));
        CommonMethods.staleElementClick(By.linkText("Add"));
        CommonMethods.staleElementClick(By.linkText("User"));
        CommonMethods.staleElementClick(By.linkText("Store Summary"));
        CommonMethods.staleElementClick(By.linkText("Group Management"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Data Management')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Data Removal')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Data Management')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Integrations')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Data Management')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Mapping')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Data Management')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Report')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Data Management')]"));
        CommonMethods.staleElementClick(By.xpath("//a[contains(text(),'Configuration Settings')]"));

    }
    @Then("user logs out")
    public void user_logs_out() throws InterruptedException {
        CommonMethods.staleElementClick(By.xpath("//i[@class='nav-icon nav-icon-cog']"));
        CommonMethods.staleElementClick(By.linkText("Logout"));
        Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed());
    }
}
