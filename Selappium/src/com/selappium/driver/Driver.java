package com.selappium.driver;

import java.io.File;

import com.selappium.create.WebDr;
import com.selappium.utility.TextReader;

public class Driver {
    static TextReader txtReader;
    static WebDr webDriver;
    static File configFile;

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
            txtReader = new TextReader(args[0]);

            webDriver = new WebDr();
            webDriver.CreateWebDriver("Firefox");
            webDriver.OpenUrl(txtReader.getURL());
        }
    }
}