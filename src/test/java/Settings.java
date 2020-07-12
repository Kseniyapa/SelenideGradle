import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Settings {
    private static final String URL = "https://test.uxcrowd.ru/";
    public UserAuthorization userAuthorization;
    public MenuPage menuPage;

    @BeforeClass
    public void openSession() {
        open(URL);
        UserAuthorization userAuthorization = new UserAuthorization();
    }


    @AfterClass
    public void closeSession() {
        closeWebDriver();
    }
}
