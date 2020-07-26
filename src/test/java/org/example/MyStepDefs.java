package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()
    {
        homePage.homePageVerification();

    }

    @When("^user clicks on registration button$")
    public void user_clicks_on_registration_button()  {
        homePage.clickOnRegistrationDetail();
    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details(){
            registerPage.registrationPageVerification();
            registerPage.userEntersRegistrationDetail();
    }

    @When("^user clicks on registration-submit button$")
    public void user_clicks_on_registration_submit_button()  {

    }

    @Then("^user should able to see registration successful massage$")
    public void user_should_able_to_see_registration_successful_massage() {
          registerSuccessPage.regSuccessfullMsg();
    }

}
