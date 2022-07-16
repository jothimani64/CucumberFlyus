package com.cts.automation.flyusfuctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.cts.automation.baseclass.BaseClass;

public class FightSearchResultPage extends BaseClass{

	public FightSearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[@type='button'])[1]")
	public WebElement btnAlert; 
	@FindBy(xpath="(//a[text()='Select'])[2]")
	public WebElement btnSearch; 
	public void fightSearchResults() throws InterruptedException
	{
	Thread.sleep(50000);
	btnAlert.click();
	Thread.sleep(5000);
	scrollElement(1000);
	Thread.sleep(5000);
	clickElement(btnSearch);
	


	}


}