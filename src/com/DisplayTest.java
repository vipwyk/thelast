package com.testCases;
//测试通知发出
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class DisplayTest extends BaseTest{
	@Test(priority=23)
	public void six() throws InterruptedException{
		System.out.println("打印第23个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=通知公告");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "ceshitongguo");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='通知公告']");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "部门");
		webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
		webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-23");

		webtest.click("xpath=//input[@value='保存(S)']");
		 
		webtest.refresh();
//		webtest.click("xpath=.//*[@id='notify_show_systodo']/div");
		
//		webtest.click("xpath=//a[@onclick='moregonggao()']");
//		 Thread.sleep(3000);
//		webtest.click("xpath=//a[@oi='0']");
//		
////		webtest.click("xpath=//li[contains(.,'详情')]");
//		webtest.click("xpath=//div/ul/li");
//  	
//		
//		Thread.sleep(3000);
		assertTrue(webtest.getHtmlSource().contains("ceshitongguo"));
//		webtest.click("link=[查看]");
		
	}
}
