package com.testCases;
//����֪ͨ����
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class DisplayTest extends BaseTest{
	@Test(priority=23)
	public void six() throws InterruptedException{
		System.out.println("��ӡ��23����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "ceshitongguo");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ͨ����']");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
		webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
		webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-23");

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
		assertTrue(webtest.getHtmlSource().contains("ceshitongguo"));
//		webtest.click("link=[�鿴]");
		
	}
}
