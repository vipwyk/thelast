package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageObjects.PageObject;

public class Testne {
	WebDriver wd  =null;


//	
//	wd.get("http://localhost:8032/xinhu/?m=login");
//	wd.findElement(By.xpath("//input[@name='adminuser']")).sendKeys("admin");
//	wd.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
//	wd.findElement(By.xpath("//button[@class='webbtn']")).click();
	
	@BeforeClass
	public void startBrowser(){
		System.setProperty("webdriver.firefox.bin", "D:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 wd = new FirefoxDriver();
	}
	@Test(priority=35)
	public void test1() throws InterruptedException{ 
		System.out.println("打印第35个测试用例");
		PageObject xiang = new PageObject(wd);
		xiang.testLogin();
		Assert.assertTrue(wd.getPageSource().contains(""));
		
	}
}
