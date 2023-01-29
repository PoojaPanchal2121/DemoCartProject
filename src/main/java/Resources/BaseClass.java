package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import ConstantData.ConstantDataForRegister;

public class BaseClass {
	public WebDriver driver;

	public void BrowserInitilization() throws IOException {

		FileInputStream file = new FileInputStream(ConstantDataForRegister.path);

		Properties prop = new Properties();
		prop.load(file);

		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("Firefwwox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("check the Browser Name");
		}

	}

	@BeforeMethod
	public void BrowserLunch() throws IOException {
		BrowserInitilization();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
	}

}
