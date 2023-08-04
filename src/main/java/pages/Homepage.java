package pages;

import io.netty.util.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;

public class Homepage extends BasePage{

    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElement loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElement registerLink;

    public Homepage(WebDriver driver) {
        super(driver);
    }


    public void open(){
        driver.get(Constants.BASE_URL);
    }

    public void clickAccountLink() {
        accountLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }

    public void clickRegisterLink(){
        registerLink.click();
    }
}
