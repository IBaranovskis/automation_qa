import lv.acodemy.base.TestBase;

import lv.acodemy.pages.*;
import org.testng.annotations.Test;

public class ProductTests {
    private final String HOME_PAGE_URL = "shop.acodemy.lv";
    private final String PRODUCT_TO_FIND = "Shirt";
    private final String COUPON_CODE = "acodemy10off";
    private final String FIRST_NAME = "Janis";
    private final String LAST_NAME = "Ozols";
    private final String COUNTRY_NAME = "Latvia";
    private final String STREET_ADDRESS = "Maskavas street 280";
    private final String CITY_NAME = "Riga";
    private final String POST_CODE = "LV-1057";
    private final String PHONE_NUMBER = "+37125827451";
    private final String EMAIL_ADDRESS = "web.test@gmail.com";

    @Test
    public void productCheck() throws InterruptedException {
        TestBase testBase = new TestBase();
        testBase.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(testBase);
        homePage.searchFor(PRODUCT_TO_FIND);

        ShirtsPage shirtsPage = new ShirtsPage(testBase);
        shirtsPage.selectAddToCart();

        ProductPage productPage = new ProductPage(testBase);
        productPage.addProductToCart();
        productPage.goProductCart();

        CartPage cartPage = new CartPage(testBase);
        cartPage.addCouponCode(COUPON_CODE);
        cartPage.applyCoupon();
        cartPage.goProceedToCheckout();

        BillingPage billingPage = new BillingPage(testBase);
        billingPage.addFirstName(FIRST_NAME);
        billingPage.addLastName(LAST_NAME);
        billingPage.chooseCountryField();
        billingPage.selectCountry(COUNTRY_NAME);
        billingPage.addStreetName(STREET_ADDRESS);
        billingPage.addCityName(CITY_NAME);
        billingPage.addPostCode(POST_CODE);
        billingPage.addPhoneNumber(PHONE_NUMBER);
        billingPage.addEmailAddress(EMAIL_ADDRESS);
    }
}