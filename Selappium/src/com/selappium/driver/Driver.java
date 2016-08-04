package com.selappium.driver;

import com.selappium.create.WebDr;
import com.selappium.utility.TextReader;
import com.selappium.utility.PropertyReader;

import java.io.File;

public class Driver {
    static TextReader txtReader;
    static WebDr webDriver;
    static File configFile;
    static PropertyReader propReader;

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        if (args.length != 1) {
            System.err.println("Please select configuration file path");
            System.exit(-1);
        }

        configFile = new File(args[0]);

        if (!configFile.exists()) {
            System.err.println("Configuration file not found in" + configFile.getAbsolutePath() + ". Please check");
            System.exit(-1);
        } else {

           /* txtReader = new TextReader(args[0]);
            webDriver = new WebDr();
            webDriver.CreateWebDriver("chrome");
            webDriver.OpenUrl(txtReader.getURL());*/

            propReader = new PropertyReader(args[0]);
            propReader = PropertyReader.getInstance();

            System.out.println(propReader.getUrl());
            System.out.println(propReader.getApkPath());
            System.out.println(propReader.getIpaPath());
            System.out.println(propReader.getDeviceId());
            System.out.println(propReader.getUdId());
            System.out.println(propReader.getChromeDriverPath());

            webDriver = new WebDr();
            webDriver.CreateWebDriver("chrome");
            webDriver.OpenUrl(propReader.getUrl());
            webDriver.CloseWebDriver();

        }
    }
}
