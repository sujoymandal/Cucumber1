package Steps;

import java.util.List;

import cucumber.api.java.en.Then;

public class LoginStepsProd {
	
	
	@Then("^Check Select Role$")
	public void check_Select_Role(List<String> Role) throws Throwable {
	    System.out.println("Role is selected.."+Role.get(1));
	}

}
