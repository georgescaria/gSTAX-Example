package com.gSTAX.Tests;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.gSTAX.Setup.InitialSetup;
import com.gSTAX.TestData.ExcelData;
import com.gSTAX.Utilities.Report;

public class Amazon extends InitialSetup 
{

	@Test       
    public  void AmazonTest() throws Exception
    {
        driver.get("https://amazon.in");
        String title = driver.getTitle();
        test.log(Status.PASS,title);
        Report.takeScreenshot();
    }
}

