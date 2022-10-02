package com.epam.mobile.testing.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GmailPage extends BasePage {
    @AndroidFindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
    private MobileElement gotItButton;
    @AndroidFindBy(id = "com.google.android.gm:id/action_done")
    private MobileElement takeMeToGmailButton;

    public void clickOnGotItButton() {
        gotItButton.click();
    }

    public WebElement getGotItButton() {
        return gotItButton;
    }

    //wait
    public void clickOnTakeMeToGmailButton() {
        takeMeToGmailButton.click();
    }

    public WebElement getTakeMeToGmailButton() {
        return takeMeToGmailButton;
    }




}
