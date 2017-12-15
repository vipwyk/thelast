package com.testCases;
//测试
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
//测试类型名称
public class TypeTest extends BaseTest{
	@Test(priority=6)
	public void open() throws InterruptedException{
	System.out.println("打印第6个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");        
		webtest.click("xpath=//input[@value='保存(S)']");
		 assertTrue(webtest.getHtmlSource().contains("类型名称不能为空"));
	}
	@Test(priority=7)
	public void two() throws InterruptedException{
		System.out.println("打印第7个测试用例");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='通知公告']");
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("一个正确的标题"));
	}
	@Test(priority=8)
	public void three() throws InterruptedException{
		System.out.println("打印第8个测试用例");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='规则制度']");
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("规则制度"));
	}
	@Test(priority=9)
	public void four() throws InterruptedException{
		System.out.println("打印第9个测试用例");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='知识信息']");
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("知识信息"));
	}
	@Test(priority=10)
	public void five() throws InterruptedException{
		System.out.println("打印第10个测试用例");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='奖惩']");
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("奖惩"));
	}
}
