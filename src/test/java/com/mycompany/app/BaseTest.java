package com.mycompany.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Unit test for simple App.
 */
public class BaseTest 
{
    public WebDriver driver;
    
    
   @BeforeSuite
    public void initBrowser() throws IOException
    {
       //Browser initialization code
	   System.out.println("I m before suite");
	   
	   System.out.println("I m before suite");
	   
	   System.out.println("I m before suite");
	  
	  FileInputStream fl = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties"); 
	 
	  Properties  p = new Properties();
	  p.load(fl);
  
	  
	  String browsername = p.getProperty("browser");

	 // String browsername=System.getProperty("browser"); //mvn test -dbrowser=chrome, When we are running for Mevan using cmd using browser parameter
	  String url = p.getProperty("url");
	  
	  if (browsername.equalsIgnoreCase("chrome"))
	  {
		  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");	
	  driver = new ChromeDriver();
	  //driver.get(url);
	  }
	  else if(browsername.equalsIgnoreCase("IE"))
	  {
		InternetExplorerOptions option=new InternetExplorerOptions();
	//	option.
	  System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
      driver.get(url);
      
		  
	  } else if (browsername.equalsIgnoreCase("FF")) {
		  
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get(url);
	  
	  }
	  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    }
   
   @AfterSuite
   public void tearDown()
   {
      //Browser initialization code
	   System.out.println("I m after suite...Closing all browser");
	   driver.close();
	   
	  // System.setProperty("webdriver.chrome.driver","C:\\SeleniumMaster\\gar\\chromedriver.exe");	
	 //  -
   }
   
}
