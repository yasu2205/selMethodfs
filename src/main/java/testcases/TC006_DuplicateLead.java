package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.EditLeadPage;
import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_DuplicateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		testCaseName="Duplicate Lead";
		testDescription="Delete a Lead in Leaftaps Application";
		browserName="chrome";
		dataSheetName="TC006_Duplicate Lead";
		category="Regression";
		authors="Yash";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String loggedInName, String cmpnyname, String title, String email, String errmsg) {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		//.verifyLoggedName(loggedInName)
		.clickCRM()
	   	.clickLeads()
	   	.clickFindLeads()
	   	.clickemailtab()
	   	.enteremail(email)
	   	.clickFindLeadsbtn()
	   //	.captureLeadname()
	   	.clickFirstID()
	   	.ClickDuplicatebtn()
	   	.verifypagetitle(title)
	   	.clickCreateLeadBtn()
	   	.VerifyFirstname(FindLeadsPage.prop.getProperty("FindLeads.FirstResltingLeadName.Xpath"));
	   	
	
	}

}
