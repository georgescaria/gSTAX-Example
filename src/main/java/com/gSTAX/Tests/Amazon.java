package com.gSTAX.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.gSTAX.Setup.InitialSetup;
import com.gSTAX.TestData.Excel_Data;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon extends InitialSetup 
{

	@Test       
    public  void AmazonTest() throws Exception
    {
        driver.get("https://amazon.in");
        String title = driver.getTitle();
        Report.log(Status.PASS,title);
    }
}

