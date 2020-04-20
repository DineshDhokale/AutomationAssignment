package tests.signUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.login.loginPage;
import pages.signUp.signUpPage;
import utility.dataConfig.ReadExcel;

import java.io.IOException;

public class signUpTest {


        WebDriver driver;
        signUpPage sup;
        WebDriverWait wait;
        JavascriptExecutor js;
        ReadExcel rd;



        public void TestSignUp(WebDriver driver) throws IOException, Exception {

        this.driver = driver;
        wait = new WebDriverWait(driver, 40);
        js = (JavascriptExecutor) driver;
        sup = new signUpPage(driver);
        rd=new ReadExcel();



        js.executeScript("window.scrollBy(0,200)");

        sup.getSignIn().click();

        sup.getValidateEmail().sendKeys(rd.getData(0, 1, 0));

        sup.getCreateAccount().click();

        js.executeScript("window.scrollBy(0,200)");

        sup.getSelectGender().click();

        sup.getFirstName().sendKeys(rd.getData(0, 1, 1));

        sup.getlastName().sendKeys(rd.getData(0, 1, 2));

        sup.getEmailid().clear();
        sup.getEmailid().sendKeys(rd.getData(0, 1, 0));

        sup.getPasswd().sendKeys(rd.getData(0, 1, 3));

        Select day = new  Select(sup.getDay());
        day.selectByValue("14");

        Select month = new  Select(sup.getMonth());
        month.selectByIndex(7);

        Select year = new  Select(sup.getYear());
        year.selectByValue("1992");

        js.executeScript("window.scrollBy(0,200)");

        sup.getFirstNameAdd().clear();
        sup.getFirstNameAdd().sendKeys(rd.getData(0, 1, 1));

        sup.getLastNameAdd().clear();
        sup.getLastNameAdd().sendKeys(rd.getData(0, 1, 2));

        sup.getCompany().sendKeys(rd.getData(0, 1, 4));

        sup.getAddress1().sendKeys(rd.getData(0, 1, 5));

        sup.getCity().sendKeys(rd.getData(0, 1, 6));

        js.executeScript("window.scrollBy(0,200)");

        Select state = new  Select(sup.getSelectState());
        state.selectByIndex(8);

        sup.getPostcode().sendKeys(rd.getData(0, 1, 7));

        Select country = new  Select(sup.getCountry());
        country.selectByVisibleText("United States");

        js.executeScript("window.scrollBy(0,200)");

        sup.getMobileNo().sendKeys(rd.getData(0, 1, 8));

        sup.getAlias().sendKeys(rd.getData(0, 1, 9));

        sup.getRegisterButton().click();

        sup.getLogOut().click();





    }
}
