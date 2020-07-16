import Listener.ScreenshotListener;
import io.qameta.allure.Story;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static Helper.DriverHelper.byClass;
import static Helper.DriverHelper.byTestId;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Listeners({ScreenshotListener.class})
@Story("Создание теста пользователем с бесплатной подпиской")
public class CreateNewTest extends Settings {

    @Test
    public void successfulCreateTest() {
        step("Авторизация клиента с бесплатной подпиской" +
                "(данные заранее известны)", () -> {
            userAuthorization.userAuth(EMAILCLIENT, PASSWORDCLIENT);
        });
        step("Открываем вкладку'Создать новый тест', заполняем поля", () -> {
            $(byClass("item_menu_text")).click();
        });
        step("Заполняем обязательные поля формы 'Создать новый тест'", () -> {
            $(byTestId("Test name input")).setValue(TESTNAME);
            $(byTestId("Address site input")).setValue(WEBSITE);

        });
        step("Нажать кнопку 'К выбору аудитории'", () -> {
            $(byTestId("Submit button")).shouldBe(visible).click();
        });

        step("Заполняем поля страницы 'Аудитория'", () -> {
            $(byTestId("Segment name input 0")).setValue(SEGMENTNAME);

        });
//        step("Нажать кнопку 'Добавить еще один сегмент'", () -> {
//            $(byClass("sc-eNQAEJ brEVVu")).shouldBe(visible).click();
//            $(byTestId("Segment name input 1")).setValue(SECONDSEGMENT);
//
//        });

        step("Нажать кнопку 'К заданиям'", () -> {
            $(byTestId("Tasks button")).shouldBe(visible).click();
        });
        step("Заполняем поля страницы 'Задания'", () -> {
            $(byTestId("Tasks task question")).setValue(QUESTION);
            $(byTestId("Tasks submit task")).shouldBe(visible).click();

        });
        step("Нажать кнопку 'Проверка и запуск'", () -> {
            $(byTestId("Check button")).shouldBe(visible).click();
        });
        step("Нажать кнопку 'Запустить бесплатный тест'", () -> {
            $(byTestId("Checkout start button")).shouldBe(visible).click();
            $(byClass("sc-itybZL gLzIYc")).shouldHave(text(EXCEPTEDTEXTAFTERCREATENEWTEST));
        });

    }
}