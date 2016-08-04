package com.selappium.create;

import com.selappium.utility.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;

public class WebDr {

    WebDriver webDriver = null;
    DesiredCapabilities capability = null;
    PropertyReader propReader = PropertyReader.getInstance();

    /**
     * Function CreateWebDriver
     * Accepts browser name as input and creates the web driver
     */
    public WebDriver CreateWebDriver(String browserName) {

        if (browserName.toUpperCase().equals("FIREFOX")) {

            capability = DesiredCapabilities.firefox();
            capability.setBrowserName("firefox");

            webDriver = new FirefoxDriver();

        } else if (browserName.toUpperCase().equals("CHROME")) {

            System.setProperty("webdriver.chrome.driver", "/Users/ELANGO/IdeaProjects/AppiumAutomation/Selappium/External Files/chromedriver");
//            System.setProperty("webdriver.chrome.driver", propReader.getChromeDriverPath());
            capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");

            webDriver = new ChromeDriver();
            MaximizeChromeWindow();

        } else {
            System.err.println("Unknown browser '" + browserName + "'. Accepted values are 'Firefox' and 'Chrome'");
            System.exit(-1);
        }

        webDriver.manage().window().maximize();
        return webDriver;
    }

    /**END FUNCTION**********************************************************************************************/

    /**
     * Function OpenUrl
     * Accepts URL as input and opens the URL in the browser
     */
    public void OpenUrl(String URL) {
        webDriver.get(URL);
    }

    /**END FUNCTION**********************************************************************************************/

    /**
     * Function CloseWebDriver
     * Used to close the web driver
     */
    public void CloseWebDriver() {
        webDriver.close();
        webDriver.quit();
    }

    /**END FUNCTION**********************************************************************************************/

    /**
     * Function MaximizeChromeWindow
     * Method to Maximize Chrome window to fit the screen size
     */
    private void MaximizeChromeWindow() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        webDriver.manage().window().setSize(new org.openqa.selenium.Dimension((int) width, (int) height));

    }
    /**END FUNCTION**********************************************************************************************/

}