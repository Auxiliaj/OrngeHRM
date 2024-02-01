package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	@Given("I navigated to software testing web application")
	public void i_navigated_to_para_bank_web_application() {
	   System.out.println("hgfgh");
	}

	@When("I clicked on create an account link")
	public void i_clicked_on_register_link() {
		System.out.println("hf");
	   
	}

	@When("I have entered new customer information")
	public void i_have_entered_new_customer_information() {
	   System.out.println("hfh");
	}

	@When("Clicked on Register button")
	public void clicked_on_register_button() {
	   
		System.out.println("cbbc");
	}

	@Then("I validate customer registration")
	public void i_validate_customer_registration() {
	   System.out.println("dgfdgd");
	}


}
