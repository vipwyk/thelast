package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

//会议纪要人择测试
public class ChoiceTest extends BaseTest{
	@Test(priority=25)
	public void one() throws InterruptedException{
		System.out.println("打印第25个测试用例子");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,'管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("会议室不能为空"));

		
}
	@Test(priority=26)
	public void two() throws InterruptedException{
		System.out.println("打印26个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队?']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,'管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("主题不能为空"));

	}
	@Test(priority=27)
	public void three() throws InterruptedException{
		System.out.println("打印27个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议室");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,'管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("开始时间不能为空"));

	}
	@Test(priority=28)
	public void four() throws InterruptedException{
		System.out.println("打印28个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议室");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,'管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("xpath=//input[@inputtype='datetime']", "2017-12-07 18:00:00");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("结束时间不能为空"));

	}
	@Test(priority=29)
	public void five() throws InterruptedException{
		System.out.println("打印29个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议室");	
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='信呼开发团队']");
		webtest.click("xpath=//input[contains(@value,'确定')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,'管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=startdt", "2017-12-07 18:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-08 17:00:00");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("参会人不能为为空"));
	}
	}
