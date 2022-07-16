package com.cts.automation.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Select s;
	public static JavascriptExecutor js;
	public static void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	public static JavascriptExecutor returnJSObj()
	{js=(JavascriptExecutor)driver;
		return js;
	}
	public static void clickElement(WebElement element)
	{
		returnJSObj().executeScript("arguments[0].click()",element);	
	}
	public static void scrollElement(int n)
	{
		 returnJSObj().executeScript("window.scrollBy(0,"+n+")");	
	}


	
	public static void selectValues(WebElement selection,String value)
	{
		s=new Select(selection);
		s.selectByValue(value);
	}
	}

