package stepDefinition;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {
    @When("^User success-fully enters the log in details$")
    public void user_success_fully_enters_the_log_in_details() throws InterruptedException {
        sendKeysUserNameTxt();
        sendKeysPasswordTxt();
        clickLoginBtn();
    }
    @When("^User clicks on new Registration button$")
    public void user_clicks_on_new_Registration_button() throws InterruptedException {
        clickRegistrationBtn();
    }
}
