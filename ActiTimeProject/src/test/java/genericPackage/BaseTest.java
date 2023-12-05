package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagePackage.LoginPage;

public class BaseTest implements Iautoconstant {
	protected static WebDriver driver;
	@BeforeClass
	public void setUp() throws IOException {
		Flib fl = new Flib();
		String url = fl.readpropertydata(PROP_PATH, "Url");
	//	WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	public void failed(String methodname) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShot" + methodname + ".png");
			Files.copy(src, dest);
		} catch (Exception e) {

		}
	}
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
