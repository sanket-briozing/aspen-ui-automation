package com.briozing.automation.pageobjects;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Configuration;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.utilities.CommonMethods;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    CommonMethods commonMethods = new CommonMethods();
    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());

    public HomePage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public HomePage launch() throws Exception {
        WebDriverFactory.getDriver().get(Configuration.portalUrl);
        commonMethods.waitForPageToLoad();
        return this;
    }

    @FindBy(xpath = "//button[contains(@class,'chat-bubble-button')]")
    public WebElement askAspenButton;

    @FindBy(xpath = "//button[@class='mat-primary form-button mat-flat-button mat-button-base']/child::span[text()=' Check Balance ']")
    public WebElement checkBalanceButton;

    @FindBy(xpath = "//span[text()=' Make a Payment ']/parent::button")
    public WebElement makeAPaymentButton;

    @FindBy(xpath = "//span[contains(text(),'How would you like to continue?')]")
    public WebElement paymentOptionsMessege;

    @FindBy(xpath = "//span[contains(text(),'How would you like to continue?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Login ']/parent::button")
    public WebElement paymentOptionsLoginButton;

    @FindBy(xpath = "//span[contains(text(),'How would you like to continue?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Express Pay ']/parent::button")
    public WebElement paymentOptionsExpressPayButton;

    @FindBy(xpath = "//span[contains(text(),'How would you like to continue?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Continue as Guest ']/parent::button")
    public WebElement paymentOptionsContinueAsGuestButton;

    @FindBy(xpath = "//app-login-form-intent/app-message-bar//span")
    public WebElement loginFromMessage;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='mat-primary form-button mat-flat-button mat-button-base']/span[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//app-login-form-intent//span[contains(text(),'Create Account')]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//span[contains(text(),'You have a total outstanding balance')]")
    public WebElement totalBalanceMessage;

    @FindBy(xpath = "//span[contains(text(),'Would you like to pay in full?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement payInFullYes;

    @FindBy(xpath = "//span[contains(text(),'Would you like to pay in full?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement payInFullNo;

    @FindBy(xpath = "//span[contains(text(),'Would you like to use a credit card')]")
    public WebElement PaymentModeMessage;

    @FindBy(xpath = "//span[contains(text(),'Would you like to use a credit card/ACH for payment?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Credit Card ']/parent::button")
    public WebElement creditCardButton;

    @FindBy(xpath = "//span[contains(text(),'Would you like to use a credit card/ACH for payment?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' ACH ']/parent::button")
    public WebElement ACHButton;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Patient Name']")
    public WebElement patientNameInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Account Number']")
    public WebElement accountNumberInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Name on card']")
    public WebElement nameOnCardInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Phone Number']")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Amount($)']")
    public WebElement amountInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Card Number']")
    public WebElement cardNumberInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Card Type']")
    public WebElement cardTypeInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='CVC']")
    public WebElement cvcInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Expiry(MM-YYYY)']")
    public WebElement cardExpiryInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Address Line 1']")
    public WebElement addressline1Input;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Address Line 2']")
    public WebElement addressline2Input;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='City']")
    public WebElement cityInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='State']")
    public WebElement stateInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Zip Code']")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//app-payment-by-credit-card-form-intent/form//input[@placeholder='Country']")
    public WebElement countryInput;

    @FindBy(xpath = "//button/span[text()='Pay']")
    public WebElement payButton;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Patient Name']")
    public WebElement ACHPatientNameInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Account Number']")
    public WebElement ACHAccountNumberInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Payer name']")
    public WebElement ACHPayerNameInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Phone Number']")
    public WebElement ACHPhoneNumberInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Amount($)']")
    public WebElement ACHAmountInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Name on check']")
    public WebElement ACHNameOnCheckInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Bank name']")
    public WebElement ACHBankNameInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Bank routing number']")
    public WebElement ACHBankRoutingNumberInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Bank account number']")
    public WebElement ACHBankAccountNumberInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Bank check number']")
    public WebElement ACHBankCheckNumberInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Address Line 1']")
    public WebElement ACHAddressLine1Input;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Address Line 2']")
    public WebElement ACHAddressLine2Input;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='City']")
    public WebElement ACHCityInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='State']")
    public WebElement ACHStateInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Zip Code']")
    public WebElement ACHZipCodeInput;

    @FindBy(xpath = "//app-payment-by-ach-form-intent/form//input[@placeholder='Country']")
    public WebElement ACHCountryInput;

    @FindBy(xpath = "//app-confirmation-dialog//div[text()='Credit Card Payment Confirmation']")
    public WebElement CreditCardPaymentConfirmationMessageHeading;

    @FindBy(xpath = "//app-confirmation-dialog//div[text()='ACH Payment Confirmation']")
    public WebElement ACHPaymentConfirmationMessageHeading;

    @FindBy(xpath = "//app-confirmation-dialog//div[contains(text(),'Are you sure you want to make a payment?')]")
    public WebElement paymentConfirmationMessage;

    @FindBy(xpath = "//div[contains(text(),'Are you sure you want to make a payment?')]/ancestor::app-confirmation-dialog//button/span[contains(text(),'Confirm')]")
    public WebElement confirmPaymentButton;

    @FindBy(xpath = "//div[contains(text(),'Are you sure you want to make a payment?')]/ancestor::app-confirmation-dialog//button/span[contains(text(),'Cancel')]")
    public WebElement cancelPaymentButton;

    @FindBy(xpath = "//span[contains(text(),'Thanks !! Your payment has been posted and your confirmation number')]")
    public WebElement paymentDoneMessage;

    @FindBy(xpath = "//span[text()='Thank you! have a great day']")
    public WebElement thannkYouMessage;

    @FindBy(xpath = "//span[text()='Can I help you set up a payment plan today?']")
    public WebElement setupPaymentPlanTodayMessage;

    @FindBy(xpath = "//span[text()='Can I help you set up a payment plan today?']/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement setupPaymentPlanTodayYes;

    @FindBy(xpath = "//span[text()='Can I help you set up a payment plan today?']/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement setupPaymentPlanTodayNo;

    @FindBy(xpath = "//span[contains(text(),'recommended plan')]")
    public WebElement recommendedPlanMessage;

    @FindBy(xpath = "//span[contains(text(),'recommended plan')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement recommendedPlanYes;

    @FindBy(xpath = "//span[contains(text(),'recommended plan')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement recommendedPlanNo;

    @FindBy(xpath = "//span[contains(text(),'You have agreed to pay')]")
    public WebElement planAgreedMakePaymentMessage;

    @FindBy(xpath = "//span[contains(text(),'You have agreed to pay')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement planAgreedMakePaymentYes;

    @FindBy(xpath = "//span[contains(text(),'You have agreed to pay')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement planAgreedMakePaymentNo;

    @FindBy(xpath = "//span[contains(text(),'Your payment plan has been set up with a monthly payment of')]")
    public WebElement planPaymentDoneAndHelpMessage;

    @FindBy(xpath = "//span[contains(text(),'Your payment plan has been set up with a monthly payment of')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement planPaymentDoneHelpYes;

    @FindBy(xpath = "//span[contains(text(),'Your payment plan has been set up with a monthly payment of')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement planPaymentDoneHelpNo;

    @FindBy(xpath = "//span[text()='How much would you like to pay each month?']")
    public WebElement enterAmountToPayEachMonth;

    @FindBy(xpath = "//span[text()='How much would you like to pay each month?']/ancestor::div[@class='ng-star-inserted'][2]/following-sibling::div[1]//app-message-bar//span")
    public WebElement enteredAmountToPayEachMonth;

    @FindBy(xpath = "//span[text()='How much you would like to pay today?']")
    public WebElement enterAmountToPayToday;

    @FindBy(xpath = "//span[text()='How much you would like to pay today?']/ancestor::div[@class='ng-star-inserted'][2]/following-sibling::div[1]//app-message-bar//span")
    public WebElement enteredAmountToPayToday;

    @FindBy(xpath = "//textarea[@placeholder='Start a conversation']")
    public WebElement startConversationInput;

    @FindBy(xpath = "//span[contains(text(),'The minimum monthly payment')]")
    public WebElement minimumMonthlyPaymentMessage;

    @FindBy(xpath = "//span[contains(text(),'The minimum monthly payment')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement minimumMonthlyPaymentYes;

    @FindBy(xpath = "//span[contains(text(),'The minimum monthly payment')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement minimumMonthlyPaymentNo;

    @FindBy(xpath = "//span[contains(text(),'Please be sure to make your payment on time')]")
    public WebElement reminderMessage;

    @FindBy(xpath = "//span[contains(text(),'a formal repayment is required')]")
    public WebElement repaymentMessage;

    @FindBy(xpath = "//span[contains(text(),'a formal repayment is required')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Payment Plan ']/parent::button")
    public WebElement repaymentPaymentPlan;

    @FindBy(xpath = "//span[contains(text(),'a formal repayment is required')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' One-time Payment ']/parent::button")
    public WebElement repaymentOneTimePayment;

    @FindBy(xpath = "//span[contains(text(),'a formal repayment is required')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Other ']/parent::button")
    public WebElement repaymentOther;

    @FindBy(xpath = "//span[text()='Aspen']/parent::div/following-sibling::div[2]/img[2]")
    public WebElement crossButton;

    @FindBy(xpath = "//span[contains(text(),' Account Payment History ')]/parent::button")
    public WebElement accountPaymentHistoryButton;

    @FindBy(xpath = "//span[contains(text(),'Here are your last 5 payments made on the account')]")
    public WebElement last5PaymentsMessage;

    @FindBy(xpath = "//span[contains(text(),'Here are your last 5 payments made on the account')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'Yes')]/parent::button")
    public WebElement seeAdditionalPaymentsYesButton;

    @FindBy(xpath = "//span[contains(text(),'Here are your last 5 payments made on the account')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'No')]/parent::button")
    public WebElement seeAdditionalPaymentsNoButton;

    @FindBy(xpath = "//span[contains(text(),'Here are your last 5 payments made on the account')]/ancestor::app-message-bar/following-sibling::div[2]//tr/th")
    public List<WebElement> last5PaymentTableHeadingList;

    @FindBy(xpath="//span[contains(text(),'Here are your last 5 payments made on the account')]/ancestor::app-message-bar/following-sibling::div[2]//tbody/tr/td[1]/span")
    public List<WebElement> last5PaymentTableAccountNumberList;

    @FindBy(xpath="//span[contains(text(),'Here are your last 5 payments made on the account')]/ancestor::app-message-bar/following-sibling::div[2]//tbody/tr/td[2]/span")
    public List<WebElement> last5PaymentTablePaymentDateList;

    @FindBy(xpath="//span[contains(text(),'Here are your last 5 payments made on the account')]/ancestor::app-message-bar/following-sibling::div[2]//tbody/tr/td[3]/span")
    public List<WebElement> last5PaymentTablePaymentAmountList;

    @FindBy(xpath="//span[contains(text(),'Thank you - let me know if I can help you with something else?')]")
    public WebElement accHistoryThankYouAndHelpMessage;

    @FindBy(xpath="//span[contains(text(),'Thank you - let me know if I can help you with something else?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'Yes')]/parent::button")
    public WebElement accHistoryThankYouAndHelpYes;

    @FindBy(xpath="//span[contains(text(),'Thank you - let me know if I can help you with something else?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'No')]/parent::button")
    public WebElement accHistoryThankYouAndHelpNo;

    @FindBy(xpath="//span[text()='I can help you with:']")
    public WebElement iCanHelpYouWithMessage;

    @FindBy(xpath="//span[text()='I can help you with:']/ancestor::app-message-bar/following-sibling::app-clickable-options//span")
    public List<WebElement> iCanHelpYouWithButtons;

    @FindBy(xpath = "//span[contains(text(),'Please provide the duration')]")
    public WebElement provideDurationMessage;

    @FindBy(xpath = "//span[contains(text(),'Please provide the duration')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'3 months')]")
    public WebElement provideDuration3MonthsButton;

    @FindBy(xpath = "//span[contains(text(),'Please provide the duration')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'6 months')]")
    public WebElement provideDuration6MonthsButton;

    @FindBy(xpath = "//span[contains(text(),'Please provide the duration')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'9 months')]")
    public WebElement provideDuration9MonthsButton;

    @FindBy(xpath = "//span[contains(text(),'Please provide the duration')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'1 year')]")
    public WebElement provideDuration1YearButton;

    @FindBy(xpath = "//span[contains(text(),'Please provide the duration')]/ancestor::div[@class='ng-star-inserted'][2]/following-sibling::div[1]//app-message-bar//span")
    public WebElement providedDuration;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]")
    public WebElement recordsForProvidedDurationMessage;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'Yes')]")
    public WebElement recordsForProvidedDurationFoundYesButton;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'No')]")
    public WebElement recordsForProvidedDurationFoundNoButton;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::div[2]//tr/th")
    public List<WebElement> recordsForProvidedDurationTableHeadingList;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::div[2]//tr/th")
    public WebElement recordsForProvidedDurationTableNoRecordsFound;

    @FindBy(xpath = "//span[contains(text(),'Please contact the representative at XXX-XXX-XXXX')]")
    public WebElement contactRepresentativeMessage;

    @FindBy(xpath = "//span[contains(text(),'Please contact the representative at XXX-XXX-XXXX')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'Yes')]")
    public WebElement contactRepresentativeYes;

    @FindBy(xpath = "//span[contains(text(),'Please contact the representative at XXX-XXX-XXXX')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'No')]")
    public WebElement contactRepresentativeNo;

    @FindBy(xpath = "//span[contains(text(),'Sounds great, let me know if I can help you with something else?')]")
    public WebElement soundsGreatAndHelpMessage;

    @FindBy(xpath = "//span[contains(text(),'Sounds great, let me know if I can help you with something else?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'Yes')]")
    public WebElement soundsGreatAndHelpYes;

    @FindBy(xpath = "//span[contains(text(),'Sounds great, let me know if I can help you with something else?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[contains(text(),'No')]")
    public WebElement soundsGreatAndHelpNo;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::div[2]//tbody/tr/td[1]/span")
    public List<WebElement> recordsForProvidedDurationTableAccountNumberList;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::div[2]//tbody/tr/td[2]/span")
    public List<WebElement> recordsForProvidedDurationTablePaymentDateList;

    @FindBy(xpath = "//span[contains(text(),'Here are your payments made on the account in the last')]/ancestor::app-message-bar/following-sibling::div[2]//tbody/tr/td[3]/span")
    public List<WebElement> recordsForProvidedDurationTablePaymentAmountList;
}
