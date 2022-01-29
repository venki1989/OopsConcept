package com.Frame;

import org.testng.annotations.Test;

public class loginTest extends BaseTest {


	@Test
	public void clickUserName()
	{
		masterpage.getInstance(LoginPage.class).getUser();

	}

}
