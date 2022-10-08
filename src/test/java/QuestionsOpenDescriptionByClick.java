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
//
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void FirstQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickFirstQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isFirstQuestionOpenDescriptionByClick());
    }

    @Test
    public void SecondQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickSecondQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isSecondQuestionOpenDescriptionByClick());
    }

    @Test
    public void ThirdQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickThirdQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isThirdQuestionOpenDescriptionByClick());
    }

    @Test
    public void FourthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickFourthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isFourthQuestionOpenDescriptionByClick());
    }

    @Test
    public void FifthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickFifthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isFifthQuestionOpenDescriptionByClick());
    }

    @Test
    public void SixthQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickSixthQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isSixthQuestionOpenDescriptionByClick());
    }

    @Test
    public void SeventhQuestionOpenDescriptionByClickOpen() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickSeventhQuestionAbout();
        Assert.assertTrue("Expected description open by click", mainPage.isSeventhQuestionOpenDescriptionByClick());
    }

    @Test
    public void EigthQuestionOpenDescriptionByClickOpen() {
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
