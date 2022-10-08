package ru.yandex.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderCredentialsPopup {
//
    public OrderCredentialsPopup(WebDriver driver) {
        this.driver = driver;
    }

    private final WebDriver driver;

    private  static By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private static By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private static By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private static By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    private static By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private static By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");
    private static By deliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private static By rentalPeriod = By.xpath("//div[@class='Dropdown-placeholder']");
    private  static By rentalPeriodDropDownItem = By.xpath(".//div[text()='двое суток']");
    private static By inPopupOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private static By inPopupOrderConfirmationButtonYes = By.xpath(".//button[text()='Да']");
    private static By orderCreated = By.xpath(".//div[text()='Заказ оформлен']");

    public void nameFieldInput(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void surnameFieldInput(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void addressFieldInput(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void metroStationFieldInput(String station) {
        driver.findElement(metroStationField).sendKeys (station + Keys.DOWN + Keys.RETURN);
    }

    public void phoneNumberFieldInput(String phone) {
        driver.findElement(phoneNumberField).sendKeys(phone);
    }

    public void nextButtonClick() {
        driver.findElement(nextButton).click();
    }

    public void deliveryDateInput(String date) {
        driver.findElement(deliveryDate).sendKeys(date + Keys.RETURN);
    }

    public void rentalPeriodInput() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodDropDownItem).click();
    }

    public void inPopupOrderButtonClick() {
        driver.findElement(inPopupOrderButton).click();
    }

    public void inPopupOrderConfirmationButtonYesClick() {
        driver.findElement(inPopupOrderConfirmationButtonYes).click();
    }

    public boolean isOrderCreated() {
        return driver.findElement(orderCreated).isDisplayed();
    }
}
