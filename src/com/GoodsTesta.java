package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

//webtest.click("xpath=//div[@id='notify_show_systodo']/div/")
public class GoodsTesta extends BaseTest{
		
		@Test(priority=36)
		public void one() throws InterruptedException{
			System.out.println("��ӡ36����������");
			LoginAction loginaction  = new LoginAction(webtest);
			loginaction.loginByFront("admin","123456");
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=��Ʒ����");
			webtest.enterFrame("openinputiframe");
			webtest.click("link=ѡ��");
			webtest.click("xpath=//input[contains(@xname,'���1')]");
			webtest.click("xpath=//input[@value='ȷ��']");
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
			assertTrue(webtest.getHtmlSource().contains("���1"));
	        }

		@Test(priority=37)
		public void two() throws InterruptedException{
			System.out.println("��ӡ37����������");
			webtest.refresh();
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=��Ʒ����");
			webtest.enterFrame("openinputiframe");
			webtest.click("link=ѡ��");
			webtest.click("xpath=//input[contains(@xname,'���1')]");
			webtest.click("xpath=//input[@value='ȷ��']");
			webtest.typeAndClear("name=count0_0", "");
	        webtest.click("id=AltS");
			assertTrue(webtest.getHtmlSource().contains("��1����������������Ϊ0"));
			}
		@Test(priority=38)
		public void three() throws InterruptedException{
			System.out.println("��ӡ��38����������");
			webtest.refresh();
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=��Ʒ����");
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("name=count0_0", "1");	
			webtest.click("id=AltS");
			assertTrue(webtest.getHtmlSource().contains("��1������Ʒ����Ϊ��"));
	        }
		@Test(priority=39)
		public void four() throws InterruptedException{	
			System.out.println("��ӡ39����������");
			webtest.refresh();
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("id=menu_list_num42");
			webtest.click("link=��Ʒ����");
			webtest.enterFrame("openinputiframe");
			webtest.click("link=ѡ��");
			webtest.click("xpath=//input[contains(@xname,'���1')]");
			webtest.click("xpath=//input[@value='ȷ��']");
			webtest.typeAndClear("name=count0_0", "1");
//	        webtest.click("link=+����");
//	        webtest.click("xpath=//a[@onclick=c.selectdata('getgoodsdata,aid',false,'temp_aid0_1','��Ʒ',1)]");
//			webtest.click("xpath=//input[contains(@xname,'������ʾ??')]");
//			webtest.click("xpath=//input[@value='ȷ��']");
//			webtest.typeAndClear("name=count0_0", "1");							
			webtest.click("id=AltS");
			webtest.refresh();
			webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
	        webtest.click("xpath=//a[@onclick='moemyapplylist()']");
	        webtest.click("xpath=//td[@cell='0']");
	        webtest.click("xpath=//button[@click='view']");
	        webtest.enterFrame("openinputiframe");
			assertTrue(webtest.getHtmlSource().contains("��Ʒ����"));
	        }
}
