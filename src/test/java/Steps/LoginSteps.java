package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	
	@Given("^Open the LoginPage$")
	public void open_the_LoginPage() throws Throwable {
	    System.out.println("Opening the Login Page..");
	}

	@When("^Enter the \"([^\"]*)\" UserId$")
	public void enter_the_UserId(String user) throws Throwable {
	    System.out.println("Entering the UserId.."+user);
	}

	@Then("^Enter the \"([^\"]*)\" Passord$")
	public void enter_the_Passord(String pwd) throws Throwable {
	    System.out.println("Entering password.."+pwd);
	}

	@Then("^Click the SubmitButton$")
	public void click_the_SubmitButton() throws Throwable {
	    System.out.println("Clicking on Submit button..");
	}


}
