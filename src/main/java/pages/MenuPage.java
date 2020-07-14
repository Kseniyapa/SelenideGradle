package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MenuPage {
    /**
     * Локаторы для работы со страницей
     */
    private SelenideElement tabAboutProduct = $("[ng-tr=\"NLHEA.NLHEA1\"]"); //Вкладка "О продукте"

    private SelenideElement tabAboutPrice = $("[ng-tr=\"NLHEA.NLHEA2\"]"); //Вкладка "Цены"

    private SelenideElement tabFAQ = $("[ng-tr=\"NLHEA.NLHEA3\"]"); //Вкладка "FAQ"

    private SelenideElement tabWantTest = $("[ng-tr=\"NLHEA.NLHEA3\"]"); //Вкладка "Хочу тестировать сайты"

    private SelenideElement buttonEnter = $x("//*[@id=\"header-lk-button\"]"); //Кнопка открытия откна авторизации

    @Step(value = "Проверяем вкладку 'О продуте'")
    public boolean tabAboutProduct() {
        return tabAboutProduct.isDisplayed();
    }

    @Step(value = "Проверяем вкладку 'Цены'")
    public boolean tabAboutPrice() {
        return tabAboutPrice.isDisplayed();
    }

    @Step(value = "Проверяем вкладу 'FAQ'")
    public boolean tabFAQ() {
        return tabFAQ.isDisplayed();
    }


    @Step(value = "Проверяем вкладку 'Хочу тестировать сайты'")
    public boolean tabWantTest() {
        return tabWantTest.isDisplayed();
    }

    @Step(value = "Проверяем активность кнопки 'Войти'")
    public boolean buttonEnter() {
        return buttonEnter.isDisplayed();
    }
}

