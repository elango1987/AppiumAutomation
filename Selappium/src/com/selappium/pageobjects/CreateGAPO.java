package com.selappium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ELANGO on 8/9/16.
 */
public class CreateGAPO {

    WebDriver webDriver;

    public static By FirstName = By.id("FirstName");
    public static By LastName = By.id("LastName");
    public static By GmailAddress = By.id("GmailAddress");
    public static By Password = By.id("Passwd");
    public static By ConfirmPassword = By.id("PasswdAgain");
    public static By BirthDay = By.id("BirthDay");
    public static By BirthYear = By.id("BirthYear");
    public static By PhoneNumber = By.id("RecoveryPhoneNumber");
    public static By RecoveryMail = By.id("RecoveryEmailAddress");

    public CreateGAPO(WebDriver webDriver){
        this.webDriver = webDriver;
//        this.FillForm();
    }

    public void FillForm(){

        webDriver.findElement(FirstName).sendKeys("Elangovan");
        webDriver.findElement(LastName).sendKeys("Mani");
        webDriver.findElement(GmailAddress).sendKeys("elango787987");
        webDriver.findElement(Password).sendKeys("Infy@123");
        webDriver.findElement(ConfirmPassword).sendKeys("Infy@123");
        webDriver.findElement(BirthDay).sendKeys("18");
        webDriver.findElement(BirthYear).sendKeys("1987");
        webDriver.findElement(PhoneNumber).sendKeys("2244423244");
        webDriver.findElement(RecoveryMail).sendKeys("elango87@gmail.com");

    }

}
