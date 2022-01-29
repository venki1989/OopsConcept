/**
 *
 */
package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author venkatesh.m
 *
 */
public class LoginPage extends BasePage {

	//Page locators
	//private by variable (Encapsulation concept)

	private By user=By.xpath("//a/font[text()='Internal User']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void getUser()  {
		getElement(user).click();

	}

}
