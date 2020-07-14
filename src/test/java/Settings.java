import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Settings {
    private static final String URL = "https://uxcrowd.ru/";
    public UserAuthorization userAuthorization;
    public MenuPage menuPage;
    public TestCreateNewTest testCreateNewTest;

    @BeforeClass
    public void openSession() {
        open(URL);
         userAuthorization = new UserAuthorization();
         menuPage = new MenuPage();
         testCreateNewTest = new TestCreateNewTest();

    }


    @AfterClass
    public void closeSession() {
        closeWebDriver();
    }
}
