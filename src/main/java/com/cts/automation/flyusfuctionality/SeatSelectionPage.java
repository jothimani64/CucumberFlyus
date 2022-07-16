package com.cts.automation.flyusfuctionality;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.baseclass.BaseClass;

public class SeatSelectionPage extends BaseClass{
	public  SeatSelectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='Choose your level of support']")
	public WebElement scrollToViewElment;
	@FindBy(xpath="//input[contains(@id,'fname-pax')]")
	public WebElement txtFirstName;
	@FindBy(xpath="(//input[@placeholder='*Last Name (required)'])[1]")
	public WebElement txtLastName;
	@FindBy(xpath="//select[@uib-tooltip='Title (optional)']")
	public WebElement selectTiltle;
	@FindBy(xpath="//select[@uib-tooltip='Gender*']")
	public WebElement selectGender;
	@FindBy(xpath="//input[@placeholder='*DOB  (required)']")
	public WebElement txtDateOfBirth;
	@FindBy(xpath="(//a[text()='Select'])[5]")
	public WebElement levelSelect;
	@FindBy(xpath="(//input[@name='flexBooking'])[2]")
	public WebElement flexBooking;
	@FindBy(xpath="(//input[@name='xservices.AHLP'])[2]")
	public WebElement sericves;
	@FindBy(xpath="(//input[@name='xservices.SMS'])[2]")
	public WebElement smsSerives;
	@FindBy(xpath="(//input[@name='xservices.RFND'])[2]")
	public WebElement refund;
	@FindBy(xpath="((//tbody)[3]//tr//td//img[@src='img/sm/seat-premium.svg'])[1]")
	public WebElement selectSeat;
	@FindBy(xpath="(//span[@class='block clearfix h1 m-t-none font-bold flys-avg-total ng-binding'])[2]")
	public WebElement travelCost;
	
	public void selectDetails(String firstName,String lastName,String optional,String gender,String dob)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", txtDateOfBirth);
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		selectValues(selectTiltle,optional);
		selectValues(selectGender,gender);
		txtDateOfBirth.sendKeys(dob);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500)");
	}
	public void selectSeat() throws InterruptedException
	{  Thread.sleep(5000);
	
	clickElement(levelSelect);
	scrollElement(200);
	clickElement(flexBooking);
	clickElement(sericves);
	scrollElement(200);
	clickElement(smsSerives);
	clickElement(refund);
	scrollElement(300);
	clickElement(selectSeat);
	 
	}
	
	
	public void priceTotal()
	{
		System.out.println("Total Trip Cost : "+travelCost.getText());
		
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
//	levelSelect.click();
//	flexBooking.click();
//	sericves.click();
//	smsSerives.click();
//	refund.click();
//	selectSeat.click();
	}



