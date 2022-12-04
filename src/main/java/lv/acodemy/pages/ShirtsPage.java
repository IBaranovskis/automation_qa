package lv.acodemy.pages;

import lv.acodemy.base.TestBase;
import org.openqa.selenium.By;

public class ShirtsPage {
    private final By CHOOSE_PRODUCT = By.xpath("//a[@href='https://shop.acodemy.lv/product/t-shirt-with-logo/']//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
    private TestBase testBase;

    public ShirtsPage(TestBase testBase){
        this.testBase = testBase;
    }

    public void selectAddToCart(){
        testBase.click(CHOOSE_PRODUCT);
    }
}