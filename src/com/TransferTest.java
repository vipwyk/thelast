package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class TransferTest extends BaseTest{
		
	@Test(priority=33)
	public void one() throws InterruptedException{
		System.out.println("打印第33个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("link=会议");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=startdt", "2017-12-01 17:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-01 18:00:00");
        webtest.click("xpath=//a[@id='btnchange_joinname']");
        webtest.click("xpath=//input[contains(@xname,'信呼开发团队')]");
        webtest.click("xpath=//input[@value='确定']");
        webtest.click("id=AltS");
		webtest.click("xpath=//span[@id='indexuserl']");
		webtest.click("xpath=//li[contains(.,'退出')]");
		webtest.click("xpath=//button[contains(.,'?确定')]");
		loginaction.loginByFront("磐石","123456");
		webtest.click("xpath=//a[contains(.,' 提醒信息2')]"); 
		assertTrue(webtest.getHtmlSource().contains("在会客室,主题:会议"));
        }
	@Test(priority=34)
	public void two() throws InterruptedException{
		System.out.println("打印34个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("id=menu_list_num42");
		webtest.click("link=会议");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//select[@name='hyname']","会客室");
		webtest.typeAndClear("xpath=//input[@name='title']", "会议");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("xpath=//input[@inputtype='datetime']", "2017-12-01 17:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-01 18:00:00");
        webtest.click("xpath=//a[@id='btnchange_joinname']");
        webtest.click("xpath=//input[contains(@xname,'信呼开发团队')]");
        webtest.click("xpath=//input[@value='确定']");
//        webtest.click("xpath=//u[contains(.,'＋添加文件')]");
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
        webtest.click("link=＋添加文件");
        webtest.enterFrame("winiframe");
        webtest.runJs("var setDate=document.getElementsByName(\'myform\')[0];setDate.removeAttribute('display:none')");
        webtest.type("name=inputfile", "D:\\admin\\a.txt");
        webtest.click("xpath=//button[contains(.,'开始上传')]");
        webtest.click("xpath=//button[contains(.,'确定')]");
		webtest.click("xpath=//input[@value='保存(S)']");
		webtest.click("xpath=//span[@id='indexuserl']");
		webtest.click("xpath=//li[contains(.,'退出')]");
		webtest.click("xpath=//button[contains(.,'?确定')]");
		loginaction.loginByFront("磐石","123456");
		webtest.click("xpath=//a[contains(.,'提醒信息2')]"); 
		assertTrue(webtest.getHtmlSource().contains("在会客室,主题:会议"));
        }
	}