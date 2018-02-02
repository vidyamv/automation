package com.QEonboardingpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.QEonboardingpractice.generics.BaseTest;

public class Basepage extends BaseTest {

	@FindBy(id="primary-header-home")
	private WebElement homepage;
	
	public  Basepage()
	{
		PageFactory.initElements(driver,this);
	}
	public void homepage()
	{
		homepage.click();
	}
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("The title is matching"+etitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("The title is not matching"+etitle,true);
			Assert.fail();
			
		}
	}
	public void verifyingOfElement(WebElement element)
	{

		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("The element is present"+element.getText(),true);
		}
		catch(Exception e)
		{
			Reporter.log("The title is not present"+element.getText(),true);
			Assert.fail();
		}
	
	}
	


}
