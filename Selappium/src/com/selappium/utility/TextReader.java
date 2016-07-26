package com.selappium.utility;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author ELANGO
 */
public class TextReader {
    private static String filePath;
    private static String url;
    private static String apkPath;
    private static String ipaPath;
    private static String deviceId;
    private static String udid;
    private static String chromeDriverPath;

    public TextReader(String configFilePath) {
        filePath = configFilePath;
        ReadConfigFile();
    }

    public static void ReadConfigFile() {
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("#")) {
                    continue;
                }

                if (line.contains("=")) {
                    if (line.startsWith("URL")) {
                        url = splitString(line);
                    } else if (line.startsWith("APKPATH")) {
                        apkPath = splitString(line);
                    } else if (line.startsWith("IPAPATH")) {
                        ipaPath = splitString(line);
                    } else if (line.startsWith("DEVICEID")) {
                        deviceId = splitString(line);
                    } else if (line.startsWith("UDID")) {
                        udid = splitString(line);
                    }else if(line.startsWith("CHROMEDRIVERPATH")){
                        chromeDriverPath = splitString(line);

                    }
                }
            }

            bufferedReader.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String splitString(String value) {
        String[] newValue = value.split("=");
        return newValue[1];
    }

    public String getApkPath() {
        return TextReader.apkPath;
    }

    public String getDeviceId() {
        return TextReader.deviceId;
    }

    public String getIpaPath() {
        return TextReader.ipaPath;
    }

    public String getUDID() {
        return TextReader.udid;
    }

    public String getURL() {
        return TextReader.url;
    }

    public String getChromeDriverPath(){return TextReader.chromeDriverPath;}
}