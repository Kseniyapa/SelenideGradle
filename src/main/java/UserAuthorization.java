import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UserAuthorization {
    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement openWindowAuth = $x("//*[@id=\"header-lk-button\"]"); // Кнопка открытия окна авторизации "Войти".

    private SelenideElement emailField = $x("//*[@id=\"login\"]"); // Поле для ввода почты клиента.

    private SelenideElement passwordField = $x("//*[@id=\"form_auth\"]/input[2]"); // Поле для ввода пароля клиента.

    private SelenideElement enterButton = $x("//*[@id=\"form_auth\"]/button"); // Кнопка "Войти" в личный кабинет.

    private SelenideElement logoutButton = $x("//*[@id=\"logout\"]"); // Кнопка "Выйти" из личного кабинета.

}
