package runners;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public String baseURL = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
    public WebDriver driver;
}
