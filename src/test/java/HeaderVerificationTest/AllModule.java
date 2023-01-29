package HeaderVerificationTest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.VerificationOfHeaderObject;
import Resources.BaseClass;

public class AllModule extends BaseClass {

	@Test
	public void SelectCurrency() throws InterruptedException {
		Thread.sleep(6000);
		VerificationOfHeaderObject VHO = new VerificationOfHeaderObject(driver);
		VHO.ClickCurrency().click();
	    VHO.AllCurrency();
		VHO.SearchIteam().sendKeys("Iphone");
	}
	
	
	
}
