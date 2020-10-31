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
        Report.pass(title);
        Report.passWithScreenshot();
        Report.passWithScreenshot(title);
        Report.takeScreenshot(title);
        Report.fail(title);
        Report.failWithScreenshot();
        Report.failWithScreenshot(title);
    }
}

