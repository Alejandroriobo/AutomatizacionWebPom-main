package com.unac.pages;

import com.unac.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phoneNumber = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By registerButton = By.cssSelector(".button[value='Register']");

    public void fillRegistrationForm(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String ssn, String username, String password) {
        Action.sendData(getDriver(), this.firstName, firstName);
        Action.sendData(getDriver(), this.lastName, lastName);
        Action.sendData(getDriver(), this.address, address);
        Action.sendData(getDriver(), this.city, city);
        Action.sendData(getDriver(), this.state, state);
        Action.sendData(getDriver(), this.zipCode, zipCode);
        Action.sendData(getDriver(), this.phoneNumber, phoneNumber);
        Action.sendData(getDriver(), this.ssn, ssn);
        Action.sendData(getDriver(), this.username, username);
        Action.sendData(getDriver(), this.password, password);
        Action.sendData(getDriver(), this.confirmPassword, password);
        Action.clickElement(getDriver(), registerButton);
    }
}

