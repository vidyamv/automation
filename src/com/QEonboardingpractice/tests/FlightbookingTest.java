package com.QEonboardingpractice.tests;

import org.testng.annotations.Test;

import com.QEonboardingpractice.generics.BaseTest;
import com.QEonboardingpractice.pages.Basepage;
import com.QEonboardingpractice.pages.Flightpage;

public class FlightbookingTest extends BaseTest {

	@Test
	public void testFlightbooking()
	{
		String atitle="ORBITZ.com – Best Travel Deals";
		
		Flightpage fp=new Flightpage();
		Basepage bp=new Basepage();
		bp.verifyTitle(atitle);
		//getScreenshot(driver, "ORBITZ.com – Best Travel Deals");
		fp.flighttabOnclick();
		fp.flightsrc("pnq");
		//fp.verifyingOfElement(element);
        fp.flightdest("blr");
		fp.departing();
		fp.departcalenderclick();
		fp.returning();
		fp.returncalenderclick();
		fp.search();
		//getScreenshot(driver,"PNQ to BLR Flights  Orbitz");
		
		
		
	}
	



}
