package com.hackerearth.base;

import org.openqa.selenium.By;

public interface HackeearthWebUIConstants 
{
	public String HACKER_EARTH_URL = "https://www.hackerearth.com/";
	public String EMAIL_ID = "butterflyseller@gmail.com";
	public String PASSWORD = "Heqa@123";

	// HOME PAGE

	public By START_WITH_FACEBOOK_BUTTON = By.cssSelector(".social-login-button.social-login-button-fb.show-popup span");
	public By START_WITH_GOOGLE_BUTTON = By.cssSelector(".social-login-button.social-login-button-g.show-popup span");
	public By SOCIAL_LOGIN_BUTTONS = By.cssSelector(".social-login-button span");
	public By CLICK_SIGN_UP_BUTTON = By.cssSelector(".nav-signup .show-modal");
	public By SIGN_UP_POP_BOX = By.cssSelector(".modal-header .signup-form-div");
	public By TYPE_SIGN_UP_FIRST_NAME = By.id("id_first_name");
	public By TYPE_SIGN_UP_LAST_NAME = By.id("id_last_name");
	public By TYPE_SIGN_UP_EMAIL_ID = By.id("id_email");
	public By TYPE_SIGN_UP_PASSWORD = By.id("id_password");
	public By CLICK_START_NOW_BUTTON = By.cssSelector(".button.btn-blue.fontawesome");

	// LOGIN
	public By LOGIN_BUTTON = By.cssSelector(".blue-hover.show-modal");
	public By LOGIN_POP_UP_BOX = By.cssSelector(".login-form.align-center.larger");
	public By LOGIN_EMAIL_ID = By.id("id_login");
	public By LOGIN_PASSWORD = By.id("id_password");
	public By LOGIN_POP_UP_BUTTON = By.cssSelector(".button.btn-orange.fontawesome");

	/*public By TYPE_EMAIL_ID = By.id("identifierId");
	 * public By SIGN_UP_FIRST_NAME = By.cssSelector("#modal-signup-form #id_first_name");
	public By SIGN_UP_FIRST_NAME = By.cssSelector("#modal-signup-form #id_last_name");*/
}