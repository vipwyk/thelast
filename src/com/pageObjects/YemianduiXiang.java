package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class YemianduiXiang {
//	wd.findElement(By.xpath("//input[@name='adminuser']")).sendKeys("admin");
//	wd.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
//	wd.findElement(By.xpath("//button[@class='webbtn']")).click();
	@FindBy(xpath="//input[@name='adminuser']")
	public WebElement admin;
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	@FindBy(xpath="//button[@class='webbtn']")
	public WebElement webbtn;
	@FindBy(xpath="//span[@pmenuid='40']")
	public WebElement one;
	//this.managemovies.click();
	@FindBy(xpath="//div[@id='menu_list_num42']")
	public WebElement two;
	@FindBy(xpath="//a[contains(.,'会议')]")
	public WebElement three;
	@FindBy(xpath="//input[@name='title']")
	public WebElement four;
	@FindBy(xpath="//select[@name='hyname']")
	public WebElement five;
	@FindBy(xpath="//input[@name='startdt']")
	public WebElement start;
	@FindBy(xpath="//td[contains(.,'30')]")
	public WebElement date;
	@FindBy(xpath="//input[@max='23']")
	public WebElement maxhour;
	@FindBy(xpath="//font[contains(.,'16')]")
	public WebElement shi;
	@FindBy(xpath="//input[contains(@max,'59')]")
	public WebElement maxmin;
	@FindBy(xpath="//font[contains(.,'30')]")
	public WebElement fen;
	@FindBy(xpath="xpath=xpath=//input[@name='enddt']")
	public WebElement end;
	@FindBy(xpath="//a[contains(.,'确定')]")
	public WebElement queding;
	@FindBy(xpath="//input[@xname='信呼开发团队']")
	public WebElement renyuan;
	@FindBy(xpath="//a[contains(@id,'joinname')]")
	public WebElement joinname;
	@FindBy(xpath="//input[contains(@value,'确定')]")
	public WebElement value;
	@FindBy(xpath="//input[@value='保存(S)']")
	public WebElement baocun;
	private WebDriver _driver;
public YemianduiXiang(WebDriver driver){
	this._driver = driver;
	PageFactory.initElements(driver, this);
}
	
public void testLogin() throws InterruptedException{

	this._driver.get("http://localhost:8032/xinhu/?m=login");
	this.admin.sendKeys("admin");
	this.password.sendKeys("123456");
	this.webbtn.click();
	Thread.sleep(1000);
	this.one.click();
	this.two.click();
	this.three.click();
	_driver.switchTo().frame("openinputiframe");
	this.four.sendKeys("会议啊");
	this.five.sendKeys("会客室");
	this.start.click();
	this.date.click();
	this.maxhour.click();
	this.shi.click();
	this.maxmin.click();
	this.fen.click();
	this.queding.click();
	this.end.click();
	this.maxhour.click();
	this.shi.click();
	this.queding.click();
	this.joinname.click();
	this.renyuan.click();
	this.value.click();	
	this.baocun.click();
}
	
}
