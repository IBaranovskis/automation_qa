package lv.acodemy.pages;

import lv.acodemy.base.TestBase;
import org.openqa.selenium.By;

public class ProductPage {
    private final By ADD_TO_CART = By.xpath("//button[@name='add-to-cart']");
    private final By GO_TO_CART = By.xpath("//a[@title='View your shopping cart']");
    private TestBase testBase;


    public ProductPage(TestBase testBase) {
        this.testBase = testBase;
    }

    public void addProductToCart() {
        testBase.click(ADD_TO_CART);
    }

    public void goProductCart() {
        testBase.click(GO_TO_CART);
    }
}