package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers  {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Leads Page", "FAIL");
		}
	}



	public FindLeadsPage enterLeadID(String data)
	{
		enterByXpath(prop.getProperty("FindLeads.LeadID.Xpath"), data);
		return this;
	}

	public FindLeadsPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FindLeads.firstname.Xpath"), data);
		return this;

	}

	public FindLeadsPage clickFindLeadsbtn()
	{
	clickByXpath(prop.getProperty("FindLeads.FindLeads.Xpath"));
		return this;

	}

	public ViewLeadPage clickFirstID()
	{
		clickByXpath(prop.getProperty("FindLeads.FirstResltingLead.Xpath"));
		return new ViewLeadPage(driver,test);

	}

public void verifyerrmsg(String data)
{
	verifyTextByXpath(prop.getProperty("FindLeads.Errmsg.Xpath"),data);

}

public FindLeadsPage captureLeadId()
{
	String captureid = getTextByXpath(prop.getProperty("FindLeads.FirstResltingLead.Xpath"));
	return this;
}

public FindLeadsPage captureLeadname()
{
	String capturename = getTextByXpath(prop.getProperty("FindLeads.FirstResltingLeadName.Xpath"));
	return this;
}

public FindLeadsPage clickemailtab()
{
	clickByXpath(prop.getProperty("FindLeads.Emailtab.Xpath"));
	return this;
}

public FindLeadsPage enteremail(String data)
{
	enterByXpath(prop.getProperty("FindLeads.Email.Xpath"), data);
	return this;

}

}
