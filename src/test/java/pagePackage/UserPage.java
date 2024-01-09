package pagePackage;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.BaseTest;
import genericPackage.Flib;

public class UserPage extends BaseTest {
	@FindBy(xpath = "//div[@class='label' and (.='Users')]")
	private WebElement user;
	@FindBy(xpath = "//input[@type='button' and (@value='Create New User')]")
	private WebElement createuser;
	@FindBy(name = "username")
	private WebElement usntextbox;
	@FindBy(name = "passwordText")
	private WebElement passtextbox;
	@FindBy(name = "passwordTextRetype")
	private WebElement retypepasstextbox;
	@FindBy(name = "firstName")
	private WebElement firstnametextbox;
	@FindBy(name = "lastName")
	private WebElement lastnametextbox;
	@FindBy(xpath = "//input[@type='submit'and(@value='   Create User   ')]")
	private WebElement createuserbt;
	@FindBy(xpath = "//input[@type='button'and(@value='      Cancel      ')]")
	private WebElement cancel;

	// initialition
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getCreateuser() {
		return createuser;
	}

	public void setCreateuser(WebElement createuser) {
		this.createuser = createuser;
	}

	public WebElement getUsntextbox() {
		return usntextbox;
	}

	public void setUsntextbox(WebElement usntextbox) {
		this.usntextbox = usntextbox;
	}

	public WebElement getPasstextbox() {
		return passtextbox;
	}

	public void setPasstextbox(WebElement passtextbox) {
		this.passtextbox = passtextbox;
	}

	public WebElement getRetypepasstextbox() {
		return retypepasstextbox;
	}

	public void setRetypepasstextbox(WebElement retypepasstextbox) {
		this.retypepasstextbox = retypepasstextbox;
	}

	public WebElement getFirstnametextbox() {
		return firstnametextbox;
	}

	public void setFirstnametextbox(WebElement firstnametextbox) {
		this.firstnametextbox = firstnametextbox;
	}

	public WebElement getLastnametextbox() {
		return lastnametextbox;
	}

	public void setLastnametextbox(WebElement lastnametextbox) {
		this.lastnametextbox = lastnametextbox;
	}

	public WebElement getCreateuserbt() {
		return createuserbt;
	}

	public void setCreateuserbt(WebElement createuserbt) {
		this.createuserbt = createuserbt;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}

	// operational method
	public void validusn(String validuser) {
		getUsntextbox().sendKeys(validuser);
	}

	public void validpass(String validpass) {
		getPasstextbox().sendKeys(validpass);
	}

	public void retypepass(String retypepass) {
		getRetypepasstextbox().sendKeys(retypepass);
	}

	public void firstname(String firstName) {
		getFirstnametextbox().sendKeys(firstName);
	}

	public void lastname(String lastName) {
		getLastnametextbox().sendKeys(lastName);
	}

	public void clickoncreateuser() {
		createuserbt.click();
	}

	public void clickonuser() {
		user.click();
	}

	public void clickusertb() {
		createuser.click();
	}
	public void childWindow()
	{
		Set<String> win = driver.getWindowHandles();
		for (String w : win) {
			driver.switchTo().window(w);
		}
	}
	
	public void parentWindow()
	{
	Set<String> winp = driver.getWindowHandles();
	for (String winph : winp) {
		driver.switchTo().window(winph);
	}
	}
	
	
	public void creteManager() throws EncryptedDocumentException, IOException
	{
	Flib fl=new Flib();
	validusn(fl.readexcel(EXCEL_PATH, "Manager", 1, 0));
	validpass(fl.readexcel(EXCEL_PATH, "Manager", 1, 1));
	retypepass(fl.readexcel(EXCEL_PATH, "Manager", 1, 2));
	firstname(fl.readexcel(EXCEL_PATH, "Manager", 1, 2));
	lastname(fl.readexcel(EXCEL_PATH, "Manager", 1, 3));
	}

	public void createTestengg() throws EncryptedDocumentException, IOException
	{
		Flib fl=new Flib();
		validusn(fl.readexcel(EXCEL_PATH, "TestEngg", 1, 0));
		validpass(fl.readexcel(EXCEL_PATH, "TestEngg", 1, 1));
		retypepass(fl.readexcel(EXCEL_PATH, "TestEngg", 1, 2));
		firstname(fl.readexcel(EXCEL_PATH, "TestEngg", 1, 3));
		lastname(fl.readexcel(EXCEL_PATH, "TestEngg", 1, 4));
	}
}
