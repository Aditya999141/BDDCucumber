package StepDefination;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search
{
	WebDriver driver = new ChromeDriver();     
	
	@Given("Browser is open")
	public void browser_is_open() 
	{
	  System.out.println("Borwser is open");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@And("we are at Google search page")
	public void we_are_at_google_search_page() 
	{
		driver.navigate().to("https://www.google.co.in/");
	
	}

	@When("user enters text in text box")
	public void user_enters_text_in_text_box() 
	{

		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Facebook");

	}

	@And("hits entered")
	public void hits_entered() 
	{
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ENTER);
		
		
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() 
	{

		driver.getPageSource().contains("dhdkdf dkdkfrfkk");
		driver.close();
		driver.quit();
		
	}
	
}
