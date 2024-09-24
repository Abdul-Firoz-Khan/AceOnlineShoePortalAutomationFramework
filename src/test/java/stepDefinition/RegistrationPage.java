package stepDefinition;

import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.visibilityRegistrationPage;


public class RegistrationPage {
    @Then("^User should be able to view the Registration page$")
    public void user_should_be_able_to_view_the_Registration_page() throws InterruptedException {
            String actualRegistrationPage = visibilityRegistrationPage();
            assertEquals(actualRegistrationPage,"User Registration Page");
        }

    }

