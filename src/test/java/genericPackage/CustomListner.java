package genericPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListner extends BaseTest implements ITestListener {
  
    
	public void onTestFailure(ITestResult result) {
		String failmethod = result.getMethod().getMethodName();
		Reporter.log("Failed methd name" +failmethod,true);
		failed(failmethod);
	}
}
