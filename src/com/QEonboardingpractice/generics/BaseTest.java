package com.QEonboardingpractice.generics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;



public class BaseTest implements Autoconstantas {
	public static WebDriver driver;
	@BeforeMethod
	public void precondtion(@Optional("firefox")String browsertype)
	{ 
		
		{ 
			if(browsertype.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			}
			
			else if(browsertype.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.orbitz.com");
		
	}
	@AfterMethod
	public void postcondtion()
	{
		driver.close();
	}
	public void mouseActions(WebElement src)
	{
		Actions act =new Actions(driver);
		act.sendKeys(Keys.ENTER);
		//act.moveToElement(src).click().perform();
	}



}
