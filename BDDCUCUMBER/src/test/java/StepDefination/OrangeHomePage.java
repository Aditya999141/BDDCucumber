package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHomePage
{
	WebDriver driver = new ChromeDriver();
	
	@Given("we are on the orange HRM website")
	public void we_are_on_the_orange_hrm_website() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
	    
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("user is redirected to home")
	public void user_is_redirected_to_home() {
		
		System.out.println("User login successfully");
		System.out.println(driver.getTitle());
		//driver.close();
		//driver.quit();
	   
	}	
	
}
