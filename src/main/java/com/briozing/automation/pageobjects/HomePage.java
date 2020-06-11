package com.briozing.automation.pageobjects;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Configuration;
import com.briozing.automation.utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    CommonMethods commonMethods = new CommonMethods();

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

    @FindBy(xpath = "//span[contains(text(),'Please login with your username and password')]")
    public WebElement loginFromMessage;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='mat-primary form-button mat-flat-button mat-button-base']/span[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='You have a total outstanding balance of $946.00. Would you like to pay in full?']")
    public WebElement totalBalanceMessage;

    @FindBy(xpath = "//span[contains(text(),'Would you like to pay in full?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement payInFullYes;

    @FindBy(xpath = "//span[contains(text(),'Would you like to pay in full?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement payInFullNo;

    @FindBy(xpath = "//span[contains(text(),'Would you like to use a credit card')]")
    public WebElement PaymentModeMessage;

    @FindBy(xpath = "//span[contains(text(),'Would you like to use a credit card/ACH for payment?')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Credit Card ']/parent::button")
    public WebElement creditCardButton;

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

    @FindBy(xpath = "//app-confirmation-dialog//div[text()='Credit Card Payment Confirmation']")
    public WebElement paymentConfirmationMessageHeading;

    @FindBy(xpath = "//app-confirmation-dialog//div[text()='Are you sure you want to make a payment?']")
    public WebElement paymentConfirmationMessage;

    @FindBy(xpath = "//div[text()='Are you sure you want to make a payment?']/ancestor::app-confirmation-dialog//button/span[text()=' Confirm ']")
    public WebElement confirmPaymentButton;

    @FindBy(xpath = "//div[text()='Are you sure you want to make a payment?']/ancestor::app-confirmation-dialog//button/span[text()=' Cancel ']")
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
    public WebElement enterEMIMessage;

    @FindBy(xpath = "//textarea[@placeholder='Start a conversation']")
    public WebElement startConversationInput;

    @FindBy(xpath = "//span[contains(text(),'The minimum monthly payment')]")
    public WebElement minimumMonthlyPaymentMessage;

    @FindBy(xpath = "//span[contains(text(),'The minimum monthly payment')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' Yes ']/parent::button")
    public WebElement minimumMonthlyPaymentYes;

    @FindBy(xpath = "//span[contains(text(),'The minimum monthly payment')]/ancestor::app-message-bar/following-sibling::app-clickable-options//span[text()=' No ']/parent::button")
    public WebElement minimumMonthlyPaymentNo;

    public void askAspenButtonClick() throws Exception {
        askAspenButton.click();
        commonMethods.pause(2000);
    }
}
