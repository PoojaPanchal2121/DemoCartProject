package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationOfHeaderObject {
	public WebDriver driver;

	By Currency = By.xpath("//span[contains(text(),'Currency')]");
	By AllCurrency = By.xpath("//button[@class='currency-select btn btn-link btn-block']");
	By Account = By.xpath("//span[@class='caret']");
	By SearchBox = By.xpath("//input[@name='search']");

	public VerificationOfHeaderObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement ClickCurrency() {
		return driver.findElement(Currency);
	}

	public List<WebElement> AllCurrency() {
		return driver.findElements(AllCurrency);
	}

	public WebElement ClickOnAccount() {
		return driver.findElement(Account);
	}

	public WebElement SearchIteam() {
		return driver.findElement(SearchBox);
	}

}
