import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.model.MainPage;
import ru.yandex.praktikum.model.OrderCredentialsPopup;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class OrderCreationSuccessful {

    private final String orderButton;
    private WebDriver driver;
    private final String name;
    private  final String surname;
    private final String address;
    private final String station;
    private final String phone;
    private final String date;
    private final boolean isOrderCreationSuccessful;


    public OrderCreationSuccessful(String orderButton, String name, String surname, String address, String station, String phone, String date, boolean isOrderCreationSuccessful) {
        this.orderButton = orderButton;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.station = station;
        this.phone = phone;
        this.date = date;
        this.isOrderCreationSuccessful = isOrderCreationSuccessful;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //Входные данные: два теста с использованием двух разных кнопок "Заказать" на главной странице
    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {

                //Тестовые данные с кнопкой "Заказать" в хэдере
                {".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']", "Иван", "Иванов", "Москва ул. Ивановская д. 16 кв. 44", "Черкизовская" +
                        "", "89998887766", "14.10.2022", true},

                //Тестовые данные с кнопкой "Заказать" в центре главной страницы
                {".//div[@class='Home_FinishButton__1_cWm']/button", "Петр", "Петров", "Москва ул. Петровская д. 4 кв. 66", "Сокольники", "87776665544", "24.10.2022", true}
        };
    }

    //Параметризированный тест всего флоу позитивного сценария заказа самоката с использованием двух разных кнопок
    @Test
    public void successfulOrderCreationWithHeaderButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickOneOfTwoOrderButton(orderButton);
        OrderCredentialsPopup orderCredentialsPopup = new OrderCredentialsPopup(driver);
        orderCredentialsPopup.nameFieldInput(name);
        orderCredentialsPopup.surnameFieldInput(surname);
        orderCredentialsPopup.addressFieldInput(address);
        orderCredentialsPopup.metroStationFieldInput(station);
        orderCredentialsPopup.phoneNumberFieldInput(phone);
        orderCredentialsPopup.nextButtonClick();
        orderCredentialsPopup.deliveryDateInput(date);
        orderCredentialsPopup.rentalPeriodInput();
        orderCredentialsPopup.inPopupOrderButtonClick();
        orderCredentialsPopup.inPopupOrderConfirmationButtonYesClick();
        Assert.assertEquals("Order created", isOrderCreationSuccessful, orderCredentialsPopup.isOrderCreated());
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
