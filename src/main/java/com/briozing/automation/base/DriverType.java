package com.briozing.automation.base;

import com.briozing.automation.config.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * @author kohitij_das
 */
public enum DriverType implements DriverSetup {

    CHROME {
        public DesiredCapabilities getDesiredCapabilities() {
            final DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.acceptInsecureCerts();

            return capabilities;
        }

        public WebDriver getWebDriver(DesiredCapabilities capabilities) {
            try {
                ChromeDriverService service = new ChromeDriverService.Builder()
                        .usingAnyFreePort()
                        .build();
                ChromeOptions options = new ChromeOptions();
//                capabilities.setCapability("chrome.binary", "<Path to binary>");
//                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//                options.addArguments("test-type");
//                options.addArguments("--disable-extensions");
//                options.addArguments("--disable-gpu");
//                options.addArguments("--no-sandbox");
//                options.addArguments("--disable-dev-shm-usage");
//                options.addArguments("--remote-debugging-port=9222");
//                options.setBinary("/usr/bin/google-chrome");
//                options.addArguments("--disable-setuid-sandbox");
//                options.addArguments("--headless");
                options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
//                options.addArguments("--headless");
                options.setExperimentalOption("useAutomationExtension", false);
                options.addArguments("start-maximized"); // open Browser in maximized mode
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                options.addArguments("--disable-gpu"); // applicable to windows os only
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.merge(capabilities);
                return new ChromeDriver(service, options);
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
    },

    BROWSER_STACK {
        public DesiredCapabilities getDesiredCapabilities() {
            try {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("browser", System.getProperty("browserName"));
                caps.setCapability("browser_version", System.getProperty("browserVersion"));
                caps.setCapability("browserstack.debug", "true");
                caps.setCapability("build", System.getProperty("buildName"));
                caps.setCapability("project", "NGP_MVP_CERTIFICATION");
                return caps;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }

        public WebDriver getWebDriver(DesiredCapabilities capabilities) {
            try {
                return new RemoteWebDriver(new URL(Configuration.browserURL), capabilities);
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
    }
}