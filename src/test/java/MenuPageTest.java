import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.qameta.allure.Allure.step;

public class MenuPageTest extends Settings {
    @Test(priority = 1)
    @Description("Проверяем вкладку 'О продукте', " +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsProduct() {
        step("Проверяем вкладку 'О продуте'");
        userAuthorization.openAuth();
        Assert.assertTrue(menuPage.tabAboutProduct());
    }

    @Test(priority = 2)
    @Description("Проверяем вкладку 'Цены'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsPrice() {
        step("Проверяем вкладку 'Цены'");
        userAuthorization.openAuth();
        Assert.assertTrue(menuPage.tabAboutPrice());
    }

    @Test(priority = 3)
    @Description("Проверяем вкладку 'FAQ'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsFAQ() {
        step("Проверяем вкладку 'FAQ'");
        userAuthorization.openAuth();
        Assert.assertTrue(menuPage.tabFAQ());
    }

    @Test(priority = 4)
    @Description("Проверяем вкладку 'Хочу тестировать сайты'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsWantTest() {
        step("Проверяем вкладку 'Хочу тестировать сайты'");
        userAuthorization.openAuth();
        Assert.assertTrue(menuPage.tabWantTest());
    }

    @Test(priority = 5)
    @Description("Проверяем кнопку 'Войти'" +
            "должна быть активна и при нажатии открывать окно авторизации")
    public void checkLoginButton() {
        step("Проверяем кнопку 'Войти'");
        userAuthorization.openAuth();
        Assert.assertTrue(menuPage.buttonEnter());
    }
}
