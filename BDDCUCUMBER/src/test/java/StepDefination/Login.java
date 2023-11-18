package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login
{	
	
	WebDriver driver = new ChromeDriver();
	
	@Given("User will on login page")
	public void user_will_on_login_page() 
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
		
	}

	@When("^User enters (.*) & (.*)$")// "^user enters(.*) and(.*)$"
	public void user_enters( String UserName, String Password ) 
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);

		
	}

	@When("Click on Login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("User redirected to Home Page")
	public void user_redirected_to_home_page() 
	
	{
		System.out.println(driver.getTitle());
		//driver.quit();
	}

	
	
}
