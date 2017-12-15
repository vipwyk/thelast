package com.testCases;
//测试标题
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
public class TitleTest extends BaseTest {
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("打印第1个测试用例"); 
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
//		driver.findElement(By.linkText("通知公告")).click();
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
//		driver.switchTo().frame("openinputiframe");
//		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("");
		webtest.typeAndClear("xpath=//input[@name='title']", "");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='通知公告']");
//		webtest.clear("xpath=//input[contains(@name,'zuozhe')]");
//		driver.findElement(By.xpath("//input[contains(@name,'zuozhe')]")).sendKeys("部");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
//		JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
//		removeAttribute.executeScript("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
//  		WebElement setDatElement=driver.findElement(By.xpath("//input[@inputtype='date']"));
//        setDatElement.clear();
//       setDatElement.sendKeys("2017-11-22");
       
       webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");
        
		webtest.click("xpath=//input[@value='保存(S)']");
//		String b = "标题不能为空";
//		 assertTrue(a.getText().equals("标题不能为空"));
		 assertTrue(webtest.getHtmlSource().contains("标题不能为空"));
		}
		@Test(priority=2)
		public void two() throws InterruptedException{
			System.out.println("打印第2个测试用例");
			webtest.typeAndClear("xpath=//input[@name='title']", "123");
			Thread.sleep(3000);
			webtest.click("xpath=//input[@value='保存(S)']");
			assertTrue(webtest.getHtmlSource().contains("标题不能是数字"));
		}
		@Test(priority=3)
		public void three(){
			System.out.println("打印第3个测试用例");
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
//			driver.findElement(By.linkText("通知公告")).click();
			webtest.click("link=通知公告");
			 
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("xpath=//input[@name='title']", "@.@");
			webtest.click("xpath=//select[@class='inputs']");
			webtest.click("xpath=//option[@value='通知公告']");
			webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
	        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
	        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");
	        
			webtest.click("xpath=//input[@value='保存(S)']");
			assertTrue(webtest.getHtmlSource().contains("标题含有特殊字符"));
		}
		@Test(priority=4)
		public void four(){
			System.out.println("打印第4个测试用例");
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
			webtest.click("link=通知公告");			 
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("xpath=//input[@name='title']", "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈啊");
			webtest.click("xpath=//select[@class='inputs']");
			webtest.click("xpath=//option[@value='通知公告']");
			webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
	        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
	       webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");	        
			webtest.click("xpath=//input[@value='保存(S)']");
			assertTrue(webtest.getHtmlSource().contains("标题字数不能超过20"));
		}
		@Test(priority=5)
		public void five(){
			System.out.println("打印第5个测试用例");
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
			webtest.click("link=通知公告");	 
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("xpath=//input[@name='title']", "哈哈  哈哈 哈哈哈");
			webtest.click("xpath=//select[@class='inputs']");
			webtest.click("xpath=//option[@value='通知公告']");
			webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
	        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
	       webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");	        
			webtest.click("xpath=//input[@value='保存(S)']");
			assertTrue(webtest.getHtmlSource().contains("标题中不能出现空格"));
		}
		
}