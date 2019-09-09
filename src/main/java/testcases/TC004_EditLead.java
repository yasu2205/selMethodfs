 package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.EditLeadPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_EditLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		testCaseName="EditLead";
		testDescription="Edit a Lead in Leaftaps Application";
		browserName="chrome";
		dataSheetName="TC004_Edit Lead";
		category="Regression";
		authors="Yash";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password, String loggedInName, String firstname, String cmpnyname, String title) {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		//.verifyLoggedName(loggedInName)
		.clickCRM()
	   	.clickLeads()
	   	.clickFindLeads()
	   	.enterFirstName(firstname)
	   	.clickFindLeadsbtn()
	   	.clickFirstID()
	   	.verifypagetitle(title)
	   	.ClickEditbtn()
	   	.enterCompanyName(cmpnyname)
	   	.clickUpdateBtn()
	   	.VerifyFirstname(firstname);

	
	}

}
