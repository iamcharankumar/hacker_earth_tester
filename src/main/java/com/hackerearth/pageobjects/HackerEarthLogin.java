package com.hackerearth.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.hackerearth.base.HackeearthWebUIConstants;
import com.hackerearth.base.HackerEarthBaseTestMethods;

public class HackerEarthLogin extends HackerEarthBaseTestMethods implements HackeearthWebUIConstants 
{

	//@FindBy(id="id_login")
	//WebElement loginButtonClick;
	public boolean isLoginButttonClicked()
	{
		WebElement loginButtonClick = driver.findElement(LOGIN_BUTTON);
		String loginButtonText = "Login";

		if(loginButtonClick.getText().equalsIgnoreCase(loginButtonText))
		{
			if(loginButtonClick.isDisplayed())
			{
				loginButtonClick.click();
				getscreenshot();
				System.out.println("Login Button is Clicked. Enter the user Credentials");
			}
		}	

		return true;
	}

	public boolean isLoginPopUpBoxAppeared()
	{
		WebElement loginButtonPopUp = driver.findElement(LOGIN_POP_UP_BOX);
		String loginPopUpText = "Log in";

		if(loginButtonPopUp.getText().equalsIgnoreCase(loginPopUpText))
		{
			getscreenshot();
			System.out.println("Login Pop Up Box Appeared!");

		}	

		return true;
	}

	public boolean pressLoginButton()
	{
		WebElement pressLoginButton = driver.findElement(LOGIN_POP_UP_BUTTON);
		String pressLoginButtonText = "";

		if(pressLoginButton.getText().equalsIgnoreCase(pressLoginButtonText))
		{
			if(pressLoginButton.isDisplayed())
			{
				pressLoginButton.click();
				getscreenshot();
				System.out.println("Login Button Clicked!");
			}
		}

		return true;
	}

	public boolean isLoginHackerEarth()
	{
		WebElement typeEmailId = driver.findElement(LOGIN_EMAIL_ID);
		typeEmailId.clear();
		typeEmailId.sendKeys(EMAIL_ID);
		getscreenshot();

		List<WebElement> typePassword = driver.findElements(LOGIN_PASSWORD);		
		typePassword.get(1).clear();
		typePassword.get(1).sendKeys(PASSWORD);
		getscreenshot();

		pressLoginButton();
		getscreenshot();

		String LandingPageText = "Programming Challenges & Coding Competitions of 2017 | HackerEarth";

		if(driver.getTitle().equals(LandingPageText))
		{
			System.out.println("Successfully Logged In!");
		}

		getscreenshot();

		return true;
	}

	public boolean clickStartWithGoogleButton()
	{
		// Handling Browser Windows
		String currentWindow = driver.getWindowHandle();

		WebElement clickStartWithGoogleButton = driver.findElement(SOCIAL_LOGIN_BUTTONS);
		String googleButtonText = "Start with Google";
		if(clickStartWithGoogleButton.getText().equalsIgnoreCase(googleButtonText))
		{
			clickStartWithGoogleButton.click();
			getscreenshot();
			for (String newWindow: driver.getWindowHandles())
			{
				driver.switchTo().window(newWindow);
				System.out.println("Switched to New Window!");
			}
			driver.close();
			driver.switchTo().window(currentWindow);
			System.out.println("Switched to Current Window!");
			System.out.println(googleButtonText + " Button is Clicked");
		}

		else
		{
			System.err.println("The " + googleButtonText + " is not Clicked!");
		}

		return true;
	}
}