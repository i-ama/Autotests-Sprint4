package ru.yandex.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
//
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final WebDriver driver;
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private final static By orderButtonInHeader = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private final static By FIRST_QUESTION = By.xpath(".//div[@id='accordion__heading-0']");
    private final static By FIRST_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-0']");
    private final static By SECOND_QUESTION = By.xpath(".//div[@id='accordion__heading-1']");
    private final static By SECOND_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-1']");
    private final static By THIRD_QUESTION = By.xpath(".//div[@id='accordion__heading-2']");
    private final static By THIRD_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-2']");
    private final static By FOURTH_QUESTION = By.xpath(".//div[@id='accordion__heading-3']");
    private final static By FOURTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-3']");
    private final static By FIFTH_QUESTION = By.xpath(".//div[@id='accordion__heading-4']");
    private final static By FIFTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-4']");
    private final static By SIXTH_QUESTION = By.xpath(".//div[@id='accordion__heading-5']");
    private final static By SIXTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-5']");
    private final static By SEVENTH_QUESTION = By.xpath(".//div[@id='accordion__heading-6']");
    private final static By SEVENTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-6']");
    private final static By EIGHTH_QUESTION = By.xpath(".//div[@id='accordion__heading-7']");
    private final static By EIGHTH_QUESTION_DESCRIPTION = By.xpath(".//div[@id='accordion__panel-7']");

    public void open() {
        driver.get(URL);
    }

    public void clickOrderButtonInHeader() {
        driver.findElement(orderButtonInHeader).click();
    }

    public void clickFirstQuestionAbout() {
        WebElement element = driver.findElement(FIRST_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FIRST_QUESTION).click();
    }

    public boolean isFirstQuestionOpenDescriptionByClick() {
        return driver.findElement(FIRST_QUESTION_DESCRIPTION).isEnabled();
    }

    public void clickSecondQuestionAbout() {
        WebElement element = driver.findElement(SECOND_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SECOND_QUESTION).click();
    }

    public boolean isSecondQuestionOpenDescriptionByClick() {
        return driver.findElement(SECOND_QUESTION_DESCRIPTION).isDisplayed();
    }

    public void clickThirdQuestionAbout() {
        WebElement element = driver.findElement(THIRD_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(THIRD_QUESTION).click();
    }

    public boolean isThirdQuestionOpenDescriptionByClick() {
        return driver.findElement(THIRD_QUESTION_DESCRIPTION).isDisplayed();
    }

    public void clickFourthQuestionAbout() {
        WebElement element = driver.findElement(FOURTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FOURTH_QUESTION).click();
    }

    public boolean isFourthQuestionOpenDescriptionByClick() {
        return driver.findElement(FOURTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    public void clickFifthQuestionAbout() {
        WebElement element = driver.findElement(FIFTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(FIFTH_QUESTION).click();
    }

    public boolean isFifthQuestionOpenDescriptionByClick() {
        return driver.findElement(FIFTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    public void clickSixthQuestionAbout() {
        WebElement element = driver.findElement(SIXTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SIXTH_QUESTION).click();
    }

    public boolean isSixthQuestionOpenDescriptionByClick() {
        return driver.findElement(SIXTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    public void clickSeventhQuestionAbout() {
        WebElement element = driver.findElement(SEVENTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(SEVENTH_QUESTION).click();
    }

    public boolean isSeventhQuestionOpenDescriptionByClick() {
        return driver.findElement(SEVENTH_QUESTION_DESCRIPTION).isDisplayed();
    }

    public void clickEighthQuestionAbout() {
        WebElement element = driver.findElement(EIGHTH_QUESTION);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(EIGHTH_QUESTION).click();
    }

    public boolean isEighthQuestionOpenDescriptionByClick() {
        return driver.findElement(EIGHTH_QUESTION_DESCRIPTION).isDisplayed();
    }


}
