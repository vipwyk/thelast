package WebtestListener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class WebtestListener extends TestListenerAdapter{
	public void onTestFailure(ITestResult result){
		
	}
	public void onTestSkipped(ITestResult result){

	}
	public void onTestSuccess(ITestResult result){
	System.out.println("执行成功了");

	}
	public void onTestStart(ITestResult result){

	}
	//3.以下两个方法在testng.xml中的,test标签开始前，后执行
	public void onStart(ITestContext content){

	}
	@Override
	public void onFinish(ITestContext content){
	System.out.println("用例执行完毕，发送邮件");
		
			}
}
