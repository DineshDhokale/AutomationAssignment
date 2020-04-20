package pages.signUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signUpPage {


        WebDriver driver;


        @FindBy(xpath = "//a[@title='Log in to your customer account']")
        WebElement signIn;

        @FindBy(xpath = "//input[@data-validate='isEmail' and @id='email_create']")
        WebElement validateEmail;

        @FindBy(xpath = "//button[@id='SubmitCreate']")
        WebElement createAccount;

        @FindBy(xpath = "//input[@id='id_gender1']")
        WebElement selectGender;

        @FindBy(xpath = "//input[@id='customer_firstname']")
        WebElement firstName;

        @FindBy(xpath = "//input[@id='customer_lastname']")
        WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailid;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwd;

    @FindBy(id="days")
    WebElement day;

    @FindBy(id="months")
    WebElement month;

    @FindBy(id="years")
    WebElement year;

    @FindBy(id="firstname")
    WebElement firstNameAdd;

    @FindBy(id="lastname")
    WebElement lastNameAdd;

    @FindBy(id="company")
    WebElement company;

    @FindBy(id="address1")
    WebElement address1;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="id_state")
    WebElement selectState;

    @FindBy(id="postcode")
    WebElement postcode;

    @FindBy(id="id_country")
    WebElement country;

    @FindBy(id="phone_mobile")
    WebElement mobileNo;

    @FindBy(id="alias")
    WebElement alias;

    @FindBy(id="submitAccount")
    WebElement registerButton;


    @FindBy(xpath="//a[@class='logout']")
    WebElement logOut;





    public signUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


        public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getValidateEmail() {
        return validateEmail;
    }

    public WebElement getCreateAccount() {
        return createAccount;
    }

    public WebElement getSelectGender() {
        return selectGender;
    }

    public WebElement getFirstName() {
        return firstName;
    }
    public WebElement getlastName() {
        return lastName;
    }

    public WebElement getEmailid() {
        return emailid;
    }

    public WebElement getPasswd() {
        return passwd;
    }

    public WebElement getDay() {
        return day;
    }

    public WebElement getMonth() {
        return month;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getFirstNameAdd() {
        return firstNameAdd;
    }

    public WebElement getLastNameAdd() {
        return lastNameAdd;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getAddress1() {
        return address1;
    }

    public WebElement getCity() {
        return city;
    }
    public WebElement getSelectState() {
        return selectState;
    }

    public WebElement getPostcode() {
        return postcode;
    }
    public WebElement getCountry() {
        return country;
    }

    public WebElement getMobileNo() {
        return mobileNo;
    }

    public WebElement getAlias() {
        return alias;
    }
    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLogOut() {
        return logOut;
    }



}

