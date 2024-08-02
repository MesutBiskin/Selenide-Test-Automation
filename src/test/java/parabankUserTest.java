import Base.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Visible;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.beans.Visibility;

import static com.codeborne.selenide.Selenide.$;

public class parabankUserTest extends BaseTest {

    @Test
    public void Test001() {

        $(By.name("username")).setValue("mbiskin");
        $(By.name("password")).setValue(("Kgm202608"));
        $(By.cssSelector("[value='Log In']")).click();

        String errorMessage = $(By.className("error")).getText();
        System.out.println(errorMessage);

        //$(By.className("error")).shouldHave(Condition.text("The username and password could not be verified."));
       // $(By.className("error")).shouldBe(Condition.visible);


    }

}
