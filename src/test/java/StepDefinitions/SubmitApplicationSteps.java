package StepDefinitions;

import Pages.BasePage;
import Pages.CareersPage;
import Pages.ContactUsPage;
import Pages.HomePage;
import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitApplicationSteps {
    @When("user clicks on Careers button")
    public void user_clicks_on_careers_button() throws InterruptedException {
        Thread.sleep(3000);
        CommonMethods.clickElement(HomePage.careersButton);

    }
    @When("user clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() throws InterruptedException {
        Thread.sleep(3000);
        CommonMethods.clickElement(CareersPage.careersContactUsButton);

    }
    @Then("user sees Get In Touch text")
    public void user_sees_get_in_touch_text() throws InterruptedException {
        Thread.sleep(3000);
        ContactUsPage.getInTouchTextDisplayValidation();

    }
    @Then("user fills the form")
    public void user_fills_the_form() throws InterruptedException {
        Thread.sleep(3000);
        ContactUsPage.submitApplication();

    }
    @Then("user sees {string} message")
    public void user_sees_message(String string) throws InterruptedException {
        Thread.sleep(3000);
        ContactUsPage.verifyFinalMessage();

    }
}
