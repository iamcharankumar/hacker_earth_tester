package com.hackerearth.executionmanager;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hackerearth.base.HackerEarthBaseTestMethods;
import com.hackerearth.test.HackerEarthHomePageTestMethods;
import com.hackerearth.test.HackerEarthLoginTestMethods;

public class HackerEarthExecutionManager 

{
	HackerEarthBaseTestMethods hackerEarthBaseTestMethods;
	HackerEarthHomePageTestMethods hackerEarthHomePageTestMethods;
	HackerEarthLoginTestMethods hackerEarthLoginTestMethods;



	@Test(groups = "Hacker Earth UI")
	public void startHackerEarthQATask()
	{
		try
		{			
			hackerEarthBaseTestMethods = new HackerEarthBaseTestMethods();
			hackerEarthHomePageTestMethods = new HackerEarthHomePageTestMethods();
			hackerEarthLoginTestMethods = new HackerEarthLoginTestMethods();

			System.out.println("\n\n--------------------------> QA TASK BEGINS! <--------------------------\n\n");
			hackerEarthBaseTestMethods.openHackerEarthURL();
			System.out.println("\n\n--------------------------> LANDED IN HOME PAGE. HOME PAGE SCENARIOS STARTED <--------------------------\n\n");
			hackerEarthHomePageTestMethods.testSocialLoginButtons();
			hackerEarthHomePageTestMethods.testClickSignUpButton();
			hackerEarthHomePageTestMethods.testSignUpBoxPoppedUp();
			hackerEarthHomePageTestMethods.testEmptySignUp();
			hackerEarthHomePageTestMethods.testNewUserCreation();
			System.out.println("\n\n--------------------------> LOGIN SCENARIOS STARTED <--------------------------\n\n");
			//hackerEarthLoginTestMethods.testClickStartWithGoogleButton();
			hackerEarthLoginTestMethods.testClickLoginButton();
			hackerEarthLoginTestMethods.testLoginPopUpBox();
			hackerEarthLoginTestMethods.testPressLoginButton();
			hackerEarthLoginTestMethods.isLoginHackerEarth();
			hackerEarthBaseTestMethods.closeBrowser();
			System.out.println("\n\n--------------------------> QA TASK ENDS! <--------------------------\n\n");
		}
		catch (Exception hackerEarthProjectException)
		{
			System.err.println("\n\nError From the Execution Manager - " + hackerEarthProjectException.getMessage() + "\n\n");
			Reporter.log
			(
					"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"							
							+ hackerEarthProjectException.getMessage()
							+ "</font>"
					);
		}
	}
}