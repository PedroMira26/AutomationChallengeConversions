package com.pmira.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.joda.time.Seconds;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.digitaldutch.com/unitconverter")
public class ConvertionsPage extends PageObject {
	
	@FindBy(id="list-item9")
	public WebElementFacade listLenght ;

	@FindBy(xpath="//li[@id='list-item13']//a[@class='list-a']")
	public WebElementFacade listSpeed ;

	@FindBy(id="inputFrom")
	public WebElementFacade txtFrom ;

	@FindBy(id="inputTo")
	public WebElementFacade txtTo ;

	@FindBy(id="selectFrom")
	public WebElementFacade lstSelectFrom ;

	@FindBy(id="selectTo")
	public WebElementFacade lstSelectTo ;

	@FindBy(xpath="/html/body/div[1]/div/a")
	public WebElementFacade msgCookie ;



	
	public void FillOutFieldsLenght(String values) {
		msgCookie.click();
		listLenght.click();
		txtFrom.clear();
		txtFrom.sendKeys(values);
		lstSelectFrom.selectByVisibleText("kilometers [km]");
		lstSelectTo.selectByVisibleText("meters [m]");
	}


	public void verifyResult(String values) {
		String resultConvertion = (txtTo).getValue();
		assertThat(resultConvertion, containsString(values));
	}

	public void FillOutFieldsSpeed(String values)  {
		Actions act = new Actions(getDriver());


		msgCookie.click();
		//listSpeed.waitUntilVisible();
		//listSpeed.wait();

		act.moveToElement(listSpeed).click().perform();
		listSpeed.sendKeys(Keys.ENTER);
		txtFrom.clear();
		txtFrom.sendKeys(values);
		lstSelectFrom.selectByIndex(7);
		lstSelectTo.selectByIndex(14);
	}
}
