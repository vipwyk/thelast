package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
//��������
public class DateTest  extends BaseTest{
	@Test(priority=21)
	public void open() throws InterruptedException{
		System.out.println("��ӡ��21����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ͨ����']");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-27");        
		webtest.click("xpath=//input[@value='����(S)']");
		assertTrue(webtest.getHtmlSource().contains("���ڲ������ڵ�ǰ����"));
	}
	@Test(priority=22)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��22����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���a");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ͨ����']");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-28");        
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("һ����ȷ�ı���a[2017-11-28]"));
	}
}
