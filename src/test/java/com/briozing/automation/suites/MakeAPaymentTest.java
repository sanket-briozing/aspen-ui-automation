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

import java.util.LinkedHashMap;
import java.util.Map;

@Listeners({MethodListener.class})
public class MakeAPaymentTest extends BaseTest {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    TestExecutionHelper testExecutionHelper=new TestExecutionHelper();

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment1"}, description = "Verify make a payment - payment option - login, pay in full yes, credit card, payment done")
    public void verify_make_a_payment_1() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment2"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan yes, plan agreed make payment yes, credit card, payment done, can i help you no, thank you")
    public void verify_make_a_payment_2() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
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
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment3"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan no, enter amount below 110, set minimum payment yes,plan agreed make payment yes, select credit card, payment done , thank you")
    public void verify_make_a_payment_3() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment4"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan no, enter amount above 110, plan agreed make payment yes , credit card, payment done can i help you - no, thank you")
    public void verify_make_a_payment_4() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment5"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan no, enter amount above 110, plan agreed make payment no, remminder message")
    public void verify_make_a_payment_5() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment6"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan yes , plan agreed make payment no, remminder message")
    public void verify_make_a_payment_6() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
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
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment7"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan yes, plan agreed make payment yes, credit card, payment done, can i help you ? - no, thank you")
    public void verify_make_a_payment_7() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment8"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan yes, plan agreed make payment no, reminder message")
    public void verify_make_a_payment_8() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment9"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no, enter amount below 110, set minimum payment yes, plan agreed make payment yes, credit card, payment done, can i help you? - no, thank you")
    public void verify_make_a_payment_9() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment10"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no , enter amount below 110, plan agreed make payment no, remminder message")
    public void verify_make_a_payment_10() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment11"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no , enter amount above 110, plan agreed make payment yes, credit card, payment done, can i help you - no , thank you")
    public void verify_make_a_payment_11() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment12"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no, enter amount above 110, plan agreed make payment no, reminder message")
    public void verify_make_a_payment_12() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment13"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - one time payment, enter amount below 110, credit card, plan agreed make payment, payment confirmation message")
    public void verify_make_a_payment_13() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_ONE_TIME_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_TODAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment14"}, description = "Verify make a payment - payment option - login, pay in full yes, ACH, payment done")
    public void verify_make_a_payment_14() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment15"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan yes, plan agreed make payment yes, ACH, payment done, can i help you no, thank you")
    public void verify_make_a_payment_15() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
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
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment16"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan no, enter amount below 110, set minimum payment yes, plan agreed make payment yes, ACH, payment done can i help you? - no , thank you")
    public void verify_make_a_payment_16() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment17"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan yes, recommended plan no, enter amount above 110,plan agreed make payment yes , ACH, payment done, can i help you - no, thank you")
    public void verify_make_a_payment_17() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment18"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no,formal repayment - payment plan, recommended plan yes, plan agreed make payment yes, ACH, payment done, can i help you ? - no, thank you")
    public void verify_make_a_payment_18() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment19"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no, enter amount below 110, set minimum payment yes, plan agreed make payment yes, ACH, payment done, can i help you? - no, thank you")
    public void verify_make_a_payment_19() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment20"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - payment plan, recommended plan no , enter amount above 110, plan agreed make payment yes, ACH, payment done, can i help you - no , thank you")
    public void verify_make_a_payment_20() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name(),true);
            testSteps.put(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MakeAPayment21"}, description = "Verify make a payment - payment option - login, pay in full no, setup payment plan no, formal repayment - one time payment, enter amount below 110, ACH, plan agreed make payment, payment confirmation message")
    public void verify_make_a_payment_21() {
        try {
            HomePage homePageObj = new HomePage();
            Map<String,Boolean> testSteps= new LinkedHashMap<>();
            testSteps.put(TestSteps.STEP_LAUNCH_HOME_PAGE.name(),true);
            testSteps.put(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name(),true);
            testSteps.put(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name(),true);
            testSteps.put(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_ONE_TIME_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_TODAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name(),true);
            testSteps.put(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_ACH_BUTTON.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_DETAILS_FORM.name(),true);
            testSteps.put(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name(),true);
            testSteps.put(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name(),true);
            testSteps.put(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name(),true);
            testSteps.put(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name(),true);
            testExecutionHelper.executeTest(testSteps,homePageObj);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }
}
