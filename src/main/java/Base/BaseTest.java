package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        String browserName = System.getProperty("browserName");
        System.out.println(browserName);
        Configuration.browser = browserName;
        Selenide.open("https://parabank.parasoft.com/");
    }
}
