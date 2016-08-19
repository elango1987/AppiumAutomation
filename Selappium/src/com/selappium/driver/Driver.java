package com.selappium.driver;

import com.selappium.actions.KWOpenBrowser;
import com.selappium.actions.KWSetText;
import com.selappium.create.WebDr;
import com.selappium.pageobjects.CreateGAPO;
import com.selappium.utility.PropertyReader;

import java.io.File;

public class Driver {

    static WebDr webDriver;
    public static File configFile;
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

            propReader = PropertyReader.getInstance();

//            ReadFromExcel readFromExcel = new ReadFromExcel();
//            readFromExcel.ReadExcel();

            webDriver = WebDr.getInstance();
            webDriver.CreateWebDriver("chrome");

            KWOpenBrowser.OpenBrowser(propReader.getUrl());

            long startTime = System.currentTimeMillis();

            KWSetText.SetText(CreateGAPO.FirstName,"Elangovan");
            KWSetText.SetText(CreateGAPO.LastName,"Mani");
            KWSetText.SetText(CreateGAPO.GmailAddress, "Jamessssbonddd0000007");
            KWSetText.SetText(CreateGAPO.Password, "Infy@123");
            KWSetText.SetText(CreateGAPO.ConfirmPassword,"Infy@123");
            KWSetText.SetText(CreateGAPO.BirthDay, "18");
            KWSetText.SetText(CreateGAPO.BirthYear, "1987");
            KWSetText.SetText(CreateGAPO.PhoneNumber, "224-619-7026");
            KWSetText.SetText(CreateGAPO.RecoveryMail, "elango87@gmail.com");

            long endTime = System.currentTimeMillis();

            System.out.println("Execution completed in " + (int) (endTime-startTime) + " milli-seconds");

//            KWCloseBrowser.CloseBrowser();
        }
    }
}
