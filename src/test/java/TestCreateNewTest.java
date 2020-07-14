//import io.qameta.allure.Story;
//import okhttp3.internal.http2.Settings;
//import org.testng.annotations.Test;
//
//
//import static Helper.DriverHelper.byTestId;
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selenide.$;
//import static io.qameta.allure.Allure.step;
//
//@Story("Creste new tests")
//public class TestCreateNewTest extends Settings {
//    @Test
//    public void successfulCreateTest() {
//        step("Авторизация пользователя с известными данными", () -> {
//            userAuthorization.userAuth(Settings.EMAILCLIENT, Settings.PASSWORDCLIENT);
//        });
//
//        step("Открываем вкладку'Создать новый тест', заполняем поля", () -> {
//            $("[class = \"item_menu_text\"]").click();
//            $(byTestId("Test name input")).setValue(Settings.TESTNAME);
//            $(byTestId("Address site input")).setValue(Settings.WEBSITE);
//            $(byTestId("Submit button")).click();
//
//        });
//
//        step("Заполняем поля страницы 'Аудитория'", () -> {
//            $(byTestId("Segment name input 0")).setValue(Settings.SEGMENTNAME);
//            $(byTestId("Tasks button")).click();
//        });
//        step("Заполняем поля страницы 'Задания'", () -> {
//            $(byTestId("Tasks task question")).setValue(Settings.QUESTION);
//            $(byTestId("Tasks submit task")).click();
//            $(byTestId("Check button")).click();
//            $(byTestId("Checkout start button")).click();
//            $("[class = \"sc-itybZL gLzIYc\"]").shouldHave(text(Settings.EXCEPTEDTEXTAFTERCREATENEWTEST));
//
//        });
//
//
//    }
//}
//
