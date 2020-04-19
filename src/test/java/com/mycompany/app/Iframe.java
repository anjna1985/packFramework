package com.mycompany.app;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Iframe extends BaseTest {
	
	public void frame () throws InterruptedException
	{
		
		driver.get("file:///D://iframe.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("w3c");
		System.out.println("********We are switch to the iframe*******");
 		driver.findElement(By.linkText("HERE")).click();
		//Clicks the iframe
   		System.out.println("*********We are done***************");
   		Thread.sleep(3000);
   		
   		System.out.println("Switch tab to 1st");
   		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();
		
		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		String firstwindow = iterate.next();
		String tabwindow = iterate.next();
		
		System.out.println("First Tab: "+firstwindow);
		System.out.println("Second Tab: "+tabwindow);
		
		//Switch the tab window
		
		driver.switchTo().window(tabwindow);
		driver.findElement(By.xpath("//a[contains(text(),'Paid Workshops')]")).click();
		Thread.sleep(3000l);
		
		driver.switchTo().window(firstwindow);
		driver.switchTo().frame("w3c");
		driver.findElement(By.id("dropdownButton")).click();
		driver.quit();
	}

	@Test
	public void frames()
	
	{
		Logger log = Logger.getLogger("devpinoyLogger");
		System.setProperty("webdriver.gecko.driver", "D:\\cc\\Software\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D://iframe.html"); 
	    driver.manage().window().maximize();
	    driver.switchTo().frame("w3c");
	    log.info("Login");
		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.id("dropdownButton")).click();
		//Clicks the iframe
   		System.out.println("*********We are done***************");	
	    driver.quit();
  }
	
	public void framess()
	{
	System.setProperty("webdriver.gecko.driver","D:\\cc\\Software\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///D://iframe.html"); 
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	for(int i=0; i<size; i++){
	driver.switchTo().frame(i);
	//int total=driver.findElements(By.xpath("html/body/a/img")).size();
	System.out.println("Frame: "+i);
	}
}
	
	public void login () {
	Logger log = Logger.getLogger("devpinoyLogger");
    driver.get("http://healthunify.com/bmicalculator/");
	log.debug("opening webiste");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	log.debug("entring weight");
	driver.findElement(By.name("wg")).sendKeys("87");
    log.debug("selecting kilograms");
    driver.findElement(By.name("opt1")).sendKeys("kilograms");
    log.debug("selecting height in feet");
    driver.findElement(By.name("opt2")).sendKeys("5");
    log.debug("selecting height in inchs");
    driver.findElement(By.name("opt3")).sendKeys("10");
    log.debug("Clicking on calculate");
    driver.findElement(By.name("cc")).click();

	 log.debug("Getting SIUnit value");
    String SIUnit = driver.findElement(By.name("si")).getAttribute("value");
    log.debug("Getting USUnit value");
    String USUnit = driver.findElement(By.name("us")).getAttribute("value");
    log.debug("Getting UKUnit value");
    String UKUnit = driver.findElement(By.name("uk")).getAttribute("value");
    log.debug("Getting overall description");
    String note = driver.findElement(By.name("desc")).getAttribute("value");
 
    System.out.println("SIUnit = " + SIUnit);
    System.out.println("USUnit = " + USUnit);
    System.out.println("UKUnit = " + UKUnit);
    System.out.println("note = " + note); 
	driver.quit();
}

}



