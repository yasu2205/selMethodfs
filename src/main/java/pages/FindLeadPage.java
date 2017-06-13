package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers  {

	public FindLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Leads window", "FAIL");
		}
	}



	public FindLeadPage enterLeadID(String data)
	{
		enterByXpath(prop.getProperty("FindLead.LeadID.Xpath"), data);
		return this;
	}

	public FindLeadPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FindLead.firstname.Xpath"), data);
		return this;

	}

	public FindLeadPage clickFindLeadsbtn()
	{
	clickByXpath(prop.getProperty("FindLead.FindLeads.Xpath"));
		return this;

	}

	public MergeLeadsPage clickFirstID()
	{
		clickByXpathNoSnap(prop.getProperty("FindLead.FirstResltingLead.Xpath"));
		return new MergeLeadsPage(driver, test);

	}

public void verifyerrmsg(String data)
{
	verifyTextByXpath(prop.getProperty("FindLead.Errmsg.Xpath"),data);

}

public FindLeadPage captureLeadId()
{
	String captureid = getTextByXpath(prop.getProperty("FindLead.FirstResltingLead.Xpath"));
	return this;
}

public FindLeadPage captureLeadname()
{
	String capturename = getTextByXpath(prop.getProperty("FindLead.FirstResltingLeadName.Xpath"));
	return this;
}

public FindLeadPage clickemailtab()
{
	clickByXpath(prop.getProperty("FindLead.Emailtab.Xpath"));
	return this;
}

public FindLeadPage enteremail(String data)
{
	enterByXpath(prop.getProperty("FindLead.Email.Xpath"), data);
	return this;

}
public MergeLeadsPage switchToLastwindow1()
{
	switchToLastWindow();
	return new MergeLeadsPage(driver, test);
}

}
