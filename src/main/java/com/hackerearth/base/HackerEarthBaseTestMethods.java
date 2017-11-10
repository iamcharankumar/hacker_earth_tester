package com.hackerearth.base;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HackerEarthBaseTestMethods implements HackeearthWebUIConstants
{
	public static WebDriver driver;
	DateFormat formatter = new SimpleDateFormat("MMM dd yy, HH:mm:ss");
	String dateFormatted = formatter.format(System.currentTimeMillis());

	@BeforeTest
	public boolean openHackerEarthURL() throws InterruptedException
	{
		Reporter.log
		(
				"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"							
						+ "QA TASK BEGINS!"
						+ "</font>"
				);
		
		System.out.println("LAUNCHING BROWSER...\n");		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver(capabilities);
		driver.navigate().to(HACKER_EARTH_URL);		
		driver.manage().window().maximize();
		getscreenshot();
		String homePageText = "Hackerearth - Programming challenges and Developer jobs";

		if(driver.getTitle().equalsIgnoreCase(homePageText))
		{
			System.out.println("Landed in Hacker Earth Home Page Successfully!");
		}

		else
		{
			System.out.println("Error in Home Page Landing!");
		}
		return true;
	}

	protected boolean waitforelementNOTpresent(By locator)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated((locator))));
		}
		catch (Exception waitException)
		{
			System.err.println("\nException from the wait method - " + waitException.getMessage());
			Reporter.log
			(
					"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"							
							+ waitException.getMessage()
							+ "</font>"
					);
			return false;
		}
		return true;
	}

	@Test
	protected void getscreenshot() 
	{
		try
		{
			Thread.sleep(2000);						
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("E:\\MMT_Projects\\HackerEarthQACharanArtifacts\\screenshot_"
					+ dateFormatted +".png"));
		}

		catch(Exception screenshotException)
		{
			System.err.println("\nException from the Screenshot method - " + screenshotException.getMessage());
			Reporter.log
			(
					"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"							
							+ screenshotException.getMessage()
							+ "</font>"
					);
		}
	}


	@AfterTest
	public void closeBrowser() 
	{
		try
		{
			Thread.sleep(5000);
			driver.quit();
			System.out.println("\n\n--------------------------> BROWSER CLOSED <--------------------------\n\n");
			Reporter.log
			(
					"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"							
							+ "QA TASK ENDS!"
							+ "</font>"
					);
		}

		catch (Exception exitException)
		{
			System.err.println("\nException from the Close Browser method - " + exitException.getMessage());
			Reporter.log
			(
					"<font face=\"Book Antiqua\", Palatino, \"Palatino Linotype\", \"Palatino LT STD\", Georgia, serif color=\"green\">"							
							+ exitException.getMessage()
							+ "</font>"
					);
		}
	}
}