package pages;

import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.BaseClass;
import stepDefinitions.WebSteps;

import java.util.concurrent.TimeUnit;

public class LoginPage extends WebSteps {
    public BaseClass base;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Log in')]")
    private WebElement login;


    public void launchApplication(WebDriver driver) {
        driver.get("https://giphy.com");
    }

    public void clickLogin(WebDriver driver) {

        login.click();
    }
}
