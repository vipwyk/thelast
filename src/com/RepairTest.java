package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class RepairTest extends BaseTest{
	
@Test(priority=40)
public void one() throws InterruptedException{
	System.out.println("��ӡ��40����������");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("ad min","123456");
	webtest.click("xpath=//span[contains(.,'����')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=ά�ޱ���");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=assetm", "δ֪");
	webtest.typeAndClear("name=reason", "δ֪ԭ��");
    webtest.click("id=AltS");
    webtest.refresh();
	assertTrue(webtest.getHtmlSource().contains("ά�ޱ���"));
    }

}
