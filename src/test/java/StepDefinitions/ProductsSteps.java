package StepDefinitions;

import Pages.BasePage;
import Pages.HomePage;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class ProductsSteps {
    @Given("user clicks on Home page burger menu")
    public void user_clicks_on_home_page_burger_menu() {
        HomePage.brgrMenuClick();

    }
    @When("user clicks on Products button")
    public void user_clicks_on_products_button() {
        HomePage.productsButtonClick();

    }
    @When("user lands on Products page")
    public void user_lands_on_products_page() {
        Assert.assertTrue(ProductsPage.readURL().contains("products"));


    }
    @Then("user validates the presence of all products")
    public void user_validates_the_presence_of_all_products() {
        Assert.assertEquals(ProductsPage.readDealerVaultLabel(),"DEALER VAULT");
        Assert.assertEquals(ProductsPage.readRecordRechargeLabel(),"RECORD RECHARGE");
        Assert.assertEquals(ProductsPage.readContactViaLabel(),"CONTACT VIA");
    }
    }

