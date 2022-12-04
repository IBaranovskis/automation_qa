package lv.acodemy.pages;

import lv.acodemy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CartPage {
    private final By ADD_TO_COUPON_CODE = By.xpath("//input[@id='coupon_code']");
    private final By SELECT_APPLY = By.xpath("//button[@name='apply_coupon']");
    private final By PROCEED_TO_CHECKOUT = By.xpath("//div[@class='wc-proceed-to-checkout']/a");
    private TestBase testBase;

    public CartPage(TestBase testBase) {
        this.testBase = testBase;
    }

    public void addCouponCode(String textToFind) {
        testBase.type(ADD_TO_COUPON_CODE, textToFind);
        testBase.pressKey(ADD_TO_COUPON_CODE, Keys.ENTER);
    }

    public void applyCoupon() throws InterruptedException {
        Thread.sleep(5000);
        testBase.click(SELECT_APPLY);
    }

    public void goProceedToCheckout() throws InterruptedException {
        Thread.sleep(5000);
        testBase.click(PROCEED_TO_CHECKOUT);
    }
}