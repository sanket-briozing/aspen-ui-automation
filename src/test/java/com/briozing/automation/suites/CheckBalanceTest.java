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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

@Listeners({MethodListener.class})
public class CheckBalanceTest extends BaseTest {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    TestExecutionHelper testExecutionHelper=new TestExecutionHelper();

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance1"}, description = "Verify check balance - pay in full yes, credit card, payment done")
    public void verify_check_balance_1() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new HashMap();
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
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
            testExecutionHelper.executeTest1(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance2"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan yes, make payment yes, credit card, payment done, can i help you no, thank you")
    public void verify_check_balance_2() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new HashMap();
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
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest2(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance3"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount below 110, set minimum payment yes, make payment yes,select credit card, payment done , thank you")
    public void verify_check_balance_3() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new HashMap();
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
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest3(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "CheckBalance4"}, description = "Verify check balance - pay in full no, setup payment plan yes, recommended plan no, enter amount above 110, make payment yes,select credit card, payment done , thank you")
    public void verify_check_balance_4() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new HashMap();
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
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest4(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }
}

