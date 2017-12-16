package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

//�����Ҫ�������
public class ChoiceTest extends BaseTest{
	@Test(priority=25)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��25������������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//a[contains(.,'ѡ��')]");
		webtest.click("xpath=//td[contains(.,'�����')]");
		webtest.click("xpath=//input[@xname='��ʯ']");
		webtest.click("xpath=//input[@value='ȷ��']");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("�����Ҳ���Ϊ��"));

		
}
	@Test(priority=26)
	public void two() throws InterruptedException{
		System.out.println("��ӡ26����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�?']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
		webtest.click("xpath=//a[contains(.,'ѡ��')]");
		webtest.click("xpath=//td[contains(.,'�����')]");
		webtest.click("xpath=//input[@xname='��ʯ']");
		webtest.click("xpath=//input[@value='ȷ��']");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("���ⲻ��Ϊ��"));

	}
	@Test(priority=27)
	public void three() throws InterruptedException{
		System.out.println("��ӡ27����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "������");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
		webtest.click("xpath=//a[contains(.,'ѡ��')]");
		webtest.click("xpath=//td[contains(.,'�����')]");
		webtest.click("xpath=//input[@xname='��ʯ']");
		webtest.click("xpath=//input[@value='ȷ��']");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("��ʼʱ�䲻��Ϊ��"));

	}
	@Test(priority=28)
	public void four() throws InterruptedException{
		System.out.println("��ӡ28����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "������");
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
		webtest.click("xpath=//a[contains(.,'ѡ��')]");
		webtest.click("xpath=//td[contains(.,'�����')]");
		webtest.click("xpath=//input[@xname='��ʯ']");
		webtest.click("xpath=//input[@value='ȷ��']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("xpath=//input[@inputtype='datetime']", "2017-12-07 18:00:00");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("����ʱ�䲻��Ϊ��"));

	}
	@Test(priority=29)
	public void five() throws InterruptedException{
		System.out.println("��ӡ29����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("id=menu_list_num42");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "������");	
		webtest.selectByValue("xpath=//select[@name='hyname']","�����");
		webtest.click("xpath=//a[contains(@id,'joinname')]");
		webtest.click("xpath=//input[@xname='�ź������Ŷ�']");
		webtest.click("xpath=//input[contains(@value,'ȷ��')]");
		webtest.click("xpath=//a[contains(.,'ѡ��')]");
		webtest.click("xpath=//td[contains(.,'�����')]");
		webtest.click("xpath=//input[@xname='��ʯ']");
		webtest.click("xpath=//input[@value='ȷ��']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=startdt", "2017-12-07 18:00:00");
        webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
        webtest.typeAndClear("name=enddt", "2017-12-08 17:00:00");
		webtest.click("id=AltS");
		assertTrue(webtest.getHtmlSource().contains("�λ��˲���ΪΪ��"));
	}
	}
