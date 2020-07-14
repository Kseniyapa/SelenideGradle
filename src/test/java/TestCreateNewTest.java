
import io.qameta.allure.Story;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Story("Creste new tests")
public class TestCreateNewTest extends Settings {

    private static final String EXCEPTEDTEXTAFTERCREATENEWTEST = "Ура! Тест создан и отправлен пользователям.";
    private static final String TESTNAME = "first test";
    private static final String WEBSITE = "uxcrowd.ru";
    private static final String SEGMENTNAME = "test";
    private static final String QUESTION = "added new question";
    private static final String EMAILCLIENT = "tqew@1secmail.com";

    private static final String PASSWORDCLIENT = "lFdRUt";

    @Test
    public void successfulCreateTest() {
        step("Авторизация пользователя с известными данными", () -> {
            $("#header-lk-button").click();
            //$("#enterLk").shouldBe(visible);
            $("#login").setValue(EMAILCLIENT);
            $("[type=password]").setValue(PASSWORDCLIENT);
            $("[ng-tr=\"WHE1.WHE4\"]").click();
        });

        step("Открываем вкладку'Создать новый тест', заполняем поля", () -> {
            $("[class = \"item_menu_text\"]").click();
            $("[data-testid=\"Test name input\"]").setValue(TESTNAME);
            $("[data-testid=\"Address site input\"]").setValue(WEBSITE);
            $("[data-testid=\"Submit button\"]").click();

        });

        step("Заполняем поля страницы 'Аудитория'", () -> {
            $("[data-testid=\"Segment name input 0\"]").setValue(SEGMENTNAME);
            $("[data-testid=\"Tasks button\"]").click();
        });
        step("Заполняем поля страницы 'Задания'", () -> {
            $("[data-testid=\"Tasks task question\"]").setValue(QUESTION);
            $("[data-testid=\"Tasks submit task\"]").click();
            $("[data-testid=\"Check button\"]").click();
            $("[data-testid=\"Checkout start button\"]").click();
            $("[class = \"sc-itybZL gLzIYc\"]").shouldHave(text(EXCEPTEDTEXTAFTERCREATENEWTEST));

        });


    }
}
