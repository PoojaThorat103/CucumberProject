package com.demo.action;


import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class BaseClass {

	  public static WebDriver driver = null;
	  
	    public void invokeBrowser(){
	    	 String projPath = System.getProperty("user.dir");
			//System.out.println(projPath+"\\src\\main\\resources\\driver\\chromedriver.exe");
			
			String browserName = "chrome";
	        switch (browserName){
	            case "chrome" :
	                System.out.println(browserName);
	                System.setProperty("webdriver.chrome.driver", projPath+"/drivers/chromedriver.exe");
	                driver = new ChromeDriver();
	                break;
	            case "firefox" :
	            	 System.out.println(browserName);
	                break;
	                default:
	                    System.setProperty("webdriver.chrome.driver", projPath+"\\src\\main\\resources\\driver\\chromedriver.exe");
	                    driver = new ChromeDriver();
	                    break;
	        }
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/login");

	    }
	  
	    public void closeBrowser(){
	        driver.quit();
	    }
	}

	

