package com.selenium.pages.stepDefs;

import cucumber.api.java.en.*;
import com.selenium.pages.loginApplicationAndSearch;



public class loginApplicationStepDefs {

    @Given("^I open google application$")
    public void i_open_google_application() {
        loginApplicationAndSearch.openGoogle();

    }

    @When("^I search for 'What to see in Scotland'$")
    public void i_search_for_What_to_see_in_Scotland() {
        loginApplicationAndSearch.searchInGoogle("what to see in scotland");

    }

    @Then("^I should open the first link$")
    public void i_should_open_the_first_link() {
        loginApplicationAndSearch.clickFirstLink();
    }

    @Given("^Login to the application using credentials 'John Doe' and 'ThisIsNotAPassword'$")
    public void loginToApplication(){
        loginApplicationAndSearch.loginApplicationPratice("John Doe","ThisIsNotAPassword");
    }

    @When("^Add the details and make an appointment$")
    public void addDetailsAppointment(){
        loginApplicationAndSearch.addDetailsAppointmentPractice();
        System.out.println("hello");
    }


    @Then("^Check if we got booking confirmations and click Go to Homepage button$")
    public void checkBookingConf(){
        System.out.println("bye");
    }

}
