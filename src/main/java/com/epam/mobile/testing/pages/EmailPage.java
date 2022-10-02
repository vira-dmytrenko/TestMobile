package com.epam.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class EmailPage extends BasePage{
    @AndroidFindBy(id="com.google.android.gm:id/dismiss_button")
    private MobileElement popupCloseButton;

    @AndroidFindBy(id="com.google.android.gm:id/compose_button")
    private MobileElement composeButton;

    // в неокторых кейсах появляется, в некороых нет
    public void clickOnPopupCloseButton() {
        popupCloseButton.click();
    }

    public WebElement getPopupCloseButton() {
        return popupCloseButton;
    }

    public WebElement getComposeButton() {
        return composeButton;
    }
    public void clickOnComposeButton() {
        composeButton.click();
    }



}
