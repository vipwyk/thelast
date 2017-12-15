package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class PathTesta extends BaseTest {
	@Test(priority=45)
	public void one() throws InterruptedException{
		System.out.println("打印45个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'资源')]");
		webtest.click("id=menu_list_num124");
		webtest.click("xpath=//button[contains(.,' 上传文件')]");
		webtest.enterFrame("winiframe");
		webtest.runJs("var setDate=document.getElementsByName(\'myform\')[0];setDate.removeAttribute('display:none')");
	    webtest.type("name=inputfile", "D:\\admin\\a.txt");
	    webtest.click("xpath=//button[contains(.,'开始上传')]");
	    webtest.click("xpath=//button[contains(.,'确定')]");
		webtest.clickNoWait("xpath=//input[@value='保存(S)']");
		webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("保存成功"));
	    }

	@Test(priority=46)
	public void two() throws InterruptedException{
		System.out.println("打印46个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'资源')]");
		webtest.click("id=menu_list_num134");
		webtest.click("xpath=//button[contains(.,' 新增')]");
		webtest.enterFrame("openinputiframe");
	    webtest.type("xpath=//input[@name='title']", "hh");
	    webtest.type("xpath=//input[@name='sort']]", "2");
	    webtest.click("xpath=//select[@class='inputs']");
	   	webtest.click("xpath=//option[contains(.,'工作指南')]");
	   	webtest.click("xpath=//input[@value='保存(S)']");
	   	webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("保存成功"));
		}
	@Test(priority=47)
	public void three()throws InterruptedException{
		System.out.println("打印47个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'任务')]");
		webtest.click("id=menu_list_num65");
		webtest.click("xpath=//button[contains(.,' 新增')]");
		webtest.enterFrame("openinputiframe");
		webtest.selectByIndex("name=type",2);
		Thread.sleep(3000);
		webtest.selectByIndex("name=grade",2);
		 webtest.type("xpath=//input[@name='title']", "hh");
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("新增保存成功"));
	}
	@Test(priority=48)
	public void four()throws InterruptedException{
	System.out.println("打印48个测试用例");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'任务')]");
	webtest.click("id=menu_list_num79");
	webtest.click("id=menu_list_num69");
	webtest.click("xpath=//button[contains(.,' 新增')]");
	webtest.enterFrame("openinputiframe");
	webtest.selectByIndex("name=type",1);
	webtest.click("link=选择");
	webtest.click("xpath=//td[contains(.,'管理层')]");
	webtest.click("xpath=//input[@xname='磐石']");
	webtest.click("xpath=//input[@value='确定']");
	webtest.click("xpath=//a[@id='btnchange_runuser']");
	webtest.click("xpath=//td[contains(.,'开发部')]");
	webtest.click("xpath=//input[@value='确定']");
	 webtest.type("xpath=//input[@name='title']", "hh");
	webtest.click("xpath=//input[@value='保存(S)']");
	webtest.leaveFrame();
	assertTrue(webtest.getHtmlSource().contains("保存成功"));
	}
	@Test(priority=49)
	public void five()throws InterruptedException{
	System.out.println("打印49个测试用例");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'资源')]");
	webtest.click("id=menu_list_num124");
	webtest.click("title=新增");
	webtest.type("name=name","hhh");
	webtest.typeAndClear("name=sort","1");
	webtest.doubleClick("xpath=//div[contains(.,'确定')]");
	assertTrue(webtest.getHtmlSource().contains("保存成功"));
	}
}
