package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		testCaseName="CreateLead";
		testDescription="Create a Lead in Leaftaps Application";
		browserName="chrome";
		dataSheetName="TC003_Create Lead";
		category="Regression";
		authors="Yash";
	}
	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName, String companyname, String firstname, String lastname) {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		//.verifyLoggedName(loggedInName)
		.clickCRM()
	   	.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLeadBtn()
		.VerifyFirstname(firstname);
	}

}
