package com.testCases;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

//����ʱ�����
public class TimeTest  extends BaseTest{
//	@FindBy(xpath = "//h2[contains(.,'FolderӰƬ����')]")
//	public WebElement managemovies;
	
	@Test(priority=30)
	public void one() throws InterruptedException{
		System.out.println("��ӡ30����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@id='menu_list_num42']");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "����");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//input[@name='startdt']");
		webtest.click("xpath=//td[contains(.,'30')]");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//input[contains(@max,'59')]");
		webtest.click("xpath=//font[contains(.,'30')]");
		webtest.click("xpath=//a[contains(.,'ȷ��')]");
		webtest.click("xpath=//input[@name='enddt']");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//a[contains(.,'ȷ��')]");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
		webtest.click("xpath=//input[@value='����(S)']");

		assertTrue(webtest.getHtmlSource().contains("��ֹʱ�������ڿ�ʼʱ��"));
	}
	@Test(priority=31)
	public void two() throws InterruptedException{
		System.out.println("��ӡ31����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@id='menu_list_num42']");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "����");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
//		webtest.click("xpath=//input[@name='startdt']");
//		webtest.click("xpath=//td[contains(.,'30')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'16')]");
//		webtest.click("xpath=//input[contains(@max,'59')]");
//		webtest.click("xpath=//font[contains(.,'30')]");
//		webtest.click("xpath=//a[contains(.,'ȷ��')]");
//		webtest.click("xpath=//input[@name='enddt']");
//		webtest.click("xpath=//td[@title='�¸�??']");
//		webtest.click("xpath=//td[contains(.,'1')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'00')]");
//		webtest.click("xpath=//input[contains(@max,'59')]");
//		webtest.click("xpath=//font[contains(.,'30')]");
//		webtest.click("xpath=//a[contains(.,'ȷ��')]");
//		webtest.click("xpath=//input[@value='����(S)']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=startdt", "2017-12-07 18:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-08 17:00:00");
        webtest.click("xpath=//input[@value='����(S)']");
		assertTrue(webtest.getHtmlSource().contains("�������������"));
	}
	@Test(priority=32)
	public void three() throws InterruptedException{
		System.out.println("��ӡ32����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@id='menu_list_num42']");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "����");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
//		webtest.click("xpath=//input[@name='startdt']");
//		webtest.click("xpath=//td[contains(.,'23')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'16')]");
//		webtest.click("xpath=//input[contains(@max,'59')]");
//		webtest.click("xpath=//font[contains(.,'30')]");
//		webtest.click("xpath=//a[contains(.,'ȷ��')]");
//		webtest.click("xpath=//input[@name='enddt']");
//		webtest.click("xpath=//td[contains(.,'23')]");
//		webtest.click("xpath=//input[@max='23']");
//		webtest.click("xpath=//font[contains(.,'17')]");
//		webtest.click("xpath=//a[contains(.,'ȷ��')]");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("xpath=//input[@inputtype='datetime']", "2017-12-07 18:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-07 17:00:00");
        webtest.click("xpath=//input[@value='����(S)']");
        Thread.sleep(1000);
		assertTrue(webtest.getHtmlSource().contains("��ʼʱ�������ڵ�ǰʱ��"));
	}
}