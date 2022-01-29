package com.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
	public MasterPage masterpage;

	@BeforeMethod
	public void setUpEnvironemt()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jnjermawsuat.a01a.metricstream.com/metricstream/auth/dualLogin.jsp");
		masterpage = new BasePage(driver);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}



}
