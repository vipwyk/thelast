package com.testCases;
//����
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
//������������
public class TypeTest extends BaseTest{
	@Test(priority=6)
	public void open() throws InterruptedException{
	System.out.println("��ӡ��6����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");        
		webtest.click("xpath=//input[@value='����(S)']");
		 assertTrue(webtest.getHtmlSource().contains("�������Ʋ���Ϊ��"));
	}
	@Test(priority=7)
	public void two() throws InterruptedException{
		System.out.println("��ӡ��7����������");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ͨ����']");
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("һ����ȷ�ı���"));
	}
	@Test(priority=8)
	public void three() throws InterruptedException{
		System.out.println("��ӡ��8����������");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='�����ƶ�']");
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("�����ƶ�"));
	}
	@Test(priority=9)
	public void four() throws InterruptedException{
		System.out.println("��ӡ��9����������");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ʶ��Ϣ']");
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("֪ʶ��Ϣ"));
	}
	@Test(priority=10)
	public void five() throws InterruptedException{
		System.out.println("��ӡ��10����������");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-28");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='����']");
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("����"));
	}
}
