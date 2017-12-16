package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class ProcessTest extends BaseTest{
	
@Test(priority=41)
public void one() throws InterruptedException{
	System.out.println("打印第41个测试用例");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
	webtest.click("xpath=//span[contains(.,'流程')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=物品采购");
	webtest.enterFrame("openinputiframe");
	webtest.click("xpath=//a[contains(.,'选择')]");
	webtest.click("xpath=//input[contains(@xname,'鼠标1')]");
	webtest.click("xpath=//input[@value='确定']");
	webtest.typeAndClear("name=count0_0", "1");
    webtest.click("xpath=//input[@id='AltS']");
    webtest.refresh();
    webtest.click("xpath=//div[@id='notify_show_systodo']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//div[@id='notify_show_reimto']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    //webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//a[@onclick='moemyapplylist()']");
    webtest.click("xpath=//td[@cell='0']");
    webtest.click("xpath=//button[@click='view']");
    webtest.enterFrame("openinputiframe");
    Thread.sleep(1000);
	assertTrue(webtest.getHtmlSource().contains("鼠标1"));
  }
@Test(priority=42)
public void two() throws InterruptedException{
	System.out.println("打印第42个测试用例");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'流程')]");
	webtest.click("id=menu_list_num42"); 
	webtest.click("link=图书借阅");
	webtest.enterFrame("openinputiframe");
	webtest.click("link=选择");
	webtest.click("xpath=//input[@xname='PHP从入门到精通']");
	webtest.click("xpath=//input[contains(@value,'确定')]");
	webtest.runJs("var setDate=document.getElementsByName(\'jydt\')[0];setDate.removeAttribute('readonly')");
    webtest.typeAndClear("name=jydt", "2017-12-01");
    Thread.sleep(5000);
    webtest.runJs("var setDate=document.getElementsByName(\'yjdt\')[0];setDate.removeAttribute('readonly')");
    webtest.typeAndClear("name=yjdt", "2017-12-01");
	webtest.click("id=AltS");
    webtest.refresh();
    webtest.click("xpath=//div[@id='notify_show_systodo']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//div[@id='notify_show_reimto']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    //webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//a[@onclick='moemyapplylist()']");
    webtest.click("xpath=//td[@cell='0']");
    webtest.click("xpath=//button[@click='view']");
    
	assertTrue(webtest.getHtmlSource().contains("图书借阅"));
}
@Test(priority=43)
public void three() throws InterruptedException{
	System.out.println("打印例43个测试用例");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'流程')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=印章");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=name", "一枚印章");
	webtest.selectByIndex("name=type", 1);
	webtest.click("link=选择");
	webtest.click("xpath=//td[contains(.,'?管理层')]");
	webtest.click("xpath=//input[@xname='磐石']");
	webtest.click("xpath=//input[@value='确定']");
	webtest.click("id=AltS");
	webtest.leaveFrame();
	assertTrue(webtest.getHtmlSource().contains("新增保存成功"));
	}
@Test(priority=44)
public void four() throws InterruptedException{
	System.out.println("打印例44个测试用例");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'流程')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=印章申请");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=explain", "印章");
	webtest.selectByIndex("name=sealid", 1);
	webtest.click("id=AltS");
	webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
    webtest.click("link=＋添加文例");
    webtest.typeAndClear("xpath=//button[@id='addbtn']", "D:\\admin\\a.txt");
    webtest.click("xpath=//button[contains(.,'开始上传')]");
    webtest.click("xpath=//button[contains(.,'确定')]");
	webtest.click("xpath=//input[@value='保存(S)']");
	webtest.leaveFrame();
	assertTrue(webtest.getHtmlSource().contains("新增保存成功"));
}
}