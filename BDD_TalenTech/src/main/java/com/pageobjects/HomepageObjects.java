package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageObjects {
	
	public static String homepageURL = "https://demo.oscommerce.com/";
	public static String homepageTitle = "osCommerce Demo";
	
	public static String loginPageURL = "https://demo.oscommerce.com/login.php";
	public static String accountPageURL = "https://demo.oscommerce.com/account.php";
	
	public static String email = "lutfamashuk@yahoo.com";
	public static String password = "talentech123";
	
	
	@FindBy 
	(id = "tdb3")
	public static WebElement myAcountButton;
	
	@FindBy 
	(name = "email_address")
	public static WebElement emailTextBox;
	
	@FindBy 
	(xpath = "//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")
	public static WebElement passwordTextBox;

	@FindBy
	(css = "#tdb1 > span.ui-button-icon-primary.ui-icon.ui-icon-key\r\n")
	public static WebElement signInButton;

}