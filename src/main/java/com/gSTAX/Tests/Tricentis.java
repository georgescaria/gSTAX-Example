package com.gSTAX.Tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import com.gSTAX.ElementXPaths.ElementXPaths;
import com.gSTAX.Setup.InitialSetup;
import com.gSTAX.Utilities.Report;
import com.gSTAX.Utilities.ElementActions;

public class Tricentis extends ElementXPaths
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
        	action.click(TC_ID, register, "register");
        	action.waitUntilDisplayed(TC_ID, register);
        	action.click(TC_ID, login, "login");
        	action.waitUntilDisplayed(TC_ID, login);
        	action.click(TC_ID, cart, "cart");
        	action.waitUntilDisplayed(TC_ID, cart);
        	action.click(TC_ID, wishlist, "wishlist");
        	action.waitUntilDisplayed(TC_ID, wishlist);
        }
        
    }
}

