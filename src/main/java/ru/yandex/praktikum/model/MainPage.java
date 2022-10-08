package ru.yandex.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Константа URL
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    //Первый вопрос о важном
    private final static By FIRST_QUESTION = By.xpath(".//div[@id='accordion__heading-0']");

    //Всплывающий ответ на первый вопрос о важном
    private final static By FIRST_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-0']");

    //Второй вопрос о важном
    private final static By SECOND_QUESTION = By.xpath(".//div[@id='accordion__heading-1']");

    //Всплывающий ответ на второй вопрос о важном
    private final static By SECOND_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-1']");

    //Третий вопрос о важном
    private final static By THIRD_QUESTION = By.xpath(".//div[@id='accordion__heading-2']");

    //Всплывающий ответ на третий вопрос о важном
    private final static By THIRD_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-2']");

    //Четвертый вопрос о важном
    private final static By FOURTH_QUESTION = By.xpath(".//div[@id='accordion__heading-3']");

    //Всплывающий ответ на четвертый вопрос о важном
    private final static By FOURTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-3']");

    //Пятый вопрос о важном
    private final static By FIFTH_QUESTION = By.xpath(".//div[@id='accordion__heading-4']");

    //Всплывающий ответ на пятый вопрос о важном
    private final static By FIFTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-4']");

    //Шестой вопрос о важном
    private final static By SIXTH_QUESTION = By.xpath(".//div[@id='accordion__heading-5']");

    //Всплывающий ответ на шестой вопрос о важном
    private final static By SIXTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-5']");

    //Седьмой вопрос о важном
    private final static By SEVENTH_QUESTION = By.xpath(".//div[@id='accordion__heading-6']");

    //Всплывающий ответ на седьмой вопрос о важном
    private final static By SEVENTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-6']");

    //Восьмой вопрос о важном
    private final static By EIGHTH_QUESTION = By.xpath(".//div[@id='accordion__heading-7']");

    //Всплывающий ответ на восьмой вопрос о важном
    private final static By EIGHTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-7']");

    public void open() {
        driver.get(URL);
    }

    //Метод кликнуть по одной из двух кнопок "Заказать" на главной странице
    public void clickOneOfTwoOrderButton(String orderButton) {
        WebElement element = driver.findElement(By.xpath(orderButton));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.xpath(orderButton)).click();
    }

    //Метод кликнуть по первому вопросу о важном
    public void clickFirstQuestionAbout() {
        WebElement element = driver.findElement(FIRST_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FIRST_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на первый важный вопрос
    public boolean isFirstQuestionOpenDescriptionByClick() {
        return driver.findElement(FIRST_QUESTION_DESCRIPTION).isEnabled();
    }

    //Метод кликнуть по второму вопросу о важном
    public void clickSecondQuestionAbout() {
        WebElement element = driver.findElement(SECOND_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SECOND_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на второй важный вопрос
    public boolean isSecondQuestionOpenDescriptionByClick() {
        return driver.findElement(SECOND_QUESTION_DESCRIPTION).isDisplayed();
    }

    //Метод кликнуть по третьему вопросу о важном
    public void clickThirdQuestionAbout() {
        WebElement element = driver.findElement(THIRD_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(THIRD_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на третий важный вопрос
    public boolean isThirdQuestionOpenDescriptionByClick() {
        return driver.findElement(THIRD_QUESTION_DESCRIPTION).isDisplayed();
    }

    //Метод кликнуть по четвертому вопросу о важном
    public void clickFourthQuestionAbout() {
        WebElement element = driver.findElement(FOURTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FOURTH_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на четвертый важный вопрос
    public boolean isFourthQuestionOpenDescriptionByClick() {
        return driver.findElement(FOURTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    //Метод кликнуть по пятому вопросу о важном
    public void clickFifthQuestionAbout() {
        WebElement element = driver.findElement(FIFTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FIFTH_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на пятый важный вопрос
    public boolean isFifthQuestionOpenDescriptionByClick() {
        return driver.findElement(FIFTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    //Метод кликнуть по шестому вопросу о важном
    public void clickSixthQuestionAbout() {
        WebElement element = driver.findElement(SIXTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SIXTH_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на шестой важный вопрос
    public boolean isSixthQuestionOpenDescriptionByClick() {
        return driver.findElement(SIXTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    //Метод кликнуть по седьмому вопросу о важном
    public void clickSeventhQuestionAbout() {
        WebElement element = driver.findElement(SEVENTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SEVENTH_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на седьмой важный вопрос
    public boolean isSeventhQuestionOpenDescriptionByClick() {
        return driver.findElement(SEVENTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    //Метод кликнуть по восьмому вопросу о важном
    public void clickEighthQuestionAbout() {
        WebElement element = driver.findElement(EIGHTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(EIGHTH_QUESTION).click();
    }

    //Метод проверяет отображается ли в данный момент ответ на восьмой важный вопрос
    public boolean isEighthQuestionOpenDescriptionByClick() {
        return driver.findElement(EIGHTH_QUESTION_DESCRIPTION).isDisplayed();
    }


}
