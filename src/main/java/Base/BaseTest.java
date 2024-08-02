package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
        Configuration.browser = "chrome";
        Selenide.open("https://parabank.parasoft.com/");
    }
}
