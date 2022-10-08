package ru.yandex.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderCredentialsPopup {

    private final WebDriver driver;
    public OrderCredentialsPopup(WebDriver driver) {
        this.driver = driver;
    }

    //Xpath для поля "Имя" при оформлении заказа
    private  static By nameField = By.xpath(".//input[@placeholder='* Имя']");

    //Xpath для поля "Фамилия" при оформлении заказа
    private static By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");

    //Xpath для поля "Адрес" при оформлении заказа
    private static By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //Xpath для выпадающего списка "Станция метро" при оформлении заказа
    private static By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");

    //Xpath для поля "Телефон" при оформлении заказа
    private static By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Xpath для кнопки "Далее" при переходе на следующую страницу попапа при оформлении заказа
    private static By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");

    //Xpath для поля "Когда привезти" при оформлении заказа
    private static By deliveryDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Xpath для выпадающего списка "Время аренды" при оформлении заказа
    private static By rentalPeriod = By.xpath("//div[@class='Dropdown-placeholder']");

    //Xpath для значения "Двое суток" из выпадающего списка "время аренды" при оформлении заказа
    private  static By rentalPeriodDropDownItem = By.xpath(".//div[text()='двое суток']");

    //Xpath для кнопки "Заказать" внутри попапа при оформлении заказа
    private static By inPopupOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Xpath для кнопки "Да" в попапе при оформлении заказа
    private static By inPopupOrderConfirmationButtonYes = By.xpath(".//button[text()='Да']");

    //Xpath для текстового уведомления "Заказ оформлен" после успешного оформления заказа
    private static By orderCreated = By.xpath(".//div[text()='Заказ оформлен']");


    //Метод заполняет поле "Имя" в попапе при оформлении заказа
    public void nameFieldInput(String name) {
        driver.findElement(nameField).sendKeys(name);
    }


    //Метод заполняет поле "Фамилия" в попапе при оформлении заказа
    public void surnameFieldInput(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }


    //Метод заполняет поле "Адрес" в попапе при оформлении заказа
    public void addressFieldInput(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    //Метод выбирает "Станцию метро" в попапе из выпадающего списка при оформлении заказа
    public void metroStationFieldInput(String station) {
        driver.findElement(metroStationField).sendKeys (station + Keys.DOWN + Keys.RETURN);
    }

    //Метод заполняет поле "Телефон" в попапе при оформлении заказа
    public void phoneNumberFieldInput(String phone) {
        driver.findElement(phoneNumberField).sendKeys(phone);
    }

    //Метод кликает по кнопке "Далее" в попапе при оформлении заказа
    public void nextButtonClick() {
        driver.findElement(nextButton).click();
    }

    //Метод заполняет поле "Дата" в попапе при оформлении заказа
    public void deliveryDateInput(String date) {
        driver.findElement(deliveryDate).sendKeys(date + Keys.RETURN);
    }

    //Метод заполняет поле "Период аренды" в попапе при оформлении заказа
    public void rentalPeriodInput() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodDropDownItem).click();
    }

    //Метод нажимает кнопку "Заказать" в попапе при оформлении заказа
    public void inPopupOrderButtonClick() {
        driver.findElement(inPopupOrderButton).click();
    }

    //Метод нажимает кнопку "Да" в попапе при оформлении заказа
    public void inPopupOrderConfirmationButtonYesClick() {
        driver.findElement(inPopupOrderConfirmationButtonYes).click();
    }

    //Метод проверяет отображается ли в данный момент текст "Заказ оформлен" после успешного создания заказа
    public boolean isOrderCreated() {
        return driver.findElement(orderCreated).isDisplayed();
    }
}
