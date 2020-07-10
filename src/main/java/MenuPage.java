import com.codeborne.selenide.SelenideElement;

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
}
