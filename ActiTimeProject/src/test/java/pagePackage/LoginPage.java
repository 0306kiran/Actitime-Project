package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement usernametab;
	@FindBy(name = "pwd")
	private WebElement passwordtab;
	@FindBy(id = "loginButton")
	private WebElement loginbt;
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement checkbox;
	@FindBy(xpath = "//a[.='Actimind Inc.']")
	private WebElement actitimemindlink;
	@FindBy(id = "licenseLink")
	private WebElement actitimelicencelink;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logOut;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// for utiliazation

	public WebElement getusernametab() {
		return usernametab;
	}

	public WebElement getpasswordtab() {
		return passwordtab;
	}

	public WebElement getloginbt() {
		return loginbt;
	}

	public WebElement getcheckbox() {
		return checkbox;
	}

	public WebElement getactitimemindlink() {
		return actitimemindlink;
	}

	public WebElement getactitimelicencelink() {
		return actitimelicencelink;
	}

	public void logout() {
		logOut.click();
	}
	
    //Validlogin.
	public void Actitimevalidlogin(String validusername, String validpassword) throws InterruptedException {
		usernametab.sendKeys(validusername);
		Thread.sleep(2000);
		passwordtab.sendKeys(validpassword);
		Thread.sleep(2000);
		loginbt.click();
	}

	//Invalidlogin.
	public void Actitimeinvalidlogin(String invalidusername, String invalidpassword) throws InterruptedException {
		usernametab.sendKeys(invalidusername);
		Thread.sleep(2000);
		passwordtab.sendKeys(invalidpassword);
		Thread.sleep(2000);
		loginbt.click();
		Thread.sleep(2000);
		usernametab.clear();
	}

}
