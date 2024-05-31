package com.unac.stepsdefinitions;

import com.unac.pages.RegisterPage;
import com.unac.pages.OpenNewAccountPage;
import com.unac.pages.AccountsOverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue; // Importar la función assertTrue

public class RegisterStepsDefinitions {

    RegisterPage registerPage;
    OpenNewAccountPage openNewAccountPage;
    AccountsOverviewPage accountsOverviewPage;

    @Given("I navigate to the parabank registration page {string}")
    public void navigateToRegistrationPage(String url) {
        registerPage.openAt(url);
    }

    @When("I register with first name {string}, last name {string}, address {string}, city {string}, state {string}, zip code {string}, phone number {string}, ssn {string}, username {string}, and password {string}")
    public void register(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String ssn, String username, String password) {
        registerPage.fillRegistrationForm(firstName, lastName, address, city, state, zipCode, phoneNumber, ssn, username, password);
    }

    @When("I open a new account")
    public void openNewAccount() {
        openNewAccountPage.openNewAccount();
    }

    @Then("I should see the new account in the accounts overview")
    public void verifyNewAccountInOverview() {
        String newAccountNumber = openNewAccountPage.getNewAccountNumber();
        boolean isPresent = accountsOverviewPage.isAccountPresent(newAccountNumber);
        assertTrue("The new account should be present in the accounts overview", isPresent);
    }
}
