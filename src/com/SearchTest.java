package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
//测试搜索
public class SearchTest extends BaseTest{
	@Test(priority=15)
	public void open() throws InterruptedException{
	System.out.println("打印第15个测试用例");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=.//*[@id='btnchange_recename']");
		webtest.typeAndClear("xpath=//input[@placeholder='部门/姓名/职位']","admin");
		webtest.click("xpath=//input[@value='查找']");
		assertTrue(webtest.getHtmlSource().contains("无相关[admin]的记录"));
		
	}
	@Test(priority=16)
	public void one() throws InterruptedException{
		System.out.println("打印第16个测试用例");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='部门/姓名/职位']","经理");
	webtest.click("xpath=//input[@value='查找']");
	assertTrue(webtest.getHtmlSource().contains("无相关[经理]的记录"));
	}
	@Test(priority=17)
	public void two() throws InterruptedException{
		System.out.println("打印第17个测试用例");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='部门/姓名/职位']","@");
	webtest.click("xpath=//input[@value='查找']");
	assertTrue(webtest.getHtmlSource().contains("无相关[@]的记录"));
	}
	@Test(priority=18)
	public void three() throws InterruptedException{
		System.out.println("打印第18个测试用例");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='部门/姓名/职位']","x");
	webtest.click("xpath=//input[@value='查找']");
	assertTrue(webtest.getHtmlSource().contains("小乔"));
	}
	@Test(priority=19)
	public void four() throws InterruptedException{
		System.out.println("打印第19个测试用例");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='部门/姓名/职位']","xinhu");
	webtest.click("xpath=//input[@value='查找']");
	assertTrue(webtest.getHtmlSource().contains("信呼客服"));
	}
	@Test(priority=20)
	public void five() throws InterruptedException{
		System.out.println("打印第20个测试用例");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='部门/姓名/职位']","磐石");
	webtest.click("xpath=//input[@value='查找']");
	assertTrue(webtest.getHtmlSource().contains("磐石"));
	}
	
}