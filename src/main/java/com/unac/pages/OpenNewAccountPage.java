package com.unac.pages;

import com.unac.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpenNewAccountPage extends PageObject {
    By openNewAccountLink = By.linkText("Open New Account");
    By accountTypeDropdown = By.id("type");
    By openNewAccountButton = By.cssSelector(".button[value='Open New Account']");
    By newAccountNumber = By.id("newAccountId");

    public void openNewAccount() {
        Action.clickElement(getDriver(), openNewAccountLink);
        Action.selectFromDropdown(getDriver(), accountTypeDropdown, "SAVINGS");
        Action.clickElement(getDriver(), openNewAccountButton);
    }

    public String getNewAccountNumber() {
        return Action.getElementText(getDriver(), newAccountNumber);
    }
}

