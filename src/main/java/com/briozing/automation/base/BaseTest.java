package com.briozing.automation.base;

import com.briozing.automation.factory.Log4JFactory;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;

public class BaseTest extends WebDriverFactory {

    static Logger logger = Log4JFactory.getLogger(BaseTest.class.getSimpleName());

    @AfterMethod(alwaysRun = false)
    public static void userLogout() {
    {

    }
    }
}
