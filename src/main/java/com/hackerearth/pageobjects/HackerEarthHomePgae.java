package com.hackerearth.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.hackerearth.base.HackeearthWebUIConstants;
import com.hackerearth.base.HackerEarthBaseTestMethods;

public class HackerEarthHomePgae extends HackerEarthBaseTestMethods implements HackeearthWebUIConstants 

{
	public String verifyStartWithFacebookButton()
	{
		WebElement startWithFacebookButton = driver.findElement(START_WITH_FACEBOOK_BUTTON);

		String facebookButtonText = "Start with Facebook";		

		if(startWithFacebookButton.getText().equalsIgnoreCase(facebookButtonText))
		{
			System.out.println(facebookButtonText + " Button is Present");
		}

		return facebookButtonText;
	}

	public String verifyStartWithGoogleButton()
	{
		WebElement startWithGoogleButton = driver.findElement(START_WITH_GOOGLE_BUTTON);

		String googleButtonText = "Start with Google";

		if(startWithGoogleButton.getText().equalsIgnoreCase(googleButtonText))
		{
			System.out.println(googleButtonText + " Button is Present");
		}

		return startWithGoogleButton.getText();
	}

	public boolean isSignUpButtonClicked()
	{
		WebElement clickSignUpButton = driver.findElement(CLICK_SIGN_UP_BUTTON);
		String signUpButtonText = "Sign up";

		if(clickSignUpButton.getText().equalsIgnoreCase(signUpButtonText))
		{
			System.out.println(signUpButtonText + " Button is Present");

			if(clickSignUpButton.isDisplayed())
			{
				clickSignUpButton.click();
				System.out.println(signUpButtonText + " Button is Clicked");
			}
		}

		return true;
	}

	public boolean isSignUpBoxPoppedUp()
	{
		WebElement signUpButtonPopUp = driver.findElement(SIGN_UP_POP_BOX);
		String singUpPopUpBoxText = "Sign Up";

		if(signUpButtonPopUp.getText().equalsIgnoreCase(singUpPopUpBoxText))
		{
			getscreenshot();
			System.out.println(singUpPopUpBoxText + " has popped up. Go Create the new user");
		}

		return true;
	}

	public boolean pressStartButton() throws Exception
	{
		List<WebElement> startNowButton = driver.findElements(CLICK_START_NOW_BUTTON);
		String startNowButtonText = "";

		if(startNowButton.get(1).getText().equalsIgnoreCase(startNowButtonText))
		{
			startNowButton.get(1).click();
			getscreenshot();
			System.out.println("Empty Sign Up Validated!");
		}

		else
		{
			System.err.println("Error in Empty Sign Up Method!");
		}

		return true;
	}

	public boolean isNewUserCreated() throws Exception
	{
		List<WebElement> firstName = driver.findElements(TYPE_SIGN_UP_FIRST_NAME);
		firstName.get(1).clear();
		firstName.get(1).sendKeys("Bruce");
		getscreenshot();

		List<WebElement> lastName = driver.findElements(TYPE_SIGN_UP_LAST_NAME);
		lastName.get(1).clear();
		lastName.get(1).sendKeys("Wayne");
		getscreenshot();

		List<WebElement> emailId = driver.findElements(TYPE_SIGN_UP_EMAIL_ID);
		emailId.get(1).clear();				
		emailId.get(1).sendKeys("butterflyseller@gmail.com");
		getscreenshot();

		List<WebElement> password = driver.findElements(TYPE_SIGN_UP_PASSWORD);
		password.get(2).clear();				
		password.get(2).sendKeys("Heqa@123");
		getscreenshot();

		pressStartButton();
		getscreenshot();

		return true;
	}
}