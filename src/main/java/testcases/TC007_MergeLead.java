package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC007_MergeLead extends LeafTapsWrappers {

	@BeforeClass
	public void setData() {
		testCaseName="MergeLead";
		testDescription="Merge two Leads in Leaftaps Application";
		browserName="chrome";
		dataSheetName="TC008_Merge";
		category="Regression";
		authors="Yash";
	}
	@Test(dataProvider="fetchData")
	public void MergeLeads(String userName, String password, String loggedInName, String firstname, String LeadID1, String LeadID2) {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		//.verifyLoggedName(loggedInName)
		.clickCRM()
	   	.clickLeads()
	   	.clickMergeLeads()
	   	.verifypagetitle()
	   	.clickFromLead()
	   	.switchToLastwindow()
	   	.enterLeadID(LeadID1)
	   	.clickFindLeadsbtn()
	   	.clickFirstID()
	   	//.switchToLastwindow1()
 	   	.clickToLead()
	   	.switchToLastwindow()
	   	.enterLeadID(LeadID2);
	}

}
