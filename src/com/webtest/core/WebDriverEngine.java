package com.webtest.core;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.util.Log;

public class WebDriverEngine {

	WebDriver driver = null;
	ElementFinder finder = null;
	
	public String[] getAllWindowTitles() {
		// TODO Auto-generated method stub
	    String current = driver.getWindowHandle();

	    List<String> attributes = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	      driver.switchTo().window(handle);
	      attributes.add(driver.getTitle());
	    }

	    driver.switchTo().window(current);

	    return attributes.toArray(new String[attributes.size()]);
	}

	public WebDriverEngine(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		finder = new ElementFinder(driver);
	}

	public void enterFrame(String frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}

	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("Left the iframe");
	}

	public void open(String url) {

		try {
			driver.get(url);
			pause(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		Log.info("Opened url " + url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	private void pause(int time) {
		if (time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isTextPresent(String pattern) {

		String text = driver.getPageSource();
		text = text.trim();
		if (text.contains(pattern)) {
			return true;
		}
		return false;
	}

	public void typeAndClear(String locator, String value) {
		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.clear();
			element.sendKeys(value);

		}
	}

	public void type(String locator, String value) {
		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.sendKeys(value);
		}
	}

	public boolean isChecked(String locator) {
		WebElement element = finder.findElement(locator);
		return element.isSelected();
	}

	public void click(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.click();
			this.pause(1800);
		}
	}
	
	public void clickNoWait(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.click();
			
		}
	}

	public void clickLonger(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			runJs("window.scrollTo(0," + element.getLocation().x + ")");
			element.click();
			this.pause(3000);
		}
	}

	public void doubleClick(String locator) throws InterruptedException {
		WebElement element = finder.findElement(locator);
		Actions builder = new Actions(driver);
		builder.doubleClick(element).build().perform();
	}

	public void isDisplayed(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
	}

	public String getText(String locator) {

		return finder.findElement(locator).getText().trim();
	}

	public boolean isElementPresent(String locator) {

		WebElement element = null;
		try {
			element = finder.findElement(locator);
		} catch (Exception e) {

			Log.info(e.getMessage());
		}
		if (element != null) {
			return true;
		}
		{
			return false;
		}
	}

	public String getValue(String locator) {

		return finder.findElement(locator).getAttribute("value");
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void goForward() {

		driver.navigate().forward();
	}
	public void refresh() {

		driver.navigate().refresh();
		pause(3000);
	}
	public Alert getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public Select getSelect(String locator) {
		Select inputSelect = new Select(finder.findElement(locator));
		this.pause(5000);
		return inputSelect;
				
	}

	public void selectByValue(String locator, String value) {
		getSelect(locator).selectByValue(value);
		this.pause(5000);
	}

	public void selectByVisibleText(String locator, String value) {
		getSelect(locator).selectByVisibleText(value);
	}

	public void selectByIndex(String locator, int index) {
		getSelect(locator).selectByIndex(index);
	}

	public String getAlertTest() {

		return getAlert().getText();
	}

	public void alertAccept() {

		getAlert().accept();
	}

	public String getHtmlSource() {

		return driver.getPageSource();
	}

	public void runJs(String js) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(js);
	}

	public void keyDown() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER);
	}
	//鼠标悬浮
	public void mouseoverElement(String locator) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(finder.findElement(locator)).perform();
	}
	//选择窗口
	public void switchWidow(int i){
	    List<String> windows = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	    
	    	windows.add(handle);
	    }
	    driver.switchTo().window(windows.get(i));
	}
	//右键
	public void rightClickMouse(String locator) throws InterruptedException {
		Actions action = new Actions(driver);
		action.contextClick(finder.findElement(locator)).perform();
		}
	public void getWindow(int i){
		List<String> windows = new ArrayList<String>();
		for (String handle : driver.getWindowHandles())
		{
			//System.out.println(handle);  //进入到第二个页面
			windows.add(handle);
		}
		driver.switchTo().window(windows.get(i));
	}

	public void Shot(){
		
	}
//	public List  getElements(By by){
//		driver.findElements(by)
//	}
}
