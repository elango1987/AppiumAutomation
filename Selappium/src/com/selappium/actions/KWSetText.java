package com.selappium.actions;

import com.selappium.create.WebDr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ELANGO on 8/9/16.
 */
public class KWSetText {

    static WebDriver webDriver = WebDr.webDriver;
    static WebElement webElement = null;

    public static void SetText(WebElement element, String value){

        webElement = new WebDriverWait(webDriver, 60).until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        webElement.sendKeys((String) value);

    }

    public static void SetText(By by, String Value){
        webElement = new WebDriverWait(webDriver, 60).until(ExpectedConditions.elementToBeClickable(by));
        webElement.sendKeys((String) Value);
    }
}
