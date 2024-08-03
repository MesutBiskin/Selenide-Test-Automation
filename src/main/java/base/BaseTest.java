package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp() {

        String browserName = System.getProperty("tarayici");
        String Url = System.getProperty("WebsiteURL");

        if (browserName == null) {
            browserName = "chrome";
        }

        if (Url == null) {
            Url = "https://parabank.parasoft.com/";
        }


        Configuration.browser = browserName;
        Selenide.open(Url);

    }
}
