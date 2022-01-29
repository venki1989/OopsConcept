package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends MasterPage {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public void waitforElement(By locator) {

		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element =null;
		try
		{
			element=driver.findElement(locator);
			return element;
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		return element;
	}

}
