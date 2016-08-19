package com.selappium.actions;

import com.selappium.create.WebDr;
import org.openqa.selenium.WebDriver;

/**
 * Created by ELANGO on 8/3/16.
 */
public class KWOpenBrowser {

    static WebDriver webDriver = WebDr.webDriver;

    public static void OpenBrowser(String url){

        webDriver.get(url);

    }

}
