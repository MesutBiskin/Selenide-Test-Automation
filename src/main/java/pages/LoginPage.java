package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("User name field fill")
    public LoginPage fillUserName(String text) {
        $(By.name("username")).setValue(text);
        return this;
    }

    @Step("User Password Field Fill")
    public LoginPage fillUserPassword(String text) {
        $(By.name("password")).setValue((text));
        return this;
    }

    @Step("Login Page Click Button")
    public LoginPage clickButton() {
        $(By.cssSelector("[value='Log In']")).click();
        return this;
    }

    @Step("Error message getting")
    public String getErrorMessage() {
        String errorMessage = $(By.className("error")).getText();
        return errorMessage;
    }

    @Step("Error Message Controler Field")
    public LoginPage errorMessageController(String value) {
        $(By.className("error")).shouldHave(Condition.text(value));
        return this;
    }
}
