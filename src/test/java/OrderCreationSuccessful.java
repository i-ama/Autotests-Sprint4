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
//
    private WebDriver driver;
    private final boolean isOrderCreationSuccessful;
    private final String name;
    private  final String surname;
    private final String address;
    private final String station;
    private final String phone;
    private final String date;


    public OrderCreationSuccessful(String name, String surname, String address, String station, String phone, String date, boolean isOrderCreationSuccessful) {
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

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {"Иван", "Иванов", "Москва ул. Ивановская д. 16 кв. 44", "Черкизовская" +
                        "", "89998887766", "14.10.2022", true},
                {"Петр", "Петров", "Москва ул. Петровская д. 4 кв. 66", "Сокольники", "87776665544", "24.10.2022", true}
        };
    }

    @Test
    public void SuccessfulOrderCreationWithHeaderButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickOrderButtonInHeader();
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
