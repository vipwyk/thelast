package com.testCases;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

//会议时间测试
public class TimeTest  extends BaseTest{
//	@FindBy(xpath = "//h2[contains(.,'Folder影片管理')]")
//	public WebElement managemovies;
	
	@Test(priority=30)
	public void one() throws InterruptedException{
		System.out.println("打印30个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@id='menu_list_num42']");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//input[@name='startdt']");
		webtest.click("xpath=//td[contains(.,'30')]");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//input[contains(@max,'59')]");
		webtest.click("xpath=//font[contains(.,'30')]");
		webtest.click("xpath=//a[contains(.,'确定')]");
		webtest.click("xpath=//input[@name='enddt']");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//a[contains(.,'确定')]");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
		webtest.click("xpath=//input[@value='保存(S)']");

		assertTrue(webtest.getHtmlSource().contains("截止时间必须大于开始时间"));
	}
	@Test(priority=31)
	public void two() throws InterruptedException{
		System.out.println("打印31个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@id='menu_list_num42']");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
//		webtest.click("xpath=//input[@name='startdt']");
//		webtest.click("xpath=//td[contains(.,'30')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'16')]");
//		webtest.click("xpath=//input[contains(@max,'59')]");
//		webtest.click("xpath=//font[contains(.,'30')]");
//		webtest.click("xpath=//a[contains(.,'确定')]");
//		webtest.click("xpath=//input[@name='enddt']");
//		webtest.click("xpath=//td[@title='下个??']");
//		webtest.click("xpath=//td[contains(.,'1')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'00')]");
//		webtest.click("xpath=//input[contains(@max,'59')]");
//		webtest.click("xpath=//font[contains(.,'30')]");
//		webtest.click("xpath=//a[contains(.,'确定')]");
//		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=startdt", "2017-12-07 18:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-08 17:00:00");
        webtest.click("xpath=//input[@value='保存(S)']");
		assertTrue(webtest.getHtmlSource().contains("不允许跨天申请"));
	}
	@Test(priority=32)
	public void three() throws InterruptedException{
		System.out.println("打印32个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@id='menu_list_num42']");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
//		webtest.click("xpath=//input[@name='startdt']");
//		webtest.click("xpath=//td[contains(.,'23')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'16')]");
//		webtest.click("xpath=//input[contains(@max,'59')]");
//		webtest.click("xpath=//font[contains(.,'30')]");
//		webtest.click("xpath=//a[contains(.,'确定')]");
//		webtest.click("xpath=//input[@name='enddt']");
//		webtest.click("xpath=//td[contains(.,'23')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'17')]");
//		webtest.click("xpath=//a[contains(.,'确定')]");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("xpath=//input[@inputtype='datetime']", "2017-12-07 18:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-07 17:00:00");
        webtest.click("xpath=//input[@value='保存(S)']");
        Thread.sleep(1000);
		assertTrue(webtest.getHtmlSource().contains("开始时间必须大于当前时间"));
	}
}