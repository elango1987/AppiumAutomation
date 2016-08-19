package com.selappium.actions;

import com.selappium.create.WebDr;
import org.openqa.selenium.WebDriver;

/**
 * Created by ELANGO on 8/9/16.
 */
public class KWCloseBrowser {

    static WebDriver webDriver = WebDr.webDriver;

    public static void CloseBrowser(){

        webDriver.close();
        webDriver.quit();

    }

}
