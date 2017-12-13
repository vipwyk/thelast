package com.utils;

import com.webtest.core.WebDriverEngine;

public class LoginAction {
WebDriverEngine webtest=null;
public LoginAction (WebDriverEngine webtest){
	this.webtest=webtest;
}
public void loginByFront(String userName,String passWord){
	webtest.open("http://localhost:8032/xinhu/?m=login");
//	webtest.typeAndClear("xpath=//div/input[@name='adminuser']",userName);
	webtest.typeAndClear("name=adminuser",userName);
	webtest.typeAndClear("xpath=//input[@placeholder='«Î ‰»Î√‹¬Î']",passWord);
	webtest.click("xpath=//button[@name='button']");
	}

}