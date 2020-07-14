import io.qameta.allure.Story;

import org.testng.annotations.Test;

import static Helper.DriverHelper.byClass;
import static Helper.DriverHelper.byTestId;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Story("Creste new tests")
public class CreateNewTest extends Settings {

    @Test
    public void successfulCreateTest() {
        step("Авторизация пользователя с известными данными", () -> {
            userAuthorization.userAuth(EMAILCLIENT, PASSWORDCLIENT);
        });

        step("Открываем вкладку'Создать новый тест', заполняем поля", () -> {
            $(byClass("item_menu_text")).click();
            $(byTestId("Test name input")).setValue(TESTNAME);
            $(byTestId("Address site input")).setValue(WEBSITE);
            $(byTestId("Submit button")).click();

        });

        step("Заполняем поля страницы 'Аудитория'", () -> {
            $(byTestId("Segment name input 0")).setValue(SEGMENTNAME);
            $(byTestId("Tasks button")).click();
        });
        step("Заполняем поля страницы 'Задания'", () -> {
            $(byTestId("Tasks task question")).setValue(QUESTION);
            $(byTestId("Tasks submit task")).click();
            $(byTestId("Check button")).click();
            $(byTestId("Checkout start button")).click();
            $(byClass("sc-itybZL gLzIYc")).shouldHave(text(EXCEPTEDTEXTAFTERCREATENEWTEST));

        });
    }
}