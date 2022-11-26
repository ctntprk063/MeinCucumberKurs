package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {
        //bekleme yapiyor>>>>önce buraya yazdik sonra asagida metod olusturup ekledik
        waitUntilVisible(element);
        //kaydirma önce buraya yazdik sonra asagida metod olusturup ekledik
        scrollToElement(element);
        // kutucu temeizle
        element.clear();
        //degeri gönder
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element) {

        waitUntilClickable(element);// click olana kadar bekle
        scrollToElement(element);// elementi scrool yap
        element.click(); // click yap

    }
    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text){
        waitUntilVisible(element); // gözükene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

}
