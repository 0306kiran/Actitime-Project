package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class HomePage {
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']")
	private WebElement dropdown;
	@FindBy(xpath = "//a[.='Create new tasks']")
	private WebElement inserttask;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;
	@FindBy(xpath = "(//img[@class='sizer'])[3]")
	private WebElement user;
	@FindBy(xpath = "(//img[@class='sizer'])[1]")
	private WebElement tasks;
	@FindBy(xpath = "//a[.='Projects & Customers']")
	private WebElement projectandcust;
	@FindBy(xpath = "//input[@onclick='addCustomer(this.form)']")
	private WebElement newCustomer;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement customarname;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createCustomer;
	@FindBy(xpath = "//input[@onclick='addProject(this.form)']")
	private WebElement createProject;
	@FindBy(xpath = "//select[@name='customerId']")
	private WebElement selectCustomar;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectName;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createProjectbt;
	@FindBy(xpath = "//a[@class='item active']")
	private WebElement createUser;
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement createManager;
	@FindBy(xpath = "//input[@name='overtimeTracking']")
	private WebElement enableOt;
	@FindBy(xpath = "//input[@id='overtimeTrackingLevel_ReadOnly']")
	private WebElement automatic;
	@FindBy(xpath = "//input[@id='right12']")
	private WebElement checkbox1;
	@FindBy(xpath = "//input[@id='right1']")
	private WebElement checkbox2;
	@FindBy(xpath = "//input[@name='rightGranted[2]']")
	private WebElement checkbox3;
	@FindBy(xpath = "//input[@name='rightGranted[5]']")
	private WebElement checkbox5;
	@FindBy(xpath = "//input[@name='rightGranted[7]']")
	private WebElement checkbox7;
	@FindBy(xpath = "//input[@onclick='goToAddTasks()']")
	private WebElement createTask;
	@FindBy(xpath = "//input[@name='task[0].name']")
	private WebElement taskName;
	@FindBy(xpath = "//img[@id='task0.image']")
	private WebElement comment;
	@FindBy(xpath = "//input[@name='task[0].markedToBeAddedToUserTasks']")
	private WebElement addcheckbox;
	@FindBy(xpath = "//input[@value='Create Tasks']")
	private WebElement createTask1;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createTester;
	@FindBy(xpath = "(//img[contains(@class,'sizer')])[1]")
	private WebElement timeTrack;
	@FindBy(xpath = "//a[.='Insert existing tasks']")
	private WebElement insertTask;
	@FindBy(xpath = "//td[@id='cpSelector.cpButton_middleRightCell']")
	private WebElement addcustprjt;
	@FindBy(xpath = "(//input[@class='check-listbox-checkbox'])[1]")
	private WebElement checkboxad;
	@FindBy(xpath = "//input[@name='selected_4']")
	private WebElement selectcheckbox;
	@FindBy(xpath = "//input[@id='closeButton']")
	private WebElement close;
	@FindBy(xpath = "//input[@onclick='addSelectedTasks(this.form); return false;']")
	private WebElement insertTaskbt;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement time;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement time2;
	@FindBy(xpath = "//input[@id='SubmitTTButton']")
	private WebElement savechanges;
	@FindBy(xpath = "(//img[@title='Click to edit comments'])[1]")
	private WebElement comment1;
	@FindBy(xpath = "//textarea[@name='comment']")
	private WebElement text;
	@FindBy(xpath = "//input[@name='nscbutton']")
	private WebElement ok;
	@FindBy(xpath = "//input[@name='taskSelected[4]']")
	private WebElement completeCheckbox;
	@FindBy(xpath = "//input[@value='Complete Selected Tasks']")
	private WebElement completeSelectedtask;
	@FindBy(xpath = "//td[@class='selectCustomer']/descendant::input[@type='checkbox']")
	private WebElement selectProject;
	@FindBy(xpath = "//input[@value='Archive Selected']")
	private WebElement archieve;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement selectTask;
	@FindBy(xpath = "//div[.='Tasks']/following-sibling::img[@class='sizer']")
	private WebElement taskmanage;
	@FindBy(xpath = "//td[@class='listtblcell selectCell']/descendant::input[@type='checkbox']")
	private WebElement completeTaskmanager;
	@FindBy(xpath = "//a[.='Projects & Customers']")
	private WebElement projectAndcust;
	@FindBy(xpath="//input[@name='searchTasks']")private WebElement applyfilter;

	// constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utiliazation

	public WebElement getdropdown() {
		return dropdown;
	}

	public WebElement getinserttask() {
		return inserttask;
	}

	public WebElement getlogout() {
		return logout;
	}

	public WebElement gettasks() {
		return tasks;
	}

	public WebElement gettime() {
		return time;
	}
	// Operational method

	public void createUser() {
		user.click();
	}

	public void dropDown() {
		dropdown.click();
	}

	// logout
	public void log() {
		logout.click();
	}

	public void task() {
		tasks.click();
	}

	public void projectandcust() {
		projectandcust.click();
	}

	public void newcustomer() {
		newCustomer.click();
	}

	public void customarName() {
		customarname.sendKeys("Adani");
	}

	public void createcustomer() {
		createCustomer.click();
	}

	public void createproject() {
		createProject.click();
	}

	public void selectcustomer() {
		Worklib wl = new Worklib();
		wl.select();
	}

	public void projectname() {
		projectName.sendKeys("Web-Application-Testing");
	}

	public void createprojectbt() {
		createProjectbt.click();
	}

	public void createuser() {
		createUser.click();
	}

	public void createmanager() {
		createManager.click();
	}

	// change date
	public void enableot() {
		enableOt.click();
	}

	public void automatic1() {
		automatic.click();
	}

	public void checkBox() {
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		checkbox5.click();
		checkbox7.click();
	}

	public void createtask() {
		createTask.click();
	}

	public void taskname() {
		taskName.sendKeys("Write Automation script");
	}

	public void comment() {
		comment.click();
	}

	public void addcheckbox() {
		addcheckbox.click();
	}

	public void createTask1() {
		createTask1.click();
	}

	public void createtester() {
		createTester.click();
	}

	public void timeTrack() {
		timeTrack.click();
	}

	public void insertTask() {
		insertTask.click();
	}

	public void addcustprjt() {
		addcustprjt.click();
	}

	public void checkboxad() {
		checkboxad.click();
	}

	public void selectcheckbox() {
		selectcheckbox.click();
	}

	public void close() {
		close.click();
	}

	public void insertTaskbt() {
		insertTaskbt.click();
	}

	public void time() {
		time.sendKeys("10:10");
	}

	public void time2() {
		time2.sendKeys("8:10");
	}

	public void savechanges() {
		savechanges.click();
	}

	public void comment1() {
		comment1.click();
	}

	public void text() {
		text.sendKeys("hi sir...my work is completed");
	}

	public void ok() {
		ok.click();
	}

	public void completecheckbox() {
		completeCheckbox.click();
	}

	public void completeselectedtask() {
		completeSelectedtask.click();
	}

	public void selectProject() {
		selectProject.click();
	}

	public void archieve() {
		archieve.click();
	}

	public void selectTask() {
		selectTask.click();
	}

	public void taskmanage() {
		taskmanage.click();
	}

	public void completeTaskmanager() {
		completeTaskmanager.click();
	}

	public void projectAndCust() {
		projectAndcust.click();
	}
	public void applyFilter()
	{
		applyfilter.click();
	}
}
