package StepDefinitions;

import Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BasePage {
    @Before
    public void start() throws InterruptedException {
        browserLaunch();
    }

    @After
    public void end() {
        browserClose();
    }
}
