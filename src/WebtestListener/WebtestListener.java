//package WebtestListener;
//
//import org.testng.ITestContext;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//
//import com.mail.mail;
//
//public class WebtestListener extends TestListenerAdapter{
//	public void onTestFailure(ITestResult result){
//		
//	}
//	public void onTestSkipped(ITestResult result){
//
//	}
//	public void onTestSuccess(ITestResult result){
//	//System.out.println("ִ�гɹ���");
//
//	}
//	public void onTestStart(ITestResult result){
//
//	}
//	//3.��������������testng.xml�е�,test��ǩ��ʼǰ����ִ��
//	public void onStart(ITestContext content){
//
//	}
//	@Override
//	public void onFinish(ITestContext content){
//	System.out.println("����ִ����ϣ������ʼ�");
//		
//		mail mail = new mail();
//		try {
//			mail.aa();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//}
