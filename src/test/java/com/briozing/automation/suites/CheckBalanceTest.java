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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Listeners({MethodListener.class})
public class CheckBalanceTest extends BaseTest {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    TestExecutionHelper testExecutionHelper=new TestExecutionHelper();

    @DataProvider(name = "outstanding-balance-dp")
    public Object[][] outstandingBalanceDP() {
        return new Object[][]{
                {"946.00"}
        };
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance1"}, dataProvider = "outstanding-balance-dp", description = "Verify check balance - pay in full yes, credit card, payment done")
    public void verify_check_balance_1(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.VALIDATE_FULL_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance2"}, dataProvider = "outstanding-balance-dp", description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan yes, plan agreed make payment yes, credit card, payment done, can i help you no, thank you")
    public void verify_check_balance_2(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_BALANCE_EQUALS_OUTSTANDING_AND_RECOMMENDED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_DATA_EQUALS_AGREED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.VALIDATE_AGREED_PLAN_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps, homePageObj, expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance3"}, dataProvider = "outstanding-balance-dp", description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount below 110, set minimum payment yes,plan agreed make payment yes, select credit card, payment done , thank you")
    public void verify_check_balance_3(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_BALANCE_EQUALS_OUTSTANDING_AND_RECOMMENDED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_AGREED_PLAN_DATA_EQUALS_MINIMUM_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.VALIDATE_AGREED_PLAN_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance4"}, dataProvider = "outstanding-balance-dp", description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount above 110, plan agreed make payment yes , credit card, payment done can i help you - no, thank you")
    public void verify_check_balance_4(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_BALANCE_EQUALS_OUTSTANDING_AND_RECOMMENDED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTERED_AMOUNT_EQUALS_AGREED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.VALIDATE_AGREED_PLAN_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance5"}, dataProvider = "outstanding-balance-dp", description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount above 110, plan agreed make payment no, remminder message")
    public void verify_check_balance_5(String expectedOutstandingBalance) {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_BALANCE_EQUALS_OUTSTANDING_AND_RECOMMENDED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTERED_AMOUNT_EQUALS_AGREED_PLAN_DATA.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj,expectedOutstandingBalance);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance6"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan yes , plan agreed make payment no, remminder message")
//    public void verify_check_balance_6() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
////            testExecutionHelper.executeTest6(testSteps,homePageObj);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance7"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan yes, plan agreed make payment yes, credit card, payment done, can i help you ? - no, thank you")
//    public void verify_check_balance_7() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance8"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan yes, plan agreed make payment no, reminder message")
//    public void verify_check_balance_8() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance9"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no, enter amount below 110, set minimum payment yes, plan agreed make payment yes, credit card, payment done, can i help you? - no, thank you")
//    public void verify_check_balance_9() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance10"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no , enter amount below 110, plan agreed make payment no, remminder message")
//    public void verify_check_balance_10() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance11"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no , enter amount above 110, plan agreed make payment yes, credit card, payment done, can i help you - no , thank you")
//    public void verify_check_balance_11() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance12"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no, enter amount above 110, plan agreed make payment no, reminder message")
//    public void verify_check_balance_12() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance13"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - one time payment, enter amount below 110, credit card, plan agreed make payment, payment confirmation message")
//    public void verify_check_balance_13() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_ONE_TIME_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_TODAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance14"}, description = "Verify check balance - pay in full yes, ACH, payment done")
//    public void verify_check_balance_14() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance15"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan yes, plan agreed make payment yes, ACH, payment done, can i help you no, thank you")
//    public void verify_check_balance_15() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance16"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount below 110, set minimum payment yes, plan agreed make payment yes, ACH, payment done can i help you? - no , thank you")
//    public void verify_check_balance_16() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance17"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount above 110,plan agreed make payment yes , ACH, payment done, can i help you - no, thank you")
//    public void verify_check_balance_17() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance18"}, description = "Verify check balance - pay in full no, setup payment plan no,formal repayment - payment plan, recommended plan yes, plan agreed make payment yes, ACH, payment done, can i help you ? - no, thank you")
//    public void verify_check_balance_18() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance19"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no, enter amount below 110, set minimum payment yes, plan agreed make payment yes, ACH, payment done, can i help you? - no, thank you")
//    public void verify_check_balance_19() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance20"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no , enter amount above 110, plan agreed make payment yes, ACH, payment done, can i help you - no , thank you")
//    public void verify_check_balance_20() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
//
//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance21"}, description = "Verify check balance - pay in full no, setup payment plan no, formal repayment - one time payment, enter amount below 110, ACH, plan agreed make payment, payment confirmation message")
//    public void verify_check_balance_21() {
//        try {
//            HomePage homePageObj = new HomePage();
//            Map<String,Boolean> testSteps= new LinkedHashMap<>();
//            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
//            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
//            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_ONE_TIME_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_TODAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
//            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
//            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
//            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
//            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
//            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
//            testExecutionHelper.executeTest(testSteps,homePageObj);
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false, ex.getMessage());
//        }
//    }
}

