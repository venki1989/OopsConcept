package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class MasterPage {

	WebDriver driver;
	WebDriverWait wait;

	public MasterPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver, 10);
	}

	//abstract method

	public abstract String getPageTitle();
	public abstract void waitforElement(By locator);
	public abstract WebElement getElement(By locator);

	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass)
	{
		try
		{
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e)
		{

		}
		return null;
	}



}
