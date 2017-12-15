package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

//webtest.click("xpath=//div[@id='notify_show_systodo']/div/")
public class GoodsTesta extends BaseTest{
		
		@Test(priority=36)
		public void one() throws InterruptedException{
			System.out.println("打印36个测试用例");
			LoginAction loginaction  = new LoginAction(webtest);
			loginaction.loginByFront("admin","123456");
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=物品领用");
			webtest.enterFrame("openinputiframe");
			webtest.click("link=选择");
			webtest.click("xpath=//input[contains(@xname,'鼠标1')]");
			webtest.click("xpath=//input[@value='确定']");
			webtest.typeAndClear("name=count0_0", "1");
	        webtest.click("id=AltS");
	        webtest.refresh();
	        webtest.click("xpath=//div[@id='notify_show_systodo']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        webtest.click("xpath=//div[@id='notify_show_reimto']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        //webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        webtest.click("xpath=//a[@onclick='moemyapplylist()']");
	        webtest.click("xpath=//td[@cell='0']");
	        webtest.click("xpath=//button[@click='view']");
	        webtest.enterFrame("openinputiframe");
			assertTrue(webtest.getHtmlSource().contains("鼠标1"));
	        }

		@Test(priority=37)
		public void two() throws InterruptedException{
			System.out.println("打印37个测试用例");
			webtest.refresh();
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=物品领用");
			webtest.enterFrame("openinputiframe");
			webtest.click("link=选择");
			webtest.click("xpath=//input[contains(@xname,'鼠标1')]");
			webtest.click("xpath=//input[@value='确定']");
			webtest.typeAndClear("name=count0_0", "");
	        webtest.click("id=AltS");
			assertTrue(webtest.getHtmlSource().contains("第1行上领用数量不能为0"));
			}
		@Test(priority=38)
		public void three() throws InterruptedException{
			System.out.println("打印第38个测试用例");
			webtest.refresh();
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=物品领用");
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("name=count0_0", "1");	
			webtest.click("id=AltS");
			assertTrue(webtest.getHtmlSource().contains("第1行上物品不能为空"));
	        }
		@Test(priority=39)
		public void four() throws InterruptedException{	
			System.out.println("打印39个测试用例");
			webtest.refresh();
			webtest.click("xpath=//span[contains(.,'流程')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=物品领用");
			webtest.enterFrame("openinputiframe");
			webtest.click("link=选择");
			webtest.click("xpath=//input[contains(@xname,'鼠标1')]");
			webtest.click("xpath=//input[@value='确定']");
			webtest.typeAndClear("name=count0_0", "1");
//	        webtest.click("link=+新增");
//	        webtest.click("xpath=//a[@onclick=c.selectdata('getgoodsdata,aid',false,'temp_aid0_1','物品',1)]");
//			webtest.click("xpath=//input[contains(@xname,'联想显示??')]");
//			webtest.click("xpath=//input[@value='确定']");
//			webtest.typeAndClear("name=count0_0", "1");							
			webtest.click("id=AltS");
			webtest.refresh();
			webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        webtest.click("xpath=//a[@onclick='moemyapplylist()']");
	        webtest.click("xpath=//td[@cell='0']");
	        webtest.click("xpath=//button[@click='view']");
	        webtest.enterFrame("openinputiframe");
			assertTrue(webtest.getHtmlSource().contains("物品领用"));
	        }
}
