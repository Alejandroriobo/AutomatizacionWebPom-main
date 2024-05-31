package com.unac.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Action {
    public static void navigateUrl(WebDriver myBrowser, String url) {
        myBrowser.navigate().to(url);
    }

    public static void sendData(WebDriver myBrowser, By target, String strData) {
        myBrowser.findElement(target).sendKeys(strData);
    }

    public static void clickElement(WebDriver myBrowser, By target) {
        myBrowser.findElement(target).click();
    }

    public static String getElementText(WebDriver myBrowser, By target) {
        return myBrowser.findElement(target).getText();
    }

    public static void selectFromDropdown(WebDriver myBrowser, By target, String value) {
        Select dropdown = new Select(myBrowser.findElement(target));
        dropdown.selectByVisibleText(value);
    }

    public static boolean isElementPresent(WebDriver myBrowser, By target) {
        return myBrowser.findElements(target).size() > 0;
    }
}

