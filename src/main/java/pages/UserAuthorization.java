package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.visible;


public class UserAuthorization {
    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement openAuth = $x("//*[@id=\"header-lk-button\"]"); // Кнопка открытия окна авторизации "Войти".

    private SelenideElement emailField = $x("//*[@id=\"login\"]"); // Поле для ввода почты клиента.

    private SelenideElement passwordField = $x("//*[@id=\"form_auth\"]/input[2]"); // Поле для ввода пароля клиента.

    private SelenideElement enterButton = $x("//*[@id=\"form_auth\"]/button"); // Кнопка "Войти" в личный кабинет.

    private SelenideElement logoutButton = $x("//*[@id=\"logout\"]"); // Кнопка "Выйти" из личного кабинета.


    @Step("Открытие окна авторизации")
    public void openAuth() {
        openAuth.shouldBe(visible).click();
    }

    @Step("Вводим емайл {0}")
    public void emailField(String email) {
        emailField.setValue(email);
    }

    @Step("Вводим пароль {0}")
    public void passwordField(String password) {
        passwordField.setValue(password);
    }

    @Step("Проверям, что кнопка 'Выйти'активна")
    public boolean logoutButton() {
        return logoutButton.isDisplayed();
    }

    @Step("Нажимаем кнопку 'Войти'")
    public void enterButton() {
        enterButton.shouldBe(visible).pressEnter();
    }

    public void userAuth(String email, String password) {
        openAuth.shouldBe(visible).click();
        emailField.setValue(email);
        passwordField.setValue(password);
        logoutButton.isDisplayed();
        enterButton.shouldBe(visible).pressEnter();
        //logoutButton.click();
    }

}

