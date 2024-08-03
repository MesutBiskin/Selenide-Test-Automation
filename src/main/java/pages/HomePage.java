package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public HomePage succesfullLoginController(String value) {
        $$(By.className("title")).get(0).shouldHave(Condition.text(value));
        return this;
    }
}
