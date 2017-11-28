package com.selenium.WebService;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass 
{
WebDriver driver;
	public void signup()
	{
		WebElement signup_button=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		signup_button.click();
	}
}
