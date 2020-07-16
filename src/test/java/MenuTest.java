import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.qameta.allure.Allure.step;

public class MenuTest extends Settings {
    @Test
    @Description("Проверяем вкладку 'О продукте', " +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsProduct() {
        step("Проверяем вкладку 'О продуте'");
        menuPage.tabAboutProduct();
        Assert.assertTrue(menuPage.tabAboutProduct());
    }

    @Test
    @Description("Проверяем вкладку 'Цены'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsPrice() {
        step("Проверяем вкладку 'Цены'");
        menuPage.tabAboutPrice();
        Assert.assertTrue(menuPage.tabAboutPrice());
    }

    @Test
    @Description("Проверяем вкладку 'FAQ'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsFAQ() {
        step("Проверяем вкладку 'FAQ'");
        menuPage.tabFAQ();
        Assert.assertTrue(menuPage.tabFAQ());
    }

    @Test
    @Description("Проверяем вкладку 'Хочу тестировать сайты'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsWantTest() {
        step("Проверяем вкладку 'Хочу тестировать сайты'");
        menuPage.tabWantTest();
        Assert.assertTrue(menuPage.tabWantTest());
    }

    @Test
    @Description("Проверяем кнопку 'Войти'" +
            "должна быть активна и при нажатии открывать окно авторизации")
    public void checkLoginButton() {
        step("Проверяем кнопку 'Войти'");
        userAuthorization.openAuth();
        Assert.assertTrue(menuPage.buttonEnter());
    }
}
