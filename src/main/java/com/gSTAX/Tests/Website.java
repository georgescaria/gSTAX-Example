package com.gSTAX.Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.gSTAX.Setup.InitialSetup;
import com.gSTAX.Utilities.Report;

public class Website extends InitialSetup 
{
	@Parameters({ "TC_ID"})
	@Test       
    public void WebsiteTest(String TC_ID) throws Exception
    {
		Report.logEvent(TC_ID, "Log event");
		Report.takeScreenshot(TC_ID);
		Report.takeScreenshot(TC_ID, "Take screenshot with Log");
		Report.pass(TC_ID, "Pass test step with log");
        Report.passWithScreenshot(TC_ID);
        Report.passWithScreenshot(TC_ID, "Pass test step with screenshot and log");
        Report.fail(TC_ID, "Fail test step with log");
        Report.failWithScreenshot(TC_ID);
        Report.failWithScreenshot(TC_ID, "Fail test step with screenshot and log");
    }
}

