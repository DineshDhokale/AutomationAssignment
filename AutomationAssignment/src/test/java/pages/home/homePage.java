package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    WebDriver driver;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement women;

    @FindBy(xpath = "(//a[@title='T-shirts'])[1]")
    WebElement womenTshirts;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement viewList;

    @FindBy(xpath = "//span[@class='available-now']")
    WebElement inStock;

    @FindBy(xpath = "(//a[@class='quick-view'])[1]")
    WebElement quickView;

    @FindBy(xpath = "//a[@title='Close']")
    WebElement closePopup;

    @FindBy(xpath = "(//a[@class='product-name' and @itemprop='url'])[1]")
    WebElement productSelection;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantities;

    @FindBy(xpath = "//button[@name='Submit']")
    WebElement addToCart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;


    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    WebElement summaryProceedToCheckout;

    @FindBy(xpath = "//button[@name='processAddress']")
    WebElement addressProceedToCheckout;

    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement shippingProceedToCheckout;


    @FindBy(xpath = "//span[@id='total_price']")
    WebElement totalPrice;


    @FindBy(xpath = "//input[@id='cgv']")
    WebElement checkoutConfirmation;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    WebElement payByCheck;
    @FindBy(xpath = "//button[@type='submit' and @class='button btn btn-default button-medium' ]")
    WebElement paymentDone;
    @FindBy(xpath = "//a[@title='View my customer account']")
    WebElement viewMyCustomerAccount;
    @FindBy(xpath = "//a[@title='Orders']")
    WebElement orderHistory;
    @FindBy(xpath = "//td[@class='history_price']")
    WebElement historyPrice;




    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getWomenDress()
    {
        return women;
    }

    public WebElement getWomenTshirts() {
        return womenTshirts;
    }

    public WebElement getViewLists() {
        return viewList;
    }


    public WebElement getInStock() {
        return inStock;
    }

    public WebElement getQuickView() {
        return quickView;
    }


    public WebElement getClosePopup() {
        return closePopup;
    }

    public WebElement getProductSelection() {
        return productSelection;
    }

    public WebElement getQuantities() {
        return quantities;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }

    public WebElement getSummaryProceedToCheckout() {
        return summaryProceedToCheckout;
    }

    public WebElement getAddressProceedToCheckout() {
        return addressProceedToCheckout;
    }

    public WebElement getShippingProceedToCheckout() {
        return shippingProceedToCheckout;
    }



    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getCheckoutConfirmation() {
        return checkoutConfirmation;
    }

    public WebElement getPayByCheck() {
        return payByCheck;
    }

    public WebElement getPaymentDone() {
        return paymentDone;
    }

    public WebElement getViewMyCustomerAccount() {
        return viewMyCustomerAccount;
    }

    public WebElement getOrderHistory() {
        return orderHistory;
    }

    public WebElement getHistoryPrice() {
        return historyPrice;
    }


















}
