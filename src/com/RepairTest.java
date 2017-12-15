package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class RepairTest extends BaseTest{
	
@Test(priority=40)
public void one() throws InterruptedException{
	System.out.println("打印第40个测试用例");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("ad min","123456");
	webtest.click("xpath=//span[contains(.,'流程')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=维修报修");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=assetm", "未知");
	webtest.typeAndClear("name=reason", "未知原因");
    webtest.click("id=AltS");
    webtest.refresh();
	assertTrue(webtest.getHtmlSource().contains("维修报修"));
    }

}
