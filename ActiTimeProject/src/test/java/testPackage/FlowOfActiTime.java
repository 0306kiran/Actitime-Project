package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import genericPackage.Worklib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class FlowOfActiTime extends BaseTest {
	@Test
	public void endFlowofactitime() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Flib fl = new Flib();
		lp.Actitimevalidlogin(fl.readpropertydata(PROP_PATH, "Username"), fl.readpropertydata(PROP_PATH, "Password"));
		HomePage hp = new HomePage(driver);
		hp.task();
		hp.projectandcust();
		hp.newcustomer();
		hp.customarName();
		hp.createcustomer();
		Reporter.log("Admin create customer", true);

		hp.createproject();
		hp.selectcustomer();
		hp.projectname();
		hp.createprojectbt();
		Reporter.log("Admin create project", true);

		hp.createUser();
		UserPage usp = new UserPage(driver);
		usp.clickusertb();
		usp.creteManager();
		hp.enableot();
		hp.automatic1();
		hp.checkBox();
		usp.clickoncreateuser();
		Reporter.log("Admin create manager", true);

		lp.logout();
		lp.Actitimevalidlogin(fl.readpropertydata(PROP_PATH, "Username1"), fl.readpropertydata(PROP_PATH, "Password1"));
		hp.task();
		hp.createtask();
		Worklib wl = new Worklib();
		wl.selectCustomer();
		wl.selectProject();
		hp.taskname();
		hp.addcheckbox();
		hp.createTask1();
		Reporter.log("Manager create task", true);

		hp.createUser();
		hp.createmanager();
		usp.createTestengg();
		hp.enableot();
		hp.automatic1();
		hp.createtester();
		Reporter.log("Manager creates TestEngg.", true);

		hp.task();
		wl.entertimetrackdrop();
		hp.insertTask();
		usp.childWindow();
		hp.addcustprjt();
		hp.checkboxad();
		hp.close();

		hp.applyFilter();
		hp.selectTask();
		hp.insertTaskbt();
		driver.close();
		usp.parentWindow();
		lp.logout();
		Reporter.log("Manger assign task", true);

		lp.Actitimevalidlogin(fl.readpropertydata(PROP_PATH, "Username2"), fl.readpropertydata(PROP_PATH, "Password2"));
		hp.time();
	//	hp.time2();
		hp.comment1();
		hp.text();
		hp.ok();
		hp.savechanges();
		Reporter.log("TestEngg. perform task", true);

		lp.logout();
		lp.Actitimevalidlogin(fl.readpropertydata(PROP_PATH, "Username1"), fl.readpropertydata(PROP_PATH, "Password1"));
		hp.taskmanage();
		hp.completeTaskmanager();
		hp.completeselectedtask();
		Reporter.log("Manager complete task", true);

		hp.projectandcust();
		hp.selectProject();
		hp.archieve();
		wl.alert();
		Reporter.log("Manager archieve project", true);
	}
}
