package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Steps {
public static WebDriver driver;

@Given("^I launch the url \"([^\"]*)\"$")  
public void i_launch_the_url(String arg1) throws Throwable {  
  
System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");  
driver = new ChromeDriver();  
driver.get("https://giphy.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
}  
@When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")  
public void i_provide_and(String arg1, String arg2) throws Throwable {  
  // Write code here that turns the phrase above into concrete actions  
driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(arg1); 
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg2); 
}  
@When("^I click on login button$")  
public void i_click_on_login_button() throws Throwable {  
  // Write code here that turns the phrase above into concrete actions  
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
}  
@Then("^I should see the login page$")  
public void i_should_see_the_Error_message() throws Throwable {  
	try{  
	    // Write code here that turns the phrase above into concrete actions  
	   if(driver.findElement(By.name("email")).isDisplayed()){  
	   Assert.assertTrue(true);  
	   }else  
	   Assert.assertTrue(false);  
	  }catch(Exception NoSuchElementException){  
	   Assert.assertTrue(false);  
	  }finally{  
	   driver.quit();
    	}
    }
}

	 
