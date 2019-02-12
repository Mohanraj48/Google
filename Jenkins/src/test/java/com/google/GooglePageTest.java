package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest 
{

	@Test
	public void setup() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Mohan/jarfiles/WebDrivers/Chrome/chromedriver_win32/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.get("https://www.google.co.in");
		Assert.assertTrue(d.getTitle().contains("Google"));
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		d.quit();
	}
	
	
}
