package com.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;

public class ProcessTest extends BaseTest{
	
@Test(priority=41)
public void one() throws InterruptedException{
	System.out.println("��ӡ��41����������");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
	webtest.click("xpath=//span[contains(.,'����')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=��Ʒ�ɹ�");
	webtest.enterFrame("openinputiframe");
	webtest.click("xpath=//a[contains(.,'ѡ��')]");
	webtest.click("xpath=//input[contains(@xname,'���1')]");
	webtest.click("xpath=//input[@value='ȷ��']");
	webtest.typeAndClear("name=count0_0", "1");
    webtest.click("xpath=//input[@id='AltS']");
    webtest.refresh();
    webtest.click("xpath=//div[@id='notify_show_systodo']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//div[@id='notify_show_reimto']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    //webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//a[@onclick='moemyapplylist()']");
    webtest.click("xpath=//td[@cell='0']");
    webtest.click("xpath=//button[@click='view']");
    webtest.enterFrame("openinputiframe");
    Thread.sleep(1000);
	assertTrue(webtest.getHtmlSource().contains("���1"));
  }
@Test(priority=42)
public void two() throws InterruptedException{
	System.out.println("��ӡ��42����������");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'����')]");
	webtest.click("id=menu_list_num42"); 
	webtest.click("link=ͼ�����");
	webtest.enterFrame("openinputiframe");
	webtest.click("link=ѡ��");
	webtest.click("xpath=//input[@xname='PHP�����ŵ���ͨ']");
	webtest.click("xpath=//input[contains(@value,'ȷ��')]");
	webtest.runJs("var setDate=document.getElementsByName(\'jydt\')[0];setDate.removeAttribute('readonly')");
    webtest.typeAndClear("name=jydt", "2017-12-01");
    Thread.sleep(5000);
    webtest.runJs("var setDate=document.getElementsByName(\'yjdt\')[0];setDate.removeAttribute('readonly')");
    webtest.typeAndClear("name=yjdt", "2017-12-01");
	webtest.click("id=AltS");
    webtest.refresh();
    webtest.click("xpath=//div[@id='notify_show_systodo']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//div[@id='notify_show_reimto']/div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    //webtest.click("xpath=//div[@onclick='$(this).parent().fadeOut(function(){$(this).remove()})']");
    webtest.click("xpath=//a[@onclick='moemyapplylist()']");
    webtest.click("xpath=//td[@cell='0']");
    webtest.click("xpath=//button[@click='view']");
    
	assertTrue(webtest.getHtmlSource().contains("ͼ�����"));
}
@Test(priority=43)
public void three() throws InterruptedException{
	System.out.println("��ӡ��43����������");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'����')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=ӡ��");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=name", "һöӡ��");
	webtest.selectByIndex("name=type", 1);
	webtest.click("link=ѡ��");
	webtest.click("xpath=//td[contains(.,'?�����')]");
	webtest.click("xpath=//input[@xname='��ʯ']");
	webtest.click("xpath=//input[@value='ȷ��']");
	webtest.click("id=AltS");
	webtest.leaveFrame();
	assertTrue(webtest.getHtmlSource().contains("��������ɹ�"));
	}
@Test(priority=44)
public void four() throws InterruptedException{
	System.out.println("��ӡ��44����������");
	webtest.refresh();
	webtest.click("xpath=//span[contains(.,'����')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=ӡ������");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=explain", "ӡ��");
	webtest.selectByIndex("name=sealid", 1);
	webtest.click("id=AltS");
	webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
    webtest.click("link=���������");
    webtest.typeAndClear("xpath=//button[@id='addbtn']", "D:\\admin\\a.txt");
    webtest.click("xpath=//button[contains(.,'��ʼ�ϴ�')]");
    webtest.click("xpath=//button[contains(.,'ȷ��')]");
	webtest.click("xpath=//input[@value='����(S)']");
	webtest.leaveFrame();
	assertTrue(webtest.getHtmlSource().contains("��������ɹ�"));
}
}