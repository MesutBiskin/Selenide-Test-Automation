package pages;

import base.BaseLibrary;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage extends BaseLibrary {

    @Step("Login Succesfull Page")
    public HomePage succesfullLoginController(String value) {
        $$(By.className("title")).get(0).shouldHave(Condition.text(value));
        screenshot();
        return this;
    }
}
