package com.pmira.formacion.definition;


import com.pmira.formacion.steps.ConvertionsSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConvertionsDefinition {
		
	@Steps
	ConvertionsSteps convertionsSteps;

	@Given("^Im in the convertions page$")
	public void imInTheConvertionsPage()  {
		convertionsSteps.OpenPage();
	}

	@When("^I fill out the field from with the value (.*)$")
	public void iFillOutTheFieldFromWithTheValue(String values)  {
		convertionsSteps.FillOutFieldsLenght(values);
	}

	@When("^I fill out the from field with the value (.*) for the speed$")
	public void iFillOutTheFromFieldWithTheValueForTheSpeed(String values)  {
		convertionsSteps.FillOutFieldsSpeed(values);
	}


	@Then("^In the screen i see the value (.*) in meters$")
	public void inTheScreenISeeTheValueInMeters(String value)  {
		convertionsSteps.verifyResult(value);
	}

	@Then("^the result in the screen shows (.*) in mph$")
	public void theResultInTheScreenShows(String value)  {
		convertionsSteps.verifyResult(value);
	}
}