package com.epam.mobile.testing;

import com.epam.mobile.testing.pages.EmailPage;
import com.epam.mobile.testing.pages.GmailPage;
import org.testng.annotations.Test;

public class SendEmailTest extends BaseTest {
    public static final long DEFAULT_TIMEOUT = 200;


    @Test
    public void createAndSendEmail() {
        GmailPage gmailPage = new GmailPage();
        gmailPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, gmailPage.getGotItButton());
        gmailPage.clickOnGotItButton();
        gmailPage.getTakeMeToGmailButton();
        gmailPage.clickOnTakeMeToGmailButton();
        EmailPage emailPage = new EmailPage();
        emailPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, emailPage.getPopupCloseButton());
        emailPage.clickOnPopupCloseButton();
    }


}
