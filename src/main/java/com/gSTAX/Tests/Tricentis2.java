package com.gSTAX.Tests;

import java.io.BufferedReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;
import org.w3c.dom.Document;

import com.gSTAX.ElementXPaths.ElementXPaths;
import com.gSTAX.Utilities.Report;
import com.gSTAX.Utilities.ElementActions;

public class Tricentis2 extends ElementXPaths
{
	ElementActions action = new ElementActions();
	WebDriver driver;
	
	@Parameters({ "TC_ID"})
	@Test       
    public void WebsiteTest(String TC_ID) throws Exception 
    {
		driver = action.getDriver(TC_ID);
		
    	for(int i=0; i<2; i++)
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
        	action.checkDropDownValues(TC_ID, TC_ID, TC_ID);
        	
        	
        }
        
    }
}

