package tests.home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.home.homePage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class homeTest {


    WebDriver driver;
    homePage hp;
    WebDriverWait wait;
    JavascriptExecutor js;
    String mainWindow = null;

    List<WebElement> li = new ArrayList<WebElement>();


    public void dresses(WebDriver driver) throws IOException, Exception {

        this.driver = driver;
        wait = new WebDriverWait(driver, 40);
        js = (JavascriptExecutor) driver;

        hp = new homePage(driver);

        Actions action= new Actions(driver);
        action.moveToElement(hp.getWomenDress()).perform();

        hp.getWomenTshirts().click();

        js.executeScript("window.scrollBy(0,200)");

        hp.getViewLists().click();

        mainWindow = driver.getWindowHandle();


        List<WebElement> productsList =  driver.findElements(By.xpath("//a[@class='product-name' and @itemprop='url']"));

        System.out.println(productsList.size());
        System.out.println(hp.getInStock().getText());
        String verifyInStock=hp.getInStock().getText();
        Assert.assertEquals(verifyInStock,"In stock");

        for(int i=0;i<productsList.size();i++)
        {
            //Thread.sleep(3000);
            if(hp.getInStock().isDisplayed())
            {
                   WebElement verifiedProduct= productsList.get(i);
                   System.out.println(productsList.get(i));

            }
        }

        js.executeScript("window.scrollBy(0,200)");

        hp.getQuickView().click();

        driver.switchTo().frame(0);

        String ourPrice = driver.findElement(By.xpath("//span[@id='our_price_display']")).getText();
        ourPrice = ourPrice.replaceAll("[^a-zA-Z0-9.]", "");
        System.out.println(ourPrice);


        double value = Double.valueOf(ourPrice);
        System.out.println("value of Product is: " + value);


        hp.getQuantities().clear();
        hp.getQuantities().sendKeys("2");

        hp.getAddToCart().click();

        driver.switchTo().defaultContent();

        js.executeScript("window.scrollBy(0,200)");


        hp.getProceedToCheckout().click();

        js.executeScript("window.scrollBy(0,400)");


        String totalPrice=hp.getTotalPrice().getText();


        Double ExpectedPrice=(value*2)+2.00;
        System.out.println(totalPrice);

        js.executeScript("window.scrollBy(0,400)");

        hp.getSummaryProceedToCheckout().click();

        js.executeScript("window.scrollBy(0,400)");
        hp.getAddressProceedToCheckout().click();

        js.executeScript("window.scrollBy(0,400)");

        hp.getCheckoutConfirmation().click();

        hp.getShippingProceedToCheckout().click();

        js.executeScript("window.scrollBy(0,400)");

        System.out.println(totalPrice);
        System.out.println("$"+ExpectedPrice);
        Assert.assertEquals( totalPrice,"$"+ExpectedPrice);

        hp.getPayByCheck().click();

        hp.getPaymentDone().click();

        hp.getViewMyCustomerAccount().click();

        hp.getOrderHistory().click();

        String historyTotalPrice=hp.getHistoryPrice().getText();

        Assert.assertEquals( historyTotalPrice,"$"+ExpectedPrice);

    }
}
