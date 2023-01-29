package Account;

import org.testng.annotations.Test;

import ConstantData.ConstantDataForRegister;
import PageObjectModel.AccountCreationPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;

public class AccountCreationTestCAse extends BaseClass {
	@Test(priority = 0)
	public void Account() {
		AccountCreationPageObject rpo = new AccountCreationPageObject(driver);

		rpo.ClickOnAccount().click();
		rpo.ClickOnRegister().click();
	}

///////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
	@Test(enabled = false, dependsOnMethods = "Account", priority = 1)

	public void RegisterUser() {

		AccountCreationPageObject rpo = new AccountCreationPageObject(driver);

		rpo.EnterFirstName().sendKeys(ConstantDataForRegister.FirstName);
		rpo.EnterLastName().sendKeys(ConstantDataForRegister.LAstName);
		rpo.EnterEmail().sendKeys(ConstantDataForRegister.Email);
		rpo.EnterTelephone().sendKeys(ConstantDataForRegister.Telephone);
		rpo.EnterPassword().sendKeys(ConstantDataForRegister.PassWord);
		rpo.confirmPassword().sendKeys(ConstantDataForRegister.ConformPAssword);
		rpo.ClickOnnewsletter().click();
		rpo.ClickPolicyCheckBox().click();
		rpo.ClickOnContinue().click();
		CommonMethod.Assertion(rpo.SuccessfulMessage(), ConstantDataForRegister.SuccessfulMessage);
	}
	public void Login() {
		AccountCreationPageObject rpo = new AccountCreationPageObject(driver);
	}

}
