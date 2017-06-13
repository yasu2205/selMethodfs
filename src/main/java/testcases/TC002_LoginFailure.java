package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_LoginFailure extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login(Negative)";
		testDescription="Negative Scenarios of Login";
		browserName="chrome";
		dataSheetName="TC002_login Failure";
		category="Sanity";
		authors="Indhu";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String message){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMsg(message);
	}

}
