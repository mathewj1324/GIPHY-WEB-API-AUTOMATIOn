package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class Steps {
public static WebDriver driver;
	@Given("^user clicks on Login Button$")
	public void userClicksOnLoginButton(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("https://giphy.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	}
	  @And("^user enter correct username$")
	  public void userEnterUsername() {
		  driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("mathewj1324@gmail.com");
	  }
	  @And("user enter correct password$")
	  public void userEnterpassword() {
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("0@Iwonthegame");
	  }
	  @Then("^user successfully Logged in$")
	  public void userSuccessfullyLoggedIn() {
		  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
           String URL = driver.getCurrentUrl();
           if(URL.equals("https://giphy.com/channel")) {
           	System.out.println("User successfully Logged in");
           }
           	else {
           		System.out.println("User unsuccessfull in Logging in ");
           	}
	  }
	  @Then("^User clicked on upload Button$")
	  public void user_clicked_on_upload_button() {
		  driver.findElement(By.xpath("//span[contains(text(),'Upload')]")).click();;
	  }
	  @Then("^user select upload file Option$")
	  public void user_select_upload_file_option() {
		  
		  WebElement element = driver.findElement(By.xpath("//div[@class='Row-sc-173xnrn fRGnZR']//div[1]//div[1]//input[1]"));
		  element.sendKeys("C:\\Users\\MyPC\\eclipse-workspace\\Sample\\giphyautomate\\src");
	  }
	  
	  @Then("^user performed pages check$")
	  public void user_performed_pages_check(){
		  driver.navigate().back();
		  driver.findElement(By.xpath("//a[contains(text(),'Reactions')]")).click();
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,100)", "");
		  driver.findElement(By.xpath("//a[contains(text(),'Entertainment')]")).click();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,100)", "");
		  driver.findElement(By.xpath("//a[contains(text(),'Sports')]")).click();
		  JavascriptExecutor jss = (JavascriptExecutor) driver;
		  jss.executeScript("window.scrollBy(0,100)", "");
	  }
	  
	
	  
	  
	  
	  
}
