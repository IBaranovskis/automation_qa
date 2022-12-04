package lv.acodemy.pages;

import lv.acodemy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BillingPage {
    private final By FIRST_NAME_FIELD = By.id("billing_first_name");
    private final By LAST_NAME_FIELD = By.id("billing_last_name");
    private final By CHOOSE_COUNTRY = By.xpath("//span[@id='select2-billing_country-container']");
    private final By SEARCH_COUNTRY_FIELD = By.xpath("//input[@role='combobox']");
    private final By STREET_ADDRESS_FIELD = By.id("billing_address_1");
    private final By CHOOSE_CITY_FIELD = By.id("billing_city");
    private final By POST_CODE_FIELD = By.id("billing_postcode");
    private final By PHONE_NUMBER_FIELD = By.xpath("//input[@id='billing_phone']");
    private final By EMAIL_ADDRESS_FIELD = By.id("billing_email");
    private final TestBase testBase;

    public BillingPage(TestBase testBase) {
        this.testBase = testBase;
    }

    public void addFirstName(String firstName) {
        testBase.type(FIRST_NAME_FIELD, firstName);
        testBase.pressKey(FIRST_NAME_FIELD, Keys.ENTER);
    }

    public void addLastName(String lastName) {
        testBase.type(LAST_NAME_FIELD, lastName);
        testBase.pressKey(LAST_NAME_FIELD, Keys.ENTER);
    }

    public void chooseCountryField() throws InterruptedException {
        Thread.sleep(5000);
        testBase.click(CHOOSE_COUNTRY);
    }

    public void selectCountry(String country) {
        testBase.type(SEARCH_COUNTRY_FIELD, country);
        testBase.pressKey(SEARCH_COUNTRY_FIELD, Keys.ENTER);
    }

    public void addStreetName(String street) {
        testBase.type(STREET_ADDRESS_FIELD, street);
        testBase.pressKey(STREET_ADDRESS_FIELD, Keys.ENTER);
    }

    public void addCityName(String city) {
        testBase.type(CHOOSE_CITY_FIELD, city);
        testBase.pressKey(CHOOSE_CITY_FIELD, Keys.ENTER);
    }

    public void addPostCode(String postCode) {
        testBase.type(POST_CODE_FIELD, postCode);
        testBase.pressKey(POST_CODE_FIELD, Keys.ENTER);
    }

    public void addPhoneNumber(String phoneNumber) {
        testBase.type(PHONE_NUMBER_FIELD, phoneNumber);
        testBase.pressKey(PHONE_NUMBER_FIELD, Keys.ENTER);
    }

    public void addEmailAddress(String email) {
        testBase.type(EMAIL_ADDRESS_FIELD, email);
        testBase.pressKey(EMAIL_ADDRESS_FIELD, Keys.ENTER);
    }
}