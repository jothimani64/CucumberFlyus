package com.cts.automation.flyusfuctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FightSearchPage {
	public FightSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='From']")
	public WebElement txtFrom;
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement txtTo;
	@FindBy(xpath="//a[@id='flys-paxes']")
	public WebElement lnkAdult;
	@FindBy(xpath="//button[text()='Search']")
	public WebElement btnSearch;

	public void searchFight(String source,String destination)
	{
		txtFrom.sendKeys(source);
		txtTo.sendKeys(destination);
		lnkAdult.click();
		btnSearch.click();



	}

}

