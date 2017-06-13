package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.EditLeadPage;
import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_DeleteLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		testCaseName="Delete Lead";
		testDescription="Delete a Lead in Leaftaps Application";
		browserName="chrome";
		dataSheetName="TC005_Delete Lead";
		category="Regression";
		authors="Yash";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String loggedInName, String cmpnyname, String title, String firstname, String errmsg) {
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
	   	.captureLeadId()
	   	.clickFirstID()
	   	.verifypagetitle(title)
	   	.ClickDeletebtn()
	   	.clickFindLeads()
	   	.enterLeadID(FindLeadsPage.prop.getProperty("FindLeads.FirstResltingLead.Xpath"))
	   	.clickFindLeadsbtn()
	   	.verifyerrmsg(errmsg);

	
	}

}
