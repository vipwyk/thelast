package com.testCases;
//测试图片上传
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class UploadTest extends BaseTest{
	@Test(priority=11)
	public void open() throws InterruptedException{
		System.out.println("打印第11个测试用例");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "一个正确的标题");
		webtest.type("xpath=//input[@type='file']","C:\\Users\\lenovo\\Pictures\\Camera Roll\\chapter2.doc");
		Thread.sleep(1000);
		 assertTrue(webtest.getHtmlSource().contains("禁止文件类型,请选择jpg,gif,png,bmp,jpeg"));
		 Thread.sleep(2000);
	}
	@Test(priority=12)
	public void one() throws InterruptedException{
		System.out.println("打印第12个测试用例");
		webtest.typeAndClear("xpath=//input[@type='file']", "C:\\Users\\lenovo\\Pictures\\Camera Roll\\a.txt");
		Thread.sleep(1000);
		 assertTrue(webtest.getHtmlSource().contains("禁止文件类型,请选择jpg,gif,png,bmp,jpeg"));
		 Thread.sleep(2000);
	}
	@Test(priority=13)
	public void two() throws InterruptedException{
		System.out.println("打印第13个测试用例");
		webtest.typeAndClear("xpath=//input[@type='file']", "C:\\Users\\lenovo\\Pictures\\Camera Roll\\IMG_2718.CR2");
		Thread.sleep(1000);
		 assertTrue(webtest.getHtmlSource().contains("禁止文件类型,请选择jpg,gif,png,bmp,jpeg"));
		 Thread.sleep(2000);
	}
	@Test(priority=14)
	public void three() throws InterruptedException{
		System.out.println("打印第14个测试用例");
		webtest.typeAndClear("xpath=//input[@type='file']", "C:\\Users\\lenovo\\Pictures\\Camera Roll\\WIN_20171022_20_49_00_Pro.jpg");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//input[@name='title']", "yi个正确的标题");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='通知公告']");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
		webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
		webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-23");

		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("yi个正确的标题"));
	}
}
