package com.testCases;
//���Ա���
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.utils.LoginAction;
import com.webtest.core.BaseTest;
public class TitleTest extends BaseTest {
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��1����������"); 
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
//		driver.findElement(By.linkText("֪ͨ����")).click();
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
//		driver.switchTo().frame("openinputiframe");
//		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("");
		webtest.typeAndClear("xpath=//input[@name='title']", "");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ͨ����']");
//		webtest.clear("xpath=//input[contains(@name,'zuozhe')]");
//		driver.findElement(By.xpath("//input[contains(@name,'zuozhe')]")).sendKeys("��");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
//		JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
//		removeAttribute.executeScript("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
//  		WebElement setDatElement=driver.findElement(By.xpath("//input[@inputtype='date']"));
//        setDatElement.clear();
//       setDatElement.sendKeys("2017-11-22");
       
       webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");
        
		webtest.click("xpath=//input[@value='����(S)']");
//		String b = "���ⲻ��Ϊ��";
//		 assertTrue(a.getText().equals("���ⲻ��Ϊ��"));
		 assertTrue(webtest.getHtmlSource().contains("���ⲻ��Ϊ��"));
		}
		@Test(priority=2)
		public void two() throws InterruptedException{
			System.out.println("��ӡ��2����������");
			webtest.typeAndClear("xpath=//input[@name='title']", "123");
			Thread.sleep(3000);
			webtest.click("xpath=//input[@value='����(S)']");
			assertTrue(webtest.getHtmlSource().contains("���ⲻ��������"));
		}
		@Test(priority=3)
		public void three(){
			System.out.println("��ӡ��3����������");
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
//			driver.findElement(By.linkText("֪ͨ����")).click();
			webtest.click("link=֪ͨ����");
			 
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("xpath=//input[@name='title']", "@.@");
			webtest.click("xpath=//select[@class='inputs']");
			webtest.click("xpath=//option[@value='֪ͨ����']");
			webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
	        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
	        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");
	        
			webtest.click("xpath=//input[@value='����(S)']");
			assertTrue(webtest.getHtmlSource().contains("���⺬�������ַ�"));
		}
		@Test(priority=4)
		public void four(){
			System.out.println("��ӡ��4����������");
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
			webtest.click("link=֪ͨ����");			 
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("xpath=//input[@name='title']", "������������������������������������������");
			webtest.click("xpath=//select[@class='inputs']");
			webtest.click("xpath=//option[@value='֪ͨ����']");
			webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
	        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
	       webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");	        
			webtest.click("xpath=//input[@value='����(S)']");
			assertTrue(webtest.getHtmlSource().contains("�����������ܳ���20"));
		}
		@Test(priority=5)
		public void five(){
			System.out.println("��ӡ��5����������");
			webtest.click("xpath=//span[contains(.,'����')]");
			webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
			webtest.click("link=֪ͨ����");	 
			webtest.enterFrame("openinputiframe");
			webtest.typeAndClear("xpath=//input[@name='title']", "����  ���� ������");
			webtest.click("xpath=//select[@class='inputs']");
			webtest.click("xpath=//option[@value='֪ͨ����']");
			webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
	        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
	       webtest.typeAndClear("xpath=//input[@inputtype='date']", "2018-11-22");	        
			webtest.click("xpath=//input[@value='����(S)']");
			assertTrue(webtest.getHtmlSource().contains("�����в��ܳ��ֿո�"));
		}
		
}