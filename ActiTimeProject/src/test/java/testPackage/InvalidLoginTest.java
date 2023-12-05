package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class InvalidLoginTest extends BaseTest {
	@Test
	public void invalid() throws EncryptedDocumentException, IOException, InterruptedException {
		Flib fl = new Flib();
		int last = fl.rowcount(EXCEL_PATH, "InvalidCreds");
		for (int i = 1; i <= last; i++) {
			String Username = fl.readexcel(EXCEL_PATH, "InvalidCreds", i, 0);
			String Password = fl.readexcel(EXCEL_PATH, "InvalidCreds", i, 0);
			LoginPage lp = new LoginPage(driver);
			lp.Actitimeinvalidlogin(Username, Password);
		}
	}
}