package com.briozing.automation.suites;

import com.briozing.automation.base.BaseTest;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.helpers.TestExecutionHelper;
import com.briozing.automation.listeners.MethodListener;
import com.briozing.automation.pageobjects.HomePage;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.TestConstants;
import com.briozing.automation.utilities.TestSteps;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

@Listeners({MethodListener.class})

public class AccountPaymentHistoryTest extends BaseTest {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    TestExecutionHelper testExecutionHelper=new TestExecutionHelper();

    @DataProvider(name = "outstanding-balance-dp")
    public Object[][] outstandingBalanceDP() {
        return new Object[][]{
                {"946.00"}
        };
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory1","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_1(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_HISTORY_THANK_YOU_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_HISTORY_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory2","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_2(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_HISTORY_THANK_YOU_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_HISTORY_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory3","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_3(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_3_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory4","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_4(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_3_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory5","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_5(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_3_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory6","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_6(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_3_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory7","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_7(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_6_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory8","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_8(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_6_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory9","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_9(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_6_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory10","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_10(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_6_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory11","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_11(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_9_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory12","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_12(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_9_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory13","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_13(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_9_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory14","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_14(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_9_MONTHS_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory15","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_15(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_1_YEAR_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_1_YEAR_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory16","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_16(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_1_YEAR_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_1_YEAR_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory17","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_17(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_1_YEAR_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_1_YEAR_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory18","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_18(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PROVIDE_DURATION_1_YEAR_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_PROVIDED_DURATION_1_YEAR_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory19","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_19(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_DURATION.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_ENTERED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory20","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_20(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_DURATION.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_ENTERED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_CONTACT_REPRESENTATIVE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CONTACT_REPRESENTATIVE_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory21","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_21(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_DURATION.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_ENTERED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AccountPaymentHistory22","accPaymentHistory"}, dataProvider = "outstanding-balance-dp", description = "")
    public void verify_account_payment_history_22(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj=new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACCOUNT_PAYMENT_HISTORY_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACCOUNT_PAYMENT_HISTORY_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LAST_5_PAYMENTS_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SEE_ADDITIONAL_PAYMENTS_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PROVIDE_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_DURATION.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_RECORDS_OF_ENTERED_DURATION_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FOUND_WHAT_YOU_ARE_LOOKING_FOR_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_SOUNDS_GREAT_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SOUNDS_GREAT_AND_HELP_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_I_CAN_HELP_YOU_WITH_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CROSS_BUTTON.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }
}
