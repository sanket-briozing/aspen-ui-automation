package com.briozing.automation.helpers;

import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.pageobjects.HomePage;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.utilities.MainUtils;
import com.briozing.automation.utilities.TestSteps;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;

import java.util.Map;

public class TestExecutionHelper {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    ValidationHelper validationHelper = new ValidationHelper();
    CommonMethods commonMethods = new CommonMethods();

    public static int getRandomNumber(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

    public void executeTest(Map<String ,Boolean> testSteps, final HomePage homePage, String expectedOutstandingBalance){
        testSteps.forEach((key,value)->{executeStep(key,value,homePage,expectedOutstandingBalance);});
    }

    public void executeStep(String stepName, Boolean isStepEnabled, HomePage homePage, String expectedOutstandingBalance){
        if(TestSteps.STEP_LAUNCH_HOME_PAGE.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_LAUNCH_HOME_PAGE.name());
            try{
                homePage.launch();
                commonMethods.pause(2000);
            }catch (Exception ex){
                logger.error(ex.getMessage());
                AppAssert.assertTrue(false,ex.getMessage());
            }
        }

        if(TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_ASK_ASPEN_BUTTON_DISPLAY.name());
            validationHelper.validateAskAspenButtonDisplayed(homePage);
        }

        if(TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_ASK_ASPEN_BUTTON.name());
            homePage.askAspenButton.click();
        }

        if(TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_CHECK_BALANCE_BUTTON_DISPLAY.name());
            validationHelper.validateCheckBalanceButtonDisplayed(homePage);
        }

        if(TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_MAKE_A_PAYMENT_BUTTON_DISPLAY.name());
            validationHelper.validateMakeAPaymentButtonDisplayed(homePage);
        }

        if(TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_CHECK_BALANCE_BUTTON.name());
            homePage.checkBalanceButton.click();
        }

        if(TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_MAKE_A_PAYMENT_BUTTON.name());
            homePage.makeAPaymentButton.click();
        }

        if(TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_PAYMENT_OPTIONS_CARD_DISPLAY.name());
            validationHelper.validateAPaymentOptionsCardDisplayed(homePage);
        }

        if(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PAYMENT_OPTIONS_LOGIN.name());
            homePage.paymentOptionsLoginButton.click();
        }

        if(TestSteps.STEP_CLICK_PAYMENT_OPTIONS_EXPRESS_PAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PAYMENT_OPTIONS_EXPRESS_PAY.name());
            homePage.paymentOptionsExpressPayButton.click();
        }

        if(TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_LOGIN_FORM_DISPLAY.name());
            validationHelper.validateLoginFormDisplayed(homePage);
        }

        if(TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_FILL_CREDENTIALS_AND_LOGIN.name());
            validationHelper.fillDetailsAndLogin(homePage);
        }

        if(TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_TOTAL_OUTSTANDING_BALANCE_MESSAGE_DISPLAY.name());
            validationHelper.validateTotalOutstandingBalanceMessageDisplayed(homePage,expectedOutstandingBalance);
        }

        if(TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_PAY_IN_FULL_OPTIONS.name());
            validationHelper.validatePayInFullOptionButtonsDisplayed(homePage);
        }

        if(TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PAY_IN_FULL_YES.name());
            homePage.payInFullYes.click();
        }

        if(TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PAY_IN_FULL_NO.name());
            homePage.payInFullNo.click();
        }

        if(TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_PAYMENT_MODE_MESSAGE_DISPLAY.name());
            validationHelper.validatePaymentModeMessageDisplayed(homePage);
        }

        if(TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_CREDIT_CARD_BUTTON.name());
            homePage.creditCardButton.click();
        }

        if(TestSteps.STEP_CLICK_ACH_BUTTON.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_ACH_BUTTON.name());
            homePage.ACHButton.click();
        }

        if(TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_CREDIT_CARD_DETAILS_FORM.name());
            validationHelper.validateCreditCardDetailsFromDisplayed(homePage);
        }

        if(TestSteps.VALIDATE_AGREED_PLAN_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_AGREED_PLAN_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name());
            validationHelper.validateAgreedPlanAmountPopulatedInCreditCardDetailsFrom(homePage);
        }

        if(TestSteps.VALIDATE_FULL_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_FULL_AMOUNT_POPULATED_IN_CREDIT_CARD_DETAILS_FORM.name());
            validationHelper.validateFullAmountPopulatedInCreditCardDetailsForm(homePage);
        }

        if(TestSteps.VALIDATE_EXPRESS_PAY_CREDIT_CARD_DETAILS_FORM.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_EXPRESS_PAY_CREDIT_CARD_DETAILS_FORM.name());
            validationHelper.validateExpressPayCreditCardDetailsFromDisplayed(homePage);
        }

        if(TestSteps.VALIDATE_ACH_DETAILS_FORM.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_ACH_DETAILS_FORM.name());
            validationHelper.validateACHDetailsFromDisplayed(homePage);
        }

        if(TestSteps.VALIDATE_EXPRESS_PAY_ACH_DETAILS_FORM.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_EXPRESS_PAY_ACH_DETAILS_FORM.name());
            validationHelper.validateExpressPayACHDetailsFromDisplayed(homePage);
        }

        if(TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_FILL_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name());
            validationHelper.fillCreditCardDetailsAndPay(homePage);
        }

        if(TestSteps.STEP_FILL_EXPRESS_PAY_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_FILL_EXPRESS_PAY_CREDIT_CARD_DETAILS_AND_CLICK_PAY.name());
            validationHelper.fillExpressPayCreditCardDetailsAndPay(homePage);
        }

        if(TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_FILL_ACH_DETAILS_AND_CLICK_PAY.name());
            validationHelper.fillACHDetailsAndPay(homePage);
        }

        if(TestSteps.STEP_FILL_EXPRESS_PAY_ACH_DETAILS_AND_CLICK_PAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_FILL_EXPRESS_PAY_ACH_DETAILS_AND_CLICK_PAY.name());
            validationHelper.fillExpressPayACHDetailsAndPay(homePage);
        }

        if(TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_CREDIT_CARD_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name());
            validationHelper.validateCreditCardPaymentConfirmationPopupDisplay(homePage);
        }

        if(TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_ACH_PAYMENT_CONFIRMATION_POPUP_DISPLAY.name());
            validationHelper.validateACHPaymentConfirmationPopupDisplay(homePage);
        }

        if(TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_CONFIRM_PAYMENT.name());
            homePage.confirmPaymentButton.click();
            commonMethods.pause(2000);
        }

        if(TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_PAYMENT_DONE_CONFIRMATION_MESSAGE.name());
            validationHelper.validatePaymentDoneConfirmationMessage(homePage);
        }

        if(TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_SETUP_PAYMENT_PLAN_TODAY_CARD_DISPLAY.name());
            validationHelper.validateSetupPaymentPlanTodayCardDisplay(homePage);
        }

        if(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_YES.name());
            homePage.setupPaymentPlanTodayYes.click();
        }

        if(TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_SETUP_PAYMENT_PLAN_TODAY_NO.name());
            homePage.setupPaymentPlanTodayNo.click();
        }

        if(TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_RECOMMENDED_PLAN_CARD_DISPLAY.name());
            validationHelper.validateRecommendedPlanCardDisplay(homePage);
        }

        if(TestSteps.VALIDATE_TOTAL_BALANCE_EQUALS_OUTSTANDING_AND_RECOMMENDED_PLAN_DATA.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_TOTAL_BALANCE_EQUALS_OUTSTANDING_AND_RECOMMENDED_PLAN_DATA.name());
            validationHelper.validateTotalBalanceEqualsOutstandingAndRecommendedPlanData(homePage);
        }

        if(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_RECOMMENDED_PLAN_YES.name());
            homePage.recommendedPlanYes.click();
        }

        if(TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_RECOMMENDED_PLAN_NO.name());
            homePage.recommendedPlanNo.click();
        }

        if(TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_PLAN_AGREED_MAKE_PAYMENT_CARD_DISPLAY.name());
            validationHelper.validatePlanAgreedMakePaymentCardDisplay(homePage);
        }

        if(TestSteps.VALIDATE_ENTERED_AMOUNT_EQUALS_AGREED_PLAN_DATA.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_ENTERED_AMOUNT_EQUALS_AGREED_PLAN_DATA.name());
            validationHelper.validateEnteredAmountEqualsAgreedPlanData(homePage);
        }

        if(TestSteps.VALIDATE_AGREED_PLAN_DATA_EQUALS_MINIMUM_PLAN_DATA.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_AGREED_PLAN_DATA_EQUALS_MINIMUM_PLAN_DATA.name());
            validationHelper.validateAgreedPlanDataEqualsMinimumPlanData(homePage);
        }

        if(TestSteps.VALIDATE_RECOMMENDED_PLAN_DATA_EQUALS_AGREED_PLAN_DATA.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_RECOMMENDED_PLAN_DATA_EQUALS_AGREED_PLAN_DATA.name());
            validationHelper.validateRecommendedPlanDataEqualsAgreedPlanData(homePage);
        }

        if(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_YES.name());
            homePage.planAgreedMakePaymentYes.click();
        }

        if(TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PLAN_AGREED_MAKE_PAYMENT_NO.name());
            homePage.planAgreedMakePaymentNo.click();
        }

        if(TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_PAYMENT_DONE_AND_HELP_CARD.name());
            validationHelper.planPaymentDoneAndHelpCardDisplay(homePage);
        }

        if(TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_PAYMENT_DONE_AND_HELP_NO.name());
            homePage.planPaymentDoneHelpNo.click();
        }

        if(TestSteps.VALIDATE_THANK_YOU_MESSAGE.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_THANK_YOU_MESSAGE.name());
            validationHelper.validateThankyouMessageDisplay(homePage);
        }

        if(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_EACH_MONTH.name());
            validationHelper.validateEnterAmountToPayEachMonthMessageDisplay(homePage);
        }

        if(TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_TODAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_ENTER_AMOUNT_TO_PAY_TODAY.name());
            validationHelper.validateEnterAmountToPayTodayMessageDisplay(homePage);
        }

        if(TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_START_CONVERSATION_TEXTBOX.name());
            validationHelper.validateStartConversation(homePage);
        }

        if(TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_ENTER_AMOUNT_ABOVE_110.name());
            String numAbove=Integer.toString(getRandomNumber(150, 111));
            homePage.startConversationInput.sendKeys(numAbove + Keys.ENTER);
            logger.info("Entered amount above 110 successfully");
        }

        if(TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_ENTER_AMOUNT_BELOW_110.name());
            String numBelow=Integer.toString(getRandomNumber(109, 1));
            homePage.startConversationInput.sendKeys(numBelow + Keys.ENTER);
            logger.info("Entered amount below 110 successfully");
        }

        if(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_CARD.name());
            validationHelper.validateMinimumMonthlyPaymentCardDisplay(homePage);
        }

        if(TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_DATA.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_MINIMUM_PAYMENT_PLAN_DATA.name());
            validationHelper.validateMinimumPaymentData(homePage);
        }

        if(TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_MINIMUM_PAYMENT_PLAN_YES.name());
            homePage.minimumMonthlyPaymentYes.click();
        }

        if(TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_REMINDER_MESSAGE_DISPLAY.name());
            validationHelper.validateReminderMessageDisplay(homePage);
        }

        if(TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.VALIDATE_FORMAL_REPAYMENT_CARD_DISPLAY.name());
            validationHelper.validateFormalRepaymentCardDisplay(homePage);
        }

        if(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_FORMAL_REPAYMENT_PAYMENT_PLAN.name());
            homePage.repaymentPaymentPlan.click();
        }

        if(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_ONE_TIME_PAYMENT.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_FORMAL_REPAYMENT_ONE_TIME_PAYMENT.name());
            homePage.repaymentOneTimePayment.click();
        }

        if(TestSteps.STEP_CLICK_FORMAL_REPAYMENT_OTHER.name().equals(stepName) && isStepEnabled){
            MainUtils.stepLog(logger, TestSteps.STEP_CLICK_FORMAL_REPAYMENT_OTHER.name());
            homePage.repaymentOther.click();
        }
    }
}
