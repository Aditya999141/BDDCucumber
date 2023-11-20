package StepDefination.StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;




public class Hooks
{	
	@Before
	public void browsersetup()
	{
	
		System.out.println("I am in the browser set up");
	
	}
	
	@After
	public void teardown()
	{
	
		System.out.println("I am in the teardown");
	
	}
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		
		System.out.println("user is on the login page");

	}

	@When("user enters valid Username and Password")
	public void user_enters_valid_username_and_password() {
		
		System.out.println("user enters valid Username and Password");

	}

	@When("click on login button")
	public void click_on_login_button() {
		
		System.out.println("click on login button");

	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() {
		
		System.out.println("user is redirected to home page");
		
		

	}
	
}
