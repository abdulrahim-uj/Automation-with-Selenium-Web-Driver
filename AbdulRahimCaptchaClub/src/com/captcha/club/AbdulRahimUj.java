/**
 * 
 */
package com.captcha.club;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

/**
 * @author ark
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opera.core.systems.OperaLogs.DriverLogsHandler;
import com.thoughtworks.selenium.Wait;

import net.sourceforge.htmlunit.corejs.javascript.ast.IfStatement;


public class AbdulRahimUj {
	
	public static void main(String[] args) throws InterruptedException {
		//Declaration and Installation of Objects / Variables;
		
		System.setProperty("webdriver.chrome.driver", "/home/ark/Downloads/chromedriverwww/chromedriver");
		/* WebDriver driver = new FirefoxDriver(); */
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.easytypingjob.com/login";
		String expectedTitle = "Login - Legitimate Typing Job Online Data Entry Work From Home";
		String actualTitle = "";
		String expectedSucces = "";
		String fakeUrl = "https://www.easytypingjob.com/home/captcha";
		String ss;
		
		//Launch Firefox and direct to the Base URL;
		driver.get(baseUrl);
		
		//Get the actual value of the Title;
		actualTitle = driver.getTitle();
		
		/*
		 * //Compare the actual title of the page with the expected one and print the
		 * reslt as passed or failedl if (actualTitle.contentEquals(expectedTitle)) {
		 * System.out.println("Test Passed"); } else {
		 * System.out.println("Test Failed!"); }
		 * 
		 * //Close Firefox; driver.close();
		 * 
		 * //Exit the program explicitly; System.exit(0);
		 */
		//Maximize the browser;
		//driver.manage().window().maximize();
		
		//
		driver.findElement(By.xpath(".//input[@placeholder='Username']")).sendKeys("abdulrahimuj");
		driver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys("Teacher)32");
		driver.findElement(By.xpath(".//button[@class='btn btn-own btn-lg btn-block']")).submit();
		
		//After Login
		driver.findElement(By.xpath(".//a[contains(text(),'Earn Money')]")).click();
		
		ss = driver.findElement(By.xpath("//input[@id='txtCaptcha']")).getAttribute("value");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#######$$$$$$$$$$$$##" + ss);
		driver.findElement(By.xpath("//input[@id='CaptchaInput']")).sendKeys(ss);
		//int j=5;
		driver.findElement(By.xpath(".//*[@id=\"content\"]/div/div/div/div[2]/div/div/form/div[2]/input")).submit();
		
		
		
		//driver.wait(500);
		driver.findElement(By.xpath(".//span[contains(text(),'Earn Money')]")).click();
		for (int i = 0; i <= 25000; i++) {
			ss = "";
			System.out.println("444444444444444444444444444444444444444444444444444");
			ss = driver.findElement(By.xpath("//input[@id='txtCaptcha']")).getAttribute("value");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$!!!!!!!$$$$$$$$$$$$$$!!" + ss);
			driver.findElement(By.xpath("//input[@id='CaptchaInput']")).sendKeys(ss);
			driver.findElement(By.xpath(".//*[@id=\"content\"]/div/div/div/div[2]/div/div/form/div[2]/input")).submit();
			System.out.println("11111111111111111111111111111111111111111111111111111");
			//driver.wait(500);
			driver.findElement(By.xpath(".//span[contains(text(),'Earn Money')]")).click();
			System.out.println("dfkjhbsdjkgbsd,gjkbsgkjbsgk.jsbglkjb");
		}
	}

}
