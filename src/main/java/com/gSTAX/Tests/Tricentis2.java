package com.gSTAX.Tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import com.gSTAX.ElementXPaths.ElementXPaths;
import com.gSTAX.Setup.InitialSetup;
import com.gSTAX.Utilities.Report;
import com.gSTAX.Utilities.ElementActions;

public class Tricentis2 extends ElementXPaths
{
	ElementActions action = new ElementActions();
	
	@Parameters({ "TC_ID"})
	@Test       
    public void WebsiteTest(String TC_ID) throws Exception
    {
		Report.takeScreenshot(TC_ID, "Take screenshot with Log");
        Report.passWithScreenshot(TC_ID, "Pass test step with screenshot and log");
        
        for(int i=0; i<5; i++)
        {
        	action.click(TC_ID, books, "books");
        	action.waitUntilDisplayed(TC_ID, books);
        	action.click(TC_ID, computers, "computers");
        	action.waitUntilDisplayed(TC_ID, computers);
        	action.click(TC_ID, electronics, "electronics");
        	action.waitUntilDisplayed(TC_ID, electronics);
        	action.click(TC_ID, digitaldownloads, "digitaldownloads");
        	action.waitUntilDisplayed(TC_ID, digitaldownloads);
        	action.click(TC_ID, jewelry, "jewelry");
        	action.waitUntilDisplayed(TC_ID, jewelry);
        	action.click(TC_ID, giftcards, "giftcards");
        	action.waitUntilDisplayed(TC_ID, giftcards);
        }
        
    }
}

