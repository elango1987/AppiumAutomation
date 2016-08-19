package com.selappium.pageobjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ELANGO on 8/9/16.
 */
public class CreateGoogleAccountPO {

    public CreateGoogleAccountPO(WebDriver webDriver){
        PageFactory.initElements(new AppiumFieldDecorator(webDriver),this);
    }

    @FindBy(how= How.NAME,using="FirstName")
    public WebElement FirstName;

    @FindBy(how=How.NAME,using = "LastName")
    public WebElement LastName;

    @FindBy(how=How.NAME, using = "GmailAddress")
    public WebElement GmailAddress;

    @FindBy(how=How.NAME,using="Passwd")
    public WebElement Password;

    @FindBy(how=How.NAME,using = "PasswdAgain")
    public WebElement ConfirmPassword;

    @FindBy(how=How.NAME,using = "BirthDay")
    public WebElement DayOfBirth;

    @FindBy(how=How.NAME,using = "BirthYear")
    public WebElement YearOfBirth;

    @FindBy(how=How.NAME,using = "RecoveryPhoneNumber")
    public WebElement RecoveryPhoneNumber;

}
