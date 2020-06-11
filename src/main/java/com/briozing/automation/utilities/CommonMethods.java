package com.briozing.automation.utilities;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Constants;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * @author kohitij_das
 */
public class CommonMethods {

    /**
     * Method to wait until pageLoad complete event.
     */
    public void waitForPageToLoad() {
        try {
            int count = Integer.parseInt(Constants.TIMEOUT) / 1000;
            String pageLoaded;
            final JavascriptExecutor js = (JavascriptExecutor) WebDriverFactory.getDriver();
            final String status = "return window.document.readyState;";
            do {
                pageLoaded = (String) js.executeScript(status);
                Thread.sleep(1000);
                count--;
                if (count <= 0) {
                    pageLoaded = "complete";
                    break;
                }
            } while (!pageLoaded.equalsIgnoreCase("complete"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Method to return map of params from file
     *
     * @param filePath
     * @return paramMap
     */
    public HashMap getMapFromFileContent(String filePath) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader((filePath)));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        reader.close();

        return map;
    }

    /**
     * @param element
     * @return
     */
    public void clickUsingJavaScript(WebElement element) throws Exception {

        try {
            if (element.isEnabled() && element.isDisplayed()) {
                ((JavascriptExecutor) WebDriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                ((JavascriptExecutor) WebDriverFactory.getDriver()).executeScript("arguments[0].click();", element);
            } else {
                System.out.println("Unable to click on element");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page document " + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element was not found in DOM " + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Unable to click on element " + e.getStackTrace());
        }

    }

    public void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
        }
    }

    /**
     * @throws Exception
     */
    public void refreshPage() throws Exception {
        WebDriverFactory.getDriver().navigate().refresh();
    }

    /**
     * @param element
     * @param timeout
     * @throws Exception
     */
    public void waitForElementVisible(WebElement element, int timeout) throws Exception {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * @param elementList
     * @param timeout
     * @throws Exception
     */
    public void waitForVisibilityOfAllElements(List<WebElement> elementList, int timeout) throws Exception {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    /**
     * @param elementList
     * @return
     */
    public ArrayList<String> getElementTextList(List<WebElement> elementList) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (WebElement element : elementList) {
            stringArrayList.add(element.getText().trim());
        }
        return stringArrayList;
    }

    public String strStringFormatting(String mainString, String startText, String endText, int StartTextIndex) {
        return mainString.replace(mainString.substring(mainString.lastIndexOf(startText) + StartTextIndex, mainString.lastIndexOf(endText) - 1), "XXXX");

    }

    public void performActionOnWebElement(WebElement webElement) throws Exception {
        Actions action = new Actions(WebDriverFactory.getDriver());
        action.moveToElement(webElement).perform();
        action.click(webElement).perform();
    }

    public void performDoubleClick(WebElement element) throws Exception {
        Actions actions = new Actions(WebDriverFactory.getDriver());
        actions.doubleClick(element).perform();
    }
}