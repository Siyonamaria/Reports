package Step_Definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

	

		
	

@Given("Launch the browser")
public void launch_the_browser() {
    System.out.println("user inside the browser");
}
@When("user open the url {string}")
public void user_open_the_url(String string) {

	System.out.println("user enters the url");
    }

@When("click on url")
public void click_on_url() {
    System.out.println("user clicks on url");
}

@Then("user should see the home page")
public void user_should_see_the_home_page() {
	System.out.println("user sees home page");
   
}


}
