import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MenuPage;
import pages.UserAuthorization;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Settings {

    public static final String EXCEPTEDTEXTAFTERCREATENEWTEST = "Ура! Тест создан и отправлен пользователям.";
    public static final String TESTNAME = "first test";
    public static final String WEBSITE = "test.uxcrowd.ru";
    public static final String SEGMENTNAME = "test";
    public static final String SECONDSEGMENT = "test second";
    public static final String QUESTION = "added new question";
    public static final String EMAILCLIENT = "qci4b9h12pwe@1secmail.com";
    public static final String PASSWORDCLIENT = "MXdLdU";
    private static final String URL = "https://test.uxcrowd.ru/";
    public UserAuthorization userAuthorization;
    public MenuPage menuPage;
    public CreateNewTest createNewTest;


    @BeforeClass
    public void openSession() {
        open(URL);
        userAuthorization = new UserAuthorization();
        menuPage = new MenuPage();
        createNewTest = new CreateNewTest();


    }

    @AfterClass
    public void closeSession() {
        closeWebDriver();
    }
}


