package com.hackerearth.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hackerearth.pageobjects.HackerEarthHomePgae;

public class HackerEarthHomePageTestMethods extends HackerEarthHomePgae 
{
	int TestCaseCount = 0;
	public int testCaseNumber() 
	{
		TestCaseCount++;
		return TestCaseCount;
	}

	@Test(priority=0)
	public void testSocialLoginButtons()
	{	
		Assert.assertEquals(verifyStartWithFacebookButton(), "Start with Facebook");
		Assert.assertEquals(verifyStartWithGoogleButton(), "Start with Google");

		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Social Login Buttons are Present"
						+ "</font>"
				);		
	}

	@Test(priority=0)
	public void testClickSignUpButton()
	{
		Assert.assertTrue(isSignUpButtonClicked());		
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"												
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Sign Up Button is Clicked"					
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testSignUpBoxPoppedUp()
	{
		Assert.assertTrue(isSignUpBoxPoppedUp());		
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"												
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Sign Up Box Popped Up"					
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testEmptySignUp() throws Exception
	{
		Assert.assertTrue(pressStartButton());
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"												
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Empty Sign Up Validated"					
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testNewUserCreation() throws Exception
	{
		Assert.assertTrue(isNewUserCreated());
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"												
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "New User Created"					
						+ "</font>"
				);
	}
}