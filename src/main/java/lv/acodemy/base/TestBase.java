package lv.acodemy.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {
    private WebDriver driver;
    private WebDriverWait wait;

    public TestBase() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }

    public void type(By locator, String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement web = driver.findElement(locator);
        web.clear();
        web.sendKeys(text);
    }

    public void pressKey(By locator, Keys key) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement web = driver.findElement(locator);
        web.sendKeys(key);

    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}