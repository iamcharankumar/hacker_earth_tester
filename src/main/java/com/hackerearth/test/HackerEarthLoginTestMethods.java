package com.hackerearth.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hackerearth.pageobjects.HackerEarthLogin;

public class HackerEarthLoginTestMethods extends HackerEarthLogin 
{
	int TestCaseCount = 0;

	public int testCaseNumber() 
	{
		TestCaseCount++;
		return TestCaseCount;
	}

	@Test(priority=0)
	public void testClickLoginButton()
	{
		Assert.assertTrue(isLoginButttonClicked());
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Login Button is Clicked"
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testLoginPopUpBox()
	{
		Assert.assertTrue(isLoginPopUpBoxAppeared());
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Login Pop Up Box Appeared"
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testPressLoginButton()
	{
		Assert.assertTrue(pressLoginButton());
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Login Button Clikced"
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testLogin()
	{
		Assert.assertTrue(isLoginHackerEarth());
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Successfully Logged In"
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testClickSignUpButton()
	{
		Assert.assertTrue(isLoginHackerEarth());		
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"												
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Sign Up Button is Clicked"					
						+ "</font>"
				);
	}

	@Test(priority=0)
	public void testClickStartWithGoogleButton()
	{
		Assert.assertTrue(clickStartWithGoogleButton());

		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"
						+ "Test Case Number " + testCaseNumber() + ": "
						+ "Start With Google Button is Clicked"
						+ "</font>"
				);
	}
}