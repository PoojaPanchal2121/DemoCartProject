package Resources;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	public static void Assertion(WebElement actual, String expected) {
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}


}
