import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.model.MainPage;

import java.util.concurrent.TimeUnit;


public class QuestionsOpenDescriptionByClick {
    private  WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //Тест проверяет, что при нажатии на стрелочку первого «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void firstQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickFirstQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isFirstQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку второго «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void secondQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickSecondQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isSecondQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку третьего «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void thirdQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickThirdQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isThirdQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку четвертого «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void fourthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickFourthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isFourthQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку пятого «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void fifthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickFifthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isFifthQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку шестого «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void sixthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickSixthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isSixthQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку седьмого «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void seventhQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickSeventhQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isSeventhQuestionOpenDescriptionByClick());
    }

    //Тест проверяет, что при нажатии на стрелочку восьмого «Вопроса о важном» открывается ответ на этот вопрос
    @Test
    public void eighthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickEighthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isEighthQuestionOpenDescriptionByClick());
    }

    @After
    public void cleanUp() {

        driver.quit();
    }
}
