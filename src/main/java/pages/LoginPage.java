package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public LoginPage fillUserName(String text) {
        $(By.name("username")).setValue(text);
        return this;
    }

    public LoginPage fillUserPassword(String text) {
        $(By.name("password")).setValue((text));
        return this;
    }

    public LoginPage clickButton() {
        $(By.cssSelector("[value='Log In']")).click();
        return this;
    }

    public String getErrorMessage() {
        String errorMessage = $(By.className("error")).getText();
        return errorMessage;
    }

    public LoginPage errorMessageController(String value) {
        $(By.className("error")).shouldHave(Condition.text(value));
        return this;
    }
}
