package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
//input[@name='enddt']
//���Ի�����֪ͨ
public class ShowTest extends BaseTest{
	@Test(priority=24)
	public void six() throws InterruptedException{
		System.out.println("��ӡ��24����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "���鰡");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='�����']");
		Thread.sleep(10000);
//		webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
//		webtest.typeAndClear("xpath=//input[@name='startdt']", "2017-11-30");
//		webtest.typeAndClear("xpath=//input[@name='enddt']", "2017-11-30");
//		//a[contains(.,'ȷ��')]
		webtest.click("xpath=//input[@name='startdt']");
		webtest.click("xpath=//td[contains(.,'30')]");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//input[contains(@max,'59')]");
		webtest.click("xpath=//font[contains(.,'30')]");
		webtest.click("xpath=//a[contains(.,'ȷ��')]");
		webtest.click("xpath=//input[@name='enddt']");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'18')]");
		webtest.click("xpath=//a[contains(.,'ȷ��')]");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
		webtest.click("xpath=//input[@value='����(S)']");
		
		webtest.refresh();
//		webtest.click("xpath=.//*[@id='notify_show_systodo']/div");
		
//		webtest.click("xpath=//a[@onclick='moregonggao()']");
//		 Thread.sleep(3000);
//		webtest.click("xpath=//a[@oi='0']");
//		
////		webtest.click("xpath=//li[contains(.,'����')]");
//		webtest.click("xpath=//div/ul/li");
//  	
//		
//		Thread.sleep(3000);
		assertTrue(webtest.getHtmlSource().contains("���鰡"));
//		webtest.click("link=[�鿴]");
		
	}
}