package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ValidLoginTest extends BaseTest {
	@Test
	public void validtest() throws IOException, InterruptedException {
		Flib fl = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.Actitimevalidlogin(fl.readpropertydata(PROP_PATH, "Username"), fl.readpropertydata(PROP_PATH, "Password"));
	}
}
