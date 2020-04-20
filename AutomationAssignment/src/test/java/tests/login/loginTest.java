package tests.login;

import java.io.IOException;
import java.nio.file.Paths;

import baseClass.passDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.login.loginPage;
import utility.dataConfig.ReadExcel;


public class loginTest extends passDriver {

	WebDriver driver;
	loginPage lp;
	WebDriverWait wait;
	JavascriptExecutor js;
	ReadExcel rd;


	public void TestLoginValid(WebDriver driver) throws IOException, Exception {

		this.driver = driver;
		wait = new WebDriverWait(driver, 40);
		js = (JavascriptExecutor) driver;

		lp = new loginPage(driver);
		rd=new ReadExcel();

		lp.getSignIn().click();


		js.executeScript("window.scrollBy(0,200)");

		lp.getTxtUserName().sendKeys(rd.getData(0, 1, 0));

		lp.getTxtPassword().sendKeys(rd.getData(0, 1, 3));

		lp.getLoginBtn().click();
		//wait.until(ExpectedConditions.visibilityOf(ipp.getRemark()))

		lp.verifypagetitle();


	}
}

