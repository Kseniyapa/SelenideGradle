import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewTestPage {
    private SelenideElement buttonCreateNewTest = $("[class = \"item_menu_text\"]");  // Открыть вкладку "Новый тест"

    private SelenideElement fieldTestName = $("[data-testid=\"Test name input\"]"); // Поле "Название теста"

    private SelenideElement fieldWebSite = $("[data-testid=\"Address site input\"]"); // Поле "Адрес сайта"

    private SelenideElement goToAudience = $("[data-testid=\"Submit button\"]"); // Кнопка "К выбору аудитории".

    private SelenideElement fieldNameSegment = $("[data-testid=\"Segment name input 0\"]"); // Поле "Название сегмента"

    private SelenideElement goToQuestButton = $("[data-testid=\"Tasks button\"]"); // Кнопка перехода к заданиям.

    private SelenideElement fieldForQuestion = $("[data-testid=\"Tasks task question\"]"); // Поле для ввода вопроса.

    private SelenideElement addedQuestionButton = $("[data-testid=\"Tasks submit task\"]"); // Кнопка добавления задания.

    private SelenideElement checkAndRunTestButton = $("[data-testid=\"Check button\"]"); // Кнопка перехода к проверке и запуску теста.

    private SelenideElement rubFreeTestButton = $("[data-testid=\"Checkout start button\"]"); // Запуск бесплатного теста.

    private SelenideElement textAfterCreateNewTest = $("[class = \"sc-itybZL gLzIYc\"]"); // Текст , который появляется после успешного создания теста.

}


