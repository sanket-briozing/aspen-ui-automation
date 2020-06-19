package com.briozing.automation.helpers;

import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.pageobjects.HomePage;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class ValidationHelper {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    CommonMethods commonMethods = new CommonMethods();

    public void validateAskAspenButtonDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.askAspenButton.isDisplayed(),"Ask Aspen button displayed");
    }

    public void validateCheckBalanceButtonDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.checkBalanceButton.isDisplayed(),"Check balance button displayed");
    }

    public void validateMakeAPaymentButtonDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.makeAPaymentButton.isDisplayed(),"Make a Payment button displayed");
    }

    public void validateAPaymentOptionsCardDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.paymentOptionsMessege.isDisplayed(),"Payment options messege displayed displayed");
        AppAssert.assertTrue(homePage.paymentOptionsLoginButton.isDisplayed(),"Payment options login button displayed");
        AppAssert.assertTrue(homePage.paymentOptionsExpressPayButton.isDisplayed(),"Payment options Express Pay button displayed");
        AppAssert.assertTrue(homePage.paymentOptionsContinueAsGuestButton.isDisplayed(),"Payment options Continue as Guest button displayed");
    }

    public void validateLoginFormDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.loginFromMessage.isDisplayed(),"Login form message displayed");
        AppAssert.assertTrue(homePage.usernameInput.isDisplayed(),"Input for username displayed");
        AppAssert.assertTrue(homePage.passwordInput.isDisplayed(),"Input for password displayed");
        AppAssert.assertTrue(homePage.loginButton.isDisplayed(),"Login button displayed");
    }

    public void validateTotalOutstandingBalanceMessageDisplayed(HomePage homePage, String expectedOutstandingBalance) {
        AppAssert.assertTrue(homePage.totalBalanceMessage.isDisplayed(),"Total outstanding balance message displayed");
        String str=homePage.totalBalanceMessage.getText();
        String actualOutstandingBalance = str.substring(str.lastIndexOf("of $")+4,str.lastIndexOf("."));
        AppAssert.assertEqual(actualOutstandingBalance,expectedOutstandingBalance,"Outstanding Balance ");
    }

    public void validatePayInFullOptionButtonsDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.payInFullYes.isDisplayed(),"Yes option displayed");
        AppAssert.assertTrue(homePage.payInFullNo.isDisplayed(),"No option displayed");
    }

    public void validatePaymentModeMessageDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.PaymentModeMessage.isDisplayed(),"Payment mode message displayed");
    }

    public void validateCreditCardDetailsFromDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.nameOnCardInput.isDisplayed(),"Input name on card displayed");
        AppAssert.assertTrue(homePage.phoneNumberInput.isDisplayed(),"Input phone number displayed");
        AppAssert.assertTrue(homePage.amountInput.isDisplayed(),"Input amount displayed");
        AppAssert.assertTrue(homePage.cardNumberInput.isDisplayed(),"Input card number displayed");
        AppAssert.assertTrue(homePage.cardTypeInput.isDisplayed(),"Input card type displayed");
        AppAssert.assertTrue(homePage.cvcInput.isDisplayed(),"Input cvc displayed");
        AppAssert.assertTrue(homePage.cardExpiryInput.isDisplayed(),"Input card expiry displayed");
        AppAssert.assertTrue(homePage.addressline1Input.isDisplayed(),"Input addressline 1 displayed");
        AppAssert.assertTrue(homePage.addressline2Input.isDisplayed(),"Input addressline 2 displayed");
        AppAssert.assertTrue(homePage.cityInput.isDisplayed(),"Input city displayed");
        AppAssert.assertTrue(homePage.stateInput.isDisplayed(),"Input state displayed");
        AppAssert.assertTrue(homePage.zipCodeInput.isDisplayed(),"Input zipcode displayed");
        AppAssert.assertTrue(homePage.countryInput.isDisplayed(),"Input country displayed");
        AppAssert.assertTrue(homePage.payButton.isDisplayed(),"Pay button displayed");
    }

    public void validateAgreedPlanAmountPopulatedInCreditCardDetailsFrom(HomePage homePage){
        String strPlanAgreedMessage=homePage.planAgreedMakePaymentMessage.getText();
        String agreedPlanAmount= strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("pay $")+5,strPlanAgreedMessage.lastIndexOf("/month"));
        AppAssert.assertEqual(homePage.amountInput.getAttribute("value"),agreedPlanAmount,"populated amount in credit card details form ");
    }

    public void validateAgreedPlanAmountPopulatedInACHDetailsForm(HomePage homePage){
        String strPlanAgreedMessage=homePage.planAgreedMakePaymentMessage.getText();
        String agreedPlanAmount= strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("pay $")+5,strPlanAgreedMessage.lastIndexOf("/month"));
        AppAssert.assertEqual(homePage.ACHAmountInput.getAttribute("value"),agreedPlanAmount,"populated amount in ACH details form ");
    }

    public void validateFullAmountPopulatedInCreditCardDetailsForm(HomePage homePage){
        String str=homePage.totalBalanceMessage.getText();
        String actualOutstandingBalance = str.substring(str.lastIndexOf("of $")+4,str.lastIndexOf(".")-3);
        AppAssert.assertEqual(homePage.amountInput.getAttribute("value"),actualOutstandingBalance,"populated amount in credit card details form ");
    }

    public void validateFullAmountPopulatedInACHDetailsForm(HomePage homePage){
        String str=homePage.totalBalanceMessage.getText();
        String actualOutstandingBalance = str.substring(str.lastIndexOf("of $")+4,str.lastIndexOf(".")-3);
        AppAssert.assertEqual(homePage.ACHAmountInput.getAttribute("value"),actualOutstandingBalance,"populated amount in ACH details form ");
    }

    public void validateExpressPayCreditCardDetailsFromDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.patientNameInput.isDisplayed(),"Input patient name displayed");
        AppAssert.assertTrue(homePage.accountNumberInput.isDisplayed(),"Input account number displayed");
        AppAssert.assertTrue(homePage.nameOnCardInput.isDisplayed(),"Input name on card displayed");
        AppAssert.assertTrue(homePage.phoneNumberInput.isDisplayed(),"Input phone number displayed");
        AppAssert.assertTrue(homePage.amountInput.isDisplayed(),"Input amount displayed");
        AppAssert.assertTrue(homePage.cardNumberInput.isDisplayed(),"Input card number displayed");
        AppAssert.assertTrue(homePage.cardTypeInput.isDisplayed(),"Input card type displayed");
        AppAssert.assertTrue(homePage.cvcInput.isDisplayed(),"Input cvc displayed");
        AppAssert.assertTrue(homePage.cardExpiryInput.isDisplayed(),"Input card expiry displayed");
        AppAssert.assertTrue(homePage.addressline1Input.isDisplayed(),"Input addressline 1 displayed");
        AppAssert.assertTrue(homePage.addressline2Input.isDisplayed(),"Input addressline 2 displayed");
        AppAssert.assertTrue(homePage.cityInput.isDisplayed(),"Input city displayed");
        AppAssert.assertTrue(homePage.stateInput.isDisplayed(),"Input state displayed");
        AppAssert.assertTrue(homePage.zipCodeInput.isDisplayed(),"Input zipcode displayed");
        AppAssert.assertTrue(homePage.countryInput.isDisplayed(),"Input country displayed");
        AppAssert.assertTrue(homePage.payButton.isDisplayed(),"Pay button displayed");
    }

    public void validateACHDetailsFromDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.ACHPayerNameInput.isDisplayed(),"Input Payer name displayed");
        AppAssert.assertTrue(homePage.ACHPhoneNumberInput.isDisplayed(),"Input phone number displayed");
        AppAssert.assertTrue(homePage.ACHAmountInput.isDisplayed(),"Input amount displayed");
        AppAssert.assertTrue(homePage.ACHNameOnCheckInput.isDisplayed(),"Input name on check displayed");
        AppAssert.assertTrue(homePage.ACHBankNameInput.isDisplayed(),"Input bank name displayed");
        AppAssert.assertTrue(homePage.ACHBankRoutingNumberInput.isDisplayed(),"Input bank routing number displayed");
        AppAssert.assertTrue(homePage.ACHBankAccountNumberInput.isDisplayed(),"Input bank account number displayed");
        AppAssert.assertTrue(homePage.ACHBankCheckNumberInput.isDisplayed(),"Input bank check number displayed");
        AppAssert.assertTrue(homePage.payButton.isDisplayed(),"Pay button displayed");
    }

    public void validateExpressPayACHDetailsFromDisplayed(HomePage homePage) {
        AppAssert.assertTrue(homePage.ACHPatientNameInput.isDisplayed(),"Input Patient name displayed");
        AppAssert.assertTrue(homePage.ACHAccountNumberInput.isDisplayed(),"Input account number displayed");
        AppAssert.assertTrue(homePage.ACHPayerNameInput.isDisplayed(),"Input Payer name displayed");
        AppAssert.assertTrue(homePage.ACHPhoneNumberInput.isDisplayed(),"Input phone number displayed");
        AppAssert.assertTrue(homePage.ACHAmountInput.isDisplayed(),"Input amount displayed");
        AppAssert.assertTrue(homePage.ACHNameOnCheckInput.isDisplayed(),"Input name on check displayed");
        AppAssert.assertTrue(homePage.ACHBankNameInput.isDisplayed(),"Input bank name displayed");
        AppAssert.assertTrue(homePage.ACHBankRoutingNumberInput.isDisplayed(),"Input bank routing number displayed");
        AppAssert.assertTrue(homePage.ACHBankAccountNumberInput.isDisplayed(),"Input bank account number displayed");
        AppAssert.assertTrue(homePage.ACHBankCheckNumberInput.isDisplayed(),"Input bank check number displayed");
        AppAssert.assertTrue(homePage.payButton.isDisplayed(),"Pay button displayed");
    }

    public void validateCreditCardPaymentConfirmationPopupDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.CreditCardPaymentConfirmationMessageHeading.isDisplayed(),"Credit card Payment confirmation message heading displayed");
        AppAssert.assertTrue(homePage.paymentConfirmationMessage.isDisplayed(),"Payment confirmation message displayed");
        AppAssert.assertTrue(homePage.confirmPaymentButton.isDisplayed(),"confirm button displayed");
        AppAssert.assertTrue(homePage.cancelPaymentButton.isDisplayed(),"cancel button displayed");
    }

    public void validateACHPaymentConfirmationPopupDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.ACHPaymentConfirmationMessageHeading.isDisplayed(),"ACH Payment confirmation message heading displayed");
        AppAssert.assertTrue(homePage.paymentConfirmationMessage.isDisplayed(),"Payment confirmation message displayed");
        AppAssert.assertTrue(homePage.confirmPaymentButton.isDisplayed(),"confirm button displayed");
        AppAssert.assertTrue(homePage.cancelPaymentButton.isDisplayed(),"cancel button displayed");
    }

    public void validatePaymentDoneConfirmationMessage(HomePage homePage){
        AppAssert.assertTrue(homePage.paymentDoneMessage.isDisplayed(),"Payment done and confirmation number displayed");
        String strMessage = homePage.paymentDoneMessage.getText();
        String confirmationNumber = strMessage.substring(strMessage.lastIndexOf("number is ")+10,strMessage.lastIndexOf(". Payment"));
        AppAssert.assertEqual(confirmationNumber,"123456","Confirmation Number ");
    }

    public void validateSetupPaymentPlanTodayCardDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.setupPaymentPlanTodayMessage.isDisplayed(),"Can I help you set up a payment plan today? message displayed");
        AppAssert.assertTrue(homePage.setupPaymentPlanTodayYes.isDisplayed(),"Yes button displayed");
        AppAssert.assertTrue(homePage.setupPaymentPlanTodayNo.isDisplayed(),"No button displayed");
    }

    public void validateRecommendedPlanCardDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.recommendedPlanMessage.isDisplayed(),"Recommended plan message displayed");
        AppAssert.assertTrue(homePage.recommendedPlanYes.isDisplayed(),"Yes button displayed");
        AppAssert.assertTrue(homePage.recommendedPlanNo.isDisplayed(),"No button displayed");
    }

    public void validateTotalBalanceEqualsOutstandingAndRecommendedPlanData(HomePage homePage){
        String strRecommended=homePage.recommendedPlanMessage.getText();
        String totalBalance =strRecommended.substring(strRecommended.lastIndexOf("of $")+4,strRecommended.lastIndexOf(", the"));
        String outstanding=homePage.totalBalanceMessage.getText();
        String outstandingBalance = outstanding.substring(outstanding.lastIndexOf("of $")+4,outstanding.lastIndexOf("."));
        String recommendedPlanAmount= strRecommended.substring(strRecommended.lastIndexOf("is $")+4,strRecommended.lastIndexOf("/month"));
        String recommendedPlanDuration= strRecommended.substring(strRecommended.lastIndexOf("/month for ")+11,strRecommended.lastIndexOf(" months"));
        AppAssert.assertEqual(totalBalance,outstandingBalance,"Recommended plan total balance: ");
        AppAssert.assertEqual(recommendedPlanAmount,"160","Recommended plan amount: ");
        AppAssert.assertEqual(recommendedPlanDuration,"6","Recommended plan duration: ");
    }

    public void validatePlanAgreedMakePaymentCardDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.planAgreedMakePaymentMessage.isDisplayed(),"Plan agreed make 1st payment message displayed");
        AppAssert.assertTrue(homePage.planAgreedMakePaymentYes.isDisplayed(),"Plan agreed Yes button displayed");
        AppAssert.assertTrue(homePage.planAgreedMakePaymentNo.isDisplayed(),"Plan agreed No button displayed");
    }

    public void validateEnteredAmountToPayEachMonthEqualsAgreedPlanData(HomePage homePage){
        String strPlanAgreedMessage=homePage.planAgreedMakePaymentMessage.getText();
        String agreedPlanAmount =strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("pay $")+5,strPlanAgreedMessage.lastIndexOf("/month"));
        String agreedPlanDuration =strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("for ")+4,strPlanAgreedMessage.lastIndexOf(" months"));
        int agreedPlanDurationInt=Integer.parseInt(agreedPlanDuration);
        String enteredAmount=homePage.enteredAmountToPayEachMonth.getText();
        int enteredAmountInt=Integer.parseInt(enteredAmount);
        String outstandingBalanceMessage=homePage.totalBalanceMessage.getText();
        int outstandingBalance = Integer.parseInt(outstandingBalanceMessage.substring(outstandingBalanceMessage.lastIndexOf("of $")+4,outstandingBalanceMessage.lastIndexOf(".")-3));
        float expectedDurationFloat= outstandingBalance/enteredAmountInt;
        if (expectedDurationFloat<agreedPlanDurationInt){
            expectedDurationFloat++;
        }
        int expectedDurationInt=Math.round(expectedDurationFloat);
        String expectedDuration=Integer.toString(expectedDurationInt);
        AppAssert.assertEqual(agreedPlanAmount, enteredAmount,"Agreed plan amount ");
        AppAssert.assertEqual(agreedPlanDuration, expectedDuration,"Agreed plan duration ");
    }

    public void validateEnteredAmountToPayTodayPopulatedInCreditCardDetailsForm(HomePage homePage){
        String enteredAmount=homePage.enteredAmountToPayToday.getText();
        AppAssert.assertEqual(homePage.amountInput.getAttribute("value"),enteredAmount,"Populated amount in credit card details form ");
    }

    public void validateAgreedPlanDataEqualsMinimumPlanData(HomePage homePage){
        String strPlanAgreedMessage=homePage.planAgreedMakePaymentMessage.getText();
        String agreedPlanAmount =strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("pay $")+5,strPlanAgreedMessage.lastIndexOf("/month"));
        String agreedPlanDuration =strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("for ")+4,strPlanAgreedMessage.lastIndexOf(" months"));
        String strMinimumPlan=homePage.minimumMonthlyPaymentMessage.getText();
        String minAmount= strMinimumPlan.substring(strMinimumPlan.lastIndexOf("for $")+5,strMinimumPlan.lastIndexOf("/month"));
        String minDuration= strMinimumPlan.substring(strMinimumPlan.lastIndexOf("for ")+4,strMinimumPlan.lastIndexOf(" months"));
        AppAssert.assertEqual(agreedPlanAmount,minAmount,"Agreed plan amount");
        AppAssert.assertEqual(agreedPlanDuration,minDuration,"Agreed plan duration");
    }

    public void validateRecommendedPlanDataEqualsAgreedPlanData(HomePage homePage){
        String strPlanAgreedMessage=homePage.planAgreedMakePaymentMessage.getText();
        String strRecommended=homePage.recommendedPlanMessage.getText();
        String agreedPlanAmount= strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("pay $")+5,strPlanAgreedMessage.lastIndexOf("/month"));
        String agreedPlanDuration= strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("/month for ")+11,strPlanAgreedMessage.lastIndexOf(" months"));
        String recommendedPlanAmount= strRecommended.substring(strRecommended.lastIndexOf("is $")+4,strRecommended.lastIndexOf("/month"));
        String recommendedPlanDuration= strRecommended.substring(strRecommended.lastIndexOf("/month for ")+11,strRecommended.lastIndexOf(" months"));
        AppAssert.assertEqual(agreedPlanAmount,recommendedPlanAmount,"Agreed plan amount: ");
        AppAssert.assertEqual(agreedPlanDuration,recommendedPlanDuration,"Agreed plan duration: ");
    }

    public void planPaymentDoneAndHelpCardDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.planPaymentDoneAndHelpMessage.isDisplayed(),"Plan payment done. can i help you? message displayed");
        AppAssert.assertTrue(homePage.planPaymentDoneHelpYes.isDisplayed(),"can i help you? Yes button displayed");
        AppAssert.assertTrue(homePage.planPaymentDoneHelpNo.isDisplayed(),"can i help you? No button displayed");
    }

    public void validateThankyouMessageDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.thannkYouMessage.isDisplayed(),"Thank you! have a great day message displayed");
    }

    public void validateEnterAmountToPayEachMonthMessageDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.enterAmountToPayEachMonth.isDisplayed(),"How much would you like to pay each month? message displayed");
    }

    public void validateEnterAmountToPayTodayMessageDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.enterAmountToPayToday.isDisplayed(),"How much would you like to pay today? message displayed");
    }

    public void validateStartConversation(HomePage homePage){
        AppAssert.assertTrue(homePage.startConversationInput.isDisplayed(),"Start conversation input area displayed");
    }

    public void validateMinimumMonthlyPaymentCardDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.minimumMonthlyPaymentMessage.isDisplayed(),"Minimum monthly payment message displayed");
        AppAssert.assertTrue(homePage.minimumMonthlyPaymentYes.isDisplayed(),"Minimum monthly payment yes button displayed");
        AppAssert.assertTrue(homePage.minimumMonthlyPaymentNo.isDisplayed(),"Minimum monthly payment no button displayed");
    }

    public void validateMinimumPaymentData(HomePage homePage){
        String strMinimumPlan=homePage.minimumMonthlyPaymentMessage.getText();
        String minAllowed= strMinimumPlan.substring(strMinimumPlan.lastIndexOf("is $")+4,strMinimumPlan.lastIndexOf(". Would"));
        String minAmount= strMinimumPlan.substring(strMinimumPlan.lastIndexOf("for $")+5,strMinimumPlan.lastIndexOf("/month"));
        String minDuration= strMinimumPlan.substring(strMinimumPlan.lastIndexOf("for ")+4,strMinimumPlan.lastIndexOf(" months"));
        AppAssert.assertEqual(minAllowed,"110","minimum monthly payment allowed ");
        AppAssert.assertEqual(minAmount,"110","plan amount ");
        AppAssert.assertEqual(minDuration,"9","plan duration ");
    }

    public void validateReminderMessageDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.reminderMessage.isDisplayed(),"Reminder payment message displayed");
    }

    public void validateFormalRepaymentCardDisplay(HomePage homePage){
        AppAssert.assertTrue(homePage.repaymentMessage.isDisplayed(),"Formal repayment message displayed");
        AppAssert.assertTrue(homePage.repaymentPaymentPlan.isDisplayed(),"Payment plan button displayed");
        AppAssert.assertTrue(homePage.repaymentOneTimePayment.isDisplayed(),"One time payment button displayed");
        AppAssert.assertTrue(homePage.repaymentOther.isDisplayed(),"Other button displayed");
    }

    public void fillDetailsAndLogin(HomePage homePage){
        homePage.usernameInput.sendKeys("ActTest001");
        homePage.passwordInput.sendKeys("Password");
        homePage.loginButton.click();
        commonMethods.pause(2000);
    }

    public void fillCreditCardDetailsAndPay(HomePage homePage){
        homePage.nameOnCardInput.sendKeys("Jane Doe");
        homePage.phoneNumberInput.sendKeys("303-296-3599");
        homePage.cardNumberInput.sendKeys("4293 1891 0000 0008");
        homePage.cvcInput.sendKeys("123");
        homePage.cardExpiryInput.sendKeys("09-2020");
        homePage.addressline1Input.sendKeys("1597 COLE BLVD");
        homePage.addressline2Input.sendKeys("STE 150");
        homePage.cityInput.sendKeys("Lakewood");
        homePage.stateInput.sendKeys("CO");
        homePage.zipCodeInput.sendKeys("80401");
        homePage.countryInput.sendKeys("US");
        homePage.payButton.click();
        commonMethods.pause(2000);
    }

    public void fillExpressPayCreditCardDetailsAndPay(HomePage homePage){
        homePage.patientNameInput.sendKeys("Jane Doe");
        homePage.accountNumberInput.sendKeys("Test001");
        homePage.nameOnCardInput.sendKeys("Jane Doe");
        homePage.phoneNumberInput.sendKeys("303-296-3599");
        homePage.amountInput.sendKeys("900");
        homePage.cardNumberInput.sendKeys("4293 1891 0000 0008");
        homePage.cvcInput.sendKeys("123");
        homePage.cardExpiryInput.sendKeys("09-2020");
        homePage.addressline1Input.sendKeys("1597 COLE BLVD");
        homePage.addressline2Input.sendKeys("STE 150");
        homePage.cityInput.sendKeys("Lakewood");
        homePage.stateInput.sendKeys("CO");
        homePage.zipCodeInput.sendKeys("80401");
        homePage.countryInput.sendKeys("US");
        homePage.payButton.click();
        commonMethods.pause(2000);
    }

    public void fillACHDetailsAndPay(HomePage homePage){
        homePage.ACHPayerNameInput.sendKeys("Jane Doe");
        homePage.ACHPhoneNumberInput.sendKeys("303-296-3599");
        homePage.ACHNameOnCheckInput.sendKeys("Jane Doe");
        homePage.ACHBankNameInput.sendKeys("Bank Of HON");
        homePage.ACHBankRoutingNumberInput.sendKeys("110000000");
        homePage.ACHBankAccountNumberInput.sendKeys("000123456789");
        homePage.ACHBankCheckNumberInput.sendKeys("1001");
        homePage.payButton.click();
        commonMethods.pause(2000);
    }

    public void fillExpressPayACHDetailsAndPay(HomePage homePage){
        homePage.ACHPatientNameInput.sendKeys("Jane Doe");
        homePage.ACHAccountNumberInput.sendKeys("Test001");
        homePage.ACHPayerNameInput.sendKeys("Jane Doe");
        homePage.ACHPhoneNumberInput.sendKeys("303-296-3599");
        homePage.ACHAmountInput.sendKeys("900");
        homePage.ACHNameOnCheckInput.sendKeys("Jane Doe");
        homePage.ACHBankNameInput.sendKeys("Bank Of HON");
        homePage.ACHBankRoutingNumberInput.sendKeys("110000000");
        homePage.ACHBankAccountNumberInput.sendKeys("000123456789");
        homePage.ACHBankCheckNumberInput.sendKeys("1001");
        homePage.payButton.click();
        commonMethods.pause(2000);
    }

    public void validateConfirmationNumberAmountDueDate(HomePage homePage){
        String strMessage = homePage.planPaymentDoneAndHelpMessage.getText();
        String confirmationNumber = strMessage.substring(strMessage.lastIndexOf("number is ")+10,strMessage.lastIndexOf(". Payment"));
        String planAmount= strMessage.substring(strMessage.lastIndexOf("of $")+4,strMessage.lastIndexOf(" with the next"));
        String nextDueDate= strMessage.substring(strMessage.lastIndexOf("date ")+5,strMessage.lastIndexOf(". Let"));
        String strPlanAgreedMessage=homePage.planAgreedMakePaymentMessage.getText();
        String agreedPlanAmount= strPlanAgreedMessage.substring(strPlanAgreedMessage.lastIndexOf("pay $")+5,strPlanAgreedMessage.lastIndexOf("/month"));
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.MONTH, 1);
        Date nextDueDateExp = cal.getTime();
        String nextDueDateExpected=formatter.format(nextDueDateExp);
        AppAssert.assertEqual(confirmationNumber,"123456","Confirmation Number ");
        AppAssert.assertEqual(planAmount,agreedPlanAmount,"Confirmed plan amount ");
        AppAssert.assertEqual(nextDueDate,nextDueDateExpected,"Next payment due date ");
    }
}
