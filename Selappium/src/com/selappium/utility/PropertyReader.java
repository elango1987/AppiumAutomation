package com.selappium.utility;

import com.selappium.driver.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

/**
 * Created by ELANGO on 8/1/16.
 */

public class PropertyReader {

    private static String filePath;
    private static String url;
    private static String apkPath;
    private static String ipaPath;
    private static String deviceId;
    private static String udId;
    private static String chromeDriverPath;
    private static PropertyReader propReader = null;

    public PropertyReader(String configFilePath) {
        filePath = configFilePath;
        ReadProperties();
    }

    public static PropertyReader getInstance() {

        if (propReader == null) {
            propReader = new PropertyReader(Driver.configFile.getAbsolutePath());
            ReadProperties();
        }

        return propReader;
    }

    public static void ReadProperties() {
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            Properties properties = new Properties();
            properties.load(reader);

            url = properties.getProperty("URL");
            apkPath = parseAbsolutePath(properties.getProperty("APKPATH"));
            ipaPath = parseAbsolutePath(properties.getProperty("IPAPATH"));
            deviceId = properties.getProperty("DEVICEID");
            udId = properties.getProperty("UDID");
            chromeDriverPath = properties.getProperty("CHROMEDRIVERPATH");

            bufferedReader.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String parseAbsolutePath(String path) {
        path = path.replace("/", "\\\\");
        return path;
    }

    public String getUrl() {
        return url;
    }

    public String getApkPath() {
        return apkPath;
    }

    public String getIpaPath() {
        return ipaPath;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getUdId() {
        return udId;
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }
}
