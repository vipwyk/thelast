package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class PathTesta extends BaseTest {
	@Test(priority=45)
	public void one() throws InterruptedException{
		System.out.println("��ӡ45����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'��Դ')]");
		webtest.click("id=menu_list_num124");
		webtest.click("xpath=//button[contains(.,' �ϴ��ļ�')]");
		webtest.enterFrame("winiframe");
		webtest.runJs("var setDate=document.getElementsByName(\'myform\')[0];setDate.removeAttribute('display:none')");
	    webtest.type("name=inputfile", "D:\\admin\\a.txt");
	    webtest.click("xpath=//button[contains(.,'��ʼ�ϴ�')]");
	    webtest.click("xpath=//button[contains(.,'ȷ��')]");
		webtest.clickNoWait("xpath=//input[@value='����(S)']");
		webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("����ɹ�"));
	    }

	@Test(priority=46)
	public void two() throws InterruptedException{
		System.out.println("��ӡ46����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'��Դ')]");
		webtest.click("id=menu_list_num134");
		webtest.click("xpath=//button[contains(.,' ����')]");
		webtest.enterFrame("openinputiframe");
	    webtest.type("xpath=//input[@name='title']", "hh");
	    webtest.type("xpath=//input[@name='sort']]", "2");
	    webtest.click("xpath=//select[@class='inputs']");
	   	webtest.click("xpath=//option[contains(.,'����ָ��')]");
	   	webtest.click("xpath=//input[@value='����(S)']");
	   	webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("����ɹ�"));
		}
	@Test(priority=47)
	public void three()throws InterruptedException{
		System.out.println("��ӡ47����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num65");
		webtest.click("xpath=//button[contains(.,' ����')]");
		webtest.enterFrame("openinputiframe");
		webtest.selectByIndex("name=type",2);
		Thread.sleep(3000);
		webtest.selectByIndex("name=grade",2);
		 webtest.type("xpath=//input[@name='title']", "hh");
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("��������ɹ�"));
	}
	@Test(priority=48)
	public void four()throws InterruptedException{
	System.out.println("��ӡ48����������");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'����')]");
	webtest.click("id=menu_list_num79");
	webtest.click("id=menu_list_num69");
	webtest.click("xpath=//button[contains(.,' ����')]");
	webtest.enterFrame("openinputiframe");
	webtest.selectByIndex("name=type",1);
	webtest.click("link=ѡ��");
	webtest.click("xpath=//td[contains(.,'�����')]");
	webtest.click("xpath=//input[@xname='��ʯ']");
	webtest.click("xpath=//input[@value='ȷ��']");
	webtest.click("xpath=//a[@id='btnchange_runuser']");
	webtest.click("xpath=//td[contains(.,'������')]");
	webtest.click("xpath=//input[@value='ȷ��']");
	 webtest.type("xpath=//input[@name='title']", "hh");
	webtest.click("xpath=//input[@value='����(S)']");
	webtest.leaveFrame();
	assertTrue(webtest.getHtmlSource().contains("����ɹ�"));
	}
	@Test(priority=49)
	public void five()throws InterruptedException{
	System.out.println("��ӡ49����������");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'��Դ')]");
	webtest.click("id=menu_list_num124");
	webtest.click("title=����");
	webtest.type("name=name","hhh");
	webtest.typeAndClear("name=sort","1");
	webtest.doubleClick("xpath=//div[contains(.,'ȷ��')]");
	assertTrue(webtest.getHtmlSource().contains("����ɹ�"));
	}
}
