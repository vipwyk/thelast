package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
//测试日期
public class DateTest  extends BaseTest{
	@Test(priority=21)
	public void open() throws InterruptedException{
		System.out.println("打印第21个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='通知公告']");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-27");        
		webtest.click("xpath=//input[@value='保存(S)']");
		assertTrue(webtest.getHtmlSource().contains("日期不能早于当前日期"));
	}
	@Test(priority=22)
	public void one() throws InterruptedException{
		System.out.println("打印第22个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题a");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='通知公告']");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-28");        
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("一个正确的标题a[2017-11-28]"));
	}
}
