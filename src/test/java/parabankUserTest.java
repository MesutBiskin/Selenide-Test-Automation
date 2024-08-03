import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class parabankUserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "login succesfull")
    public void Test001() {
        String username = "keremb";
        loginPage.fillUserName(username).fillUserPassword("123456").clickButton();
        homePage.succesfullLoginController("Accounts Overview");
    }

    @Test(description = "UnSuccessfull")
    public void Test002() {
        loginPage.fillUserName("MesutBiskin").fillUserPassword("Kgm20260834").clickButton();
        System.out.println(loginPage.getErrorMessage());
        loginPage.errorMessageController("The username and password could not be verified.");
    }

    @Test(description = "Required Controller")
    public void Test003() {
        loginPage.fillUserName("").fillUserPassword("").clickButton();
        loginPage.errorMessageController("Please enter a username and password.");
    }
}
