package com.briozing.automation.helpers;

import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.pageobjects.HomePage;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.utilities.TestSteps;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;

import java.util.Map;

public class TestExecutionHelper {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    ValidationHelper validationHelper = new ValidationHelper();
    CommonMethods commonMethods = new CommonMethods();

    public void executeTest1(Map<String,Boolean> testSteps, HomePage homePage){
        if(testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())!=null && testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())){
            try{
                homePage.launch();
                commonMethods.pause(2000);
            }catch (Exception ex){
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false,ex.getMessage());
            }
        }

        if(testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())){
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())){
            homePage.askAspenButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())){
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())){
            homePage.checkBalanceButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())){
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())!=null && testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())){
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())){
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())!=null && testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())){
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name())){
            homePage.payInFullYes.click();
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())){
            homePage.payInFullNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())){
            validationHelper.validatePaymentModeMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())){
            homePage.creditCardButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())){
            validationHelper.validatePaymentDetailsFromDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())!=null && testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())){
            validationHelper.fillPaymentDetailsAndPay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())){
            validationHelper.validatePaymentConfirmationPopupDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())){
            homePage.confirmPaymentButton.click();
            commonMethods.pause(2000);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name())){
            validationHelper.validatePaymentDoneConfirmationMessage(homePage);
        }
    }

    public void executeTest2(Map<String,Boolean> testSteps, HomePage homePage) {
        if (testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name()) != null && testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())) {
            try {
                homePage.launch();
                commonMethods.pause(2000);
            } catch (Exception ex) {
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false, ex.getMessage());
            }
        }

        if (testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name()) != null && testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())) {
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name()) != null && testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())) {
            homePage.askAspenButton.click();
        }

        if (testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name()) != null && testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())) {
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name()) != null && testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())) {
            homePage.checkBalanceButton.click();
        }

        if (testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name()) != null && testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())) {
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name()) != null && testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())) {
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if (testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name()) != null && testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())) {
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name()) != null && testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())) {
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name()) != null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name())) {
            homePage.payInFullYes.click();
        }

        if (testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name()) != null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())) {
            homePage.payInFullNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())){
            validationHelper.validateSetupPaymentPlanTodayCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())){
            homePage.setupPaymentPlanTodayYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())){
            validationHelper.validateRecommendedPlanCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name())){
            homePage.recommendedPlanYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())){
            validationHelper.planAgreedMakePaymentCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name())){
            homePage.planAgreedMakePaymentYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())){
            validationHelper.validatePaymentModeMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())){
            homePage.creditCardButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())){
            validationHelper.validatePaymentDetailsFromDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())!=null && testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())){
            validationHelper.fillPaymentDetailsAndPay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())){
            validationHelper.validatePaymentConfirmationPopupDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())){
            homePage.confirmPaymentButton.click();
            commonMethods.pause(2000);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name())){
            validationHelper.planPaymentDoneAndHelpCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name())){
            homePage.planPaymentDoneHelpNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name())){
            validationHelper.validateThankyouMessageDisplay(homePage);
        }
    }

    public void executeTest3(Map<String,Boolean> testSteps, HomePage homePage) {
        if(testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())!=null && testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())){
            try{
                homePage.launch();
                commonMethods.pause(2000);
            }catch (Exception ex){
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false,ex.getMessage());
            }
        }

        if(testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())){
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())){
            homePage.askAspenButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())){
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())){
            homePage.checkBalanceButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())){
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())!=null && testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())){
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())){
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())!=null && testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())){
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name()) != null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())) {
            homePage.payInFullNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())){
            validationHelper.validateSetupPaymentPlanTodayCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())){
            homePage.setupPaymentPlanTodayYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())){
            validationHelper.validateRecommendedPlanCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name())){
            homePage.recommendedPlanNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name())){
            validationHelper.validateEnterEMIMessageDisplay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name())!=null && testSteps.get(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name())){
            validationHelper.validateStartConversation(homePage);
        }

        if(testSteps.get(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name())!=null && testSteps.get(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name())){
            homePage.startConversationInput.sendKeys("50" + Keys.ENTER);
        }

        if(testSteps.get(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name())!=null && testSteps.get(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name())){
            validationHelper.validateMinimumMonthlyPaymentCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name())){
            homePage.minimumMonthlyPaymentYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())){
            validationHelper.planAgreedMakePaymentCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name())){
            homePage.planAgreedMakePaymentYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())){
            validationHelper.validatePaymentModeMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())){
            homePage.creditCardButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())){
            validationHelper.validatePaymentDetailsFromDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())!=null && testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())){
            validationHelper.fillPaymentDetailsAndPay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())){
            validationHelper.validatePaymentConfirmationPopupDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())){
            homePage.confirmPaymentButton.click();
            commonMethods.pause(2000);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name())){
            validationHelper.planPaymentDoneAndHelpCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name())){
            homePage.planPaymentDoneHelpNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name())){
            validationHelper.validateThankyouMessageDisplay(homePage);
        }
    }

    public void executeTest4(Map<String,Boolean> testSteps, HomePage homePage) {
        if(testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())!=null && testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())){
            try{
                homePage.launch();
                commonMethods.pause(2000);
            }catch (Exception ex){
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false,ex.getMessage());
            }
        }

        if(testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())){
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())){
            homePage.askAspenButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())){
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())){
            homePage.checkBalanceButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())){
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())!=null && testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())){
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())){
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())!=null && testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())){
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name()) != null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())) {
            homePage.payInFullNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())){
            validationHelper.validateSetupPaymentPlanTodayCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())){
            homePage.setupPaymentPlanTodayYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())){
            validationHelper.validateRecommendedPlanCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name())){
            homePage.recommendedPlanNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name())){
            validationHelper.validateEnterEMIMessageDisplay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name())!=null && testSteps.get(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name())){
            validationHelper.validateStartConversation(homePage);
        }

        if(testSteps.get(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name())!=null && testSteps.get(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name())){
            homePage.startConversationInput.sendKeys("120" + Keys.ENTER);
        }

        if(testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())){
            validationHelper.planAgreedMakePaymentCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name())){
            homePage.planAgreedMakePaymentYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name())){
            validationHelper.validatePaymentModeMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name())){
            homePage.creditCardButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DETAILS_FORM.name())){
            validationHelper.validatePaymentDetailsFromDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())!=null && testSteps.get(TestSteps.STEP_FILL_PAYMENT_DETAILS_AND_CLICK_PAY.name())){
            validationHelper.fillPaymentDetailsAndPay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name())){
            validationHelper.validatePaymentConfirmationPopupDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name())){
            homePage.confirmPaymentButton.click();
            commonMethods.pause(2000);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name())!=null && testSteps.get(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name())){
            validationHelper.planPaymentDoneAndHelpCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name())){
            homePage.planPaymentDoneHelpNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name())){
            validationHelper.validateThankyouMessageDisplay(homePage);
        }
    }

    public void executeTest5(Map<String,Boolean> testSteps, HomePage homePage) {
        if(testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())!=null && testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())){
            try{
                homePage.launch();
                commonMethods.pause(2000);
            }catch (Exception ex){
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false,ex.getMessage());
            }
        }

        if(testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())){
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())){
            homePage.askAspenButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())){
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())){
            homePage.checkBalanceButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())){
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())!=null && testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())){
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())){
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())!=null && testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())){
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name()) != null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())) {
            homePage.payInFullNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())){
            validationHelper.validateSetupPaymentPlanTodayCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())){
            homePage.setupPaymentPlanTodayYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())){
            validationHelper.validateRecommendedPlanCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name())){
            homePage.recommendedPlanNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name())!=null && testSteps.get(TestSteps.VALIDATE_ENTER_EMI_MESSAGE.name())){
            validationHelper.validateEnterEMIMessageDisplay(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name())!=null && testSteps.get(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name())){
            validationHelper.validateStartConversation(homePage);
        }

        if(testSteps.get(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name())!=null && testSteps.get(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name())){
            homePage.startConversationInput.sendKeys("120" + Keys.ENTER);
        }

        if(testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())){
            validationHelper.planAgreedMakePaymentCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name())){
            homePage.planAgreedMakePaymentNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name())){
            validationHelper.validateReminderMessageDisplay(homePage);
        }
    }

    public void executeTest6(Map<String,Boolean> testSteps, HomePage homePage) {
        if(testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())!=null && testSteps.get(TestSteps.STEP_LAUNCH_HOME_PAGE.name())){
            try{
                homePage.launch();
                commonMethods.pause(2000);
            }catch (Exception ex){
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false,ex.getMessage());
            }
        }

        if(testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name())){
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name())){
            homePage.askAspenButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name())){
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())!=null && testSteps.get(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name())){
            homePage.checkBalanceButton.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name())){
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())!=null && testSteps.get(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name())){
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name())){
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage);
        }

        if(testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())!=null && testSteps.get(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name())){
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if (testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name()) != null && testSteps.get(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name())) {
            homePage.payInFullNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name())){
            validationHelper.validateSetupPaymentPlanTodayCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name())){
            homePage.setupPaymentPlanTodayYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name())){
            validationHelper.validateRecommendedPlanCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name())!=null && testSteps.get(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name())){
            homePage.recommendedPlanYes.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name())){
            validationHelper.planAgreedMakePaymentCardDisplay(homePage);
        }

        if(testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name())!=null && testSteps.get(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name())){
            homePage.planAgreedMakePaymentNo.click();
        }

        if(testSteps.get(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name())!=null && testSteps.get(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name())){
            validationHelper.validateReminderMessageDisplay(homePage);
        }
    }
}
