package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    //Bana neler lazım:  1 browser tipi lazım burada ona göre oluşturucam
    // her bir paralel çalışan süreç için sadece o sürece özel static bir değişken lazım
    // çünkü runner classdaki işaret edilen tüm senaryolarda aynısını çalışması lazım.
    // demekki her pipeline için (Local) ve de ona özel static bir drivera ihtiyacım var
    //donanımdaki adı pipeline , yazılımdaki adı Thread , paralel çalışan her bir süreç

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // WebDriver 1 WebbDriver 2
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // chrome , firefox ...

    // threadDriver.get() -> ilgili tread deki driveri verecek
    // threadDriver.set(driver) -> ilgili thread e driver set ediliyor.


    public static WebDriver driver;


    public static WebDriver getDriver() {

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (driver==null) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;

    }
    public  static  void  quitDriver(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}