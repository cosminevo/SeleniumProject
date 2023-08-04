package test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.Homepage;
import pages.LoginPage;

@RunWith(JUnit4.class)
public class BaseTest {
    protected WebDriver driver;
    protected Homepage homepage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new Homepage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        homepage.open();
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
