package com.unac.pages;

import com.unac.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountsOverviewPage extends PageObject {
    By accountsOverviewLink = By.linkText("Accounts Overview");

    public boolean isAccountPresent(String accountNumber) {
        Action.clickElement(getDriver(), accountsOverviewLink);
        By accountLocator = By.xpath("//a[contains(text(), '" + accountNumber + "')]");
        return Action.isElementPresent(getDriver(), accountLocator);
    }
}
