package com.cts.automation.flyusflightbooking.stepdefinition;

import java.util.List;
import java.util.Map;

import com.cts.automation.baseclass.BaseClass;
import com.cts.automation.flyusfuctionality.FightSearchPage;
import com.cts.automation.flyusfuctionality.FightSearchResultPage;
import com.cts.automation.flyusfuctionality.SeatSelectionPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FlyusFightBookingStepDef extends BaseClass{
	@Given("user launches chrome and navigates to url")
	public void launchAndNaigate() {
		launchChrome();
		driver.get("https://www.flyus.com/");
	  
	}

	@When("user enters {string} and {string} and click search")
	public void enterSourceAndDestination(String source, String destination) {
		FightSearchPage search=new FightSearchPage(driver);
		search.searchFight(source,destination);
	    
	}

	@When("user selects the flight")
	public void selectFlight() throws InterruptedException {
		FightSearchResultPage results=new FightSearchResultPage(driver);
		results.fightSearchResults();
	}

	@When("users enters below passenger info")
	public void users(DataTable dataTable) throws InterruptedException {
		Thread.sleep(10000);
		List<Map<String,String>> asMaps=dataTable.asMaps(String.class, String.class);
		SeatSelectionPage details=new SeatSelectionPage(driver);
		String firstName=asMaps.get(0).get("firstname");
		String lastName=asMaps.get(0).get("lastname");
		String  dob=asMaps.get(0).get("dob");
		String optional=asMaps.get(0).get("opional");
		String  gender=asMaps.get(0).get("Gender");
		details.selectDetails(firstName, lastName, optional, gender, dob);
	
	}

	@When("user selects seat")
	public void user_selects_seat() throws InterruptedException {
		SeatSelectionPage details1=new SeatSelectionPage(driver);
        details1.selectSeat();
	}

	@Then("print the price")
	public void print_the_price() {
		SeatSelectionPage details2=new SeatSelectionPage(driver);
		 details2.priceTotal();
	    	driver.close();
	    
	}




}
