package genericPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Worklib extends BaseTest {
	public void select() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
	}

	public void selectCustomer() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(3);
	}

	public void selectProject() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='projectId']"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(4);
	}

	public void entertimetrackdrop() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
	}

	public void alert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
}
