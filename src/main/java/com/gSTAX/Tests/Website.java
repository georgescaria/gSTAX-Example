package com.gSTAX.Tests;

import org.testng.annotations.Test;

import com.gSTAX.Setup.InitialSetup;
import com.gSTAX.Utilities.Report;

public class Website extends InitialSetup 
{

	@Test       
    public void AmazonTest() throws Exception
    {
        String title = driver.getTitle();
        Report.pass("Log");
        Report.passWithScreenshot();
        Report.passWithScreenshot("Log");
        Report.takeScreenshot("Log");
        Report.fail("Log");
        Report.failWithScreenshot();
        Report.failWithScreenshot("Log");
    }
}

