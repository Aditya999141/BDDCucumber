package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
{
	WebDriver driver = new ChromeDriver();
	@When("User provide facebook URL, user id and password")
	public void user_provide_facebook_url_user_id_and_password() 
	{
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.facebook.com/login/");
		driver.navigate().to("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("aditya.bandgar45@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Whirpol@1860310");
		
	}

	@When("Hits enter")
	public void hits_enter() 
	{
	    driver.findElement(By.xpath("//button[@id='loginbutton']")).sendKeys(Keys.ENTER);
	}

	@Then("User navigated to result")
	public void user_navigated_to_result() 
	{
	   System.out.println(driver.getTitle());
	   //driver.close();
	   //driver.quit();
	}


	
}
