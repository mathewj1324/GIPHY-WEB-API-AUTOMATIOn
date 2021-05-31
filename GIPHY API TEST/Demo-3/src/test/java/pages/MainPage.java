package pages;

import org.openqa.selenium.WebDriver;
import runners.BaseClass;




public class MainPage extends BaseClass {


    public MainPage(WebDriver driver) {
    }

    public void launchApplication(WebDriver driver) {
        driver.get(baseURL);
    }
}
