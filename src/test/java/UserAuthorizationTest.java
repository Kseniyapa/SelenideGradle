import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

public class UserAuthorizationTest extends Settings {
   private static final String EMAILCLIENT = "kspatschool@1secmail.com";
//
   private static final String PASSWORDCLIENT = "xclvTw";

    @Test
    @Description("Провека функционала авторизации с заранее известными данными, " +
            "при успешном прохождении должны попасть в личный кабинет")
    public void userAuth() {
//        step("Нажимаем кнопку'Войти'");
//        userAuthorization.openAuth();
//        step("Вводим email");
//        userAuthorization.emailField(EMAILCLIENT);
//        step("Вводим password");
//        userAuthorization.passwordField(PASSWORDCLIENT);
//        step("Нажимаем кнопку 'Войти' в личный кабинет");
//        userAuthorization.enterButton();
//        step("Нажимаем кнопку 'Выйти' из личного кабинета");
//        userAuthorization.logoutButton();
        userAuthorization.userAuth(EMAILCLIENT, PASSWORDCLIENT);
    }

}
