package lv.acodemy.pages;

import lv.acodemy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage {
    private final By SEARCH_INPUT_FIELD = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    private TestBase testBase;


    public HomePage(TestBase testBase) {
        this.testBase = testBase;
    }

    public void searchFor(String textToFind) {
        testBase.type(SEARCH_INPUT_FIELD, textToFind);
        testBase.pressKey(SEARCH_INPUT_FIELD, Keys.ENTER);
    }
}