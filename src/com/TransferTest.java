package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class TransferTest extends BaseTest{
		
	@Test(priority=33)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��33����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("link=����");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.typeAndClear("xpath=//input[@name='title']", "����");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=startdt", "2017-12-01 17:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-01 18:00:00");
        webtest.click("xpath=//a[@id='btnchange_joinname']");
        webtest.click("xpath=//input[contains(@xname,'�ź������Ŷ�')]");
        webtest.click("xpath=//input[@value='ȷ��']");
        webtest.click("id=AltS");
		webtest.click("xpath=//span[@id='indexuserl']");
		webtest.click("xpath=//li[contains(.,'�˳�')]");
		webtest.click("xpath=//button[contains(.,'?ȷ��')]");
		loginaction.loginByFront("��ʯ","123456");
		webtest.click("xpath=//a[contains(.,' ������Ϣ2')]"); 
		assertTrue(webtest.getHtmlSource().contains("�ڻ����,����:����"));
        }
	@Test(priority=34)
	public void two() throws InterruptedException{
		System.out.println("��ӡ34����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("link=����");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.typeAndClear("xpath=//input[@name='title']", "����");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("xpath=//input[@inputtype='datetime']", "2017-12-01 17:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-01 18:00:00");
        webtest.click("xpath=//a[@id='btnchange_joinname']");
        webtest.click("xpath=//input[contains(@xname,'�ź������Ŷ�')]");
        webtest.click("xpath=//input[@value='ȷ��']");
//        webtest.click("xpath=//u[contains(.,'������ļ�')]");
        webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
        webtest.click("link=������ļ�");
        webtest.enterFrame("winiframe");
        webtest.runJs("var setDate=document.getElementsByName(\'myform\')[0];setDate.removeAttribute('display:none')");
        webtest.type("name=inputfile", "D:\\admin\\a.txt");
        webtest.click("xpath=//button[contains(.,'��ʼ�ϴ�')]");
        webtest.click("xpath=//button[contains(.,'ȷ��')]");
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.click("xpath=//span[@id='indexuserl']");
		webtest.click("xpath=//li[contains(.,'�˳�')]");
		webtest.click("xpath=//button[contains(.,'?ȷ��')]");
		loginaction.loginByFront("��ʯ","123456");
		webtest.click("xpath=//a[contains(.,'������Ϣ2')]"); 
		assertTrue(webtest.getHtmlSource().contains("�ڻ����,����:����"));
        }
	}