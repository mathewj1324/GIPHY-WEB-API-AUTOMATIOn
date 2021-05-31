package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import runners.BaseClass;

import java.util.concurrent.TimeUnit;

public class WebSteps  {

    WebDriver driver=null;
    LoginPage loginPage;




    @Given("^that user is on main page$")
    public void that_user_is_on_main_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
        ChromeOptions opt = new ChromeOptions();
        opt.merge(cap);
        opt.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        loginPage= new LoginPage(driver);
        loginPage.launchApplication(driver);

//getting connected to the driver
    }

    


}
