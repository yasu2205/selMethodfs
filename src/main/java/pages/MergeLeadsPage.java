package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadsPage extends LeafTapsWrappers  {

	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Leads Page", "FAIL");
		}
	}



	public MergeLeadsPage clickFromLead()
	{
		clickByXpath(prop.getProperty("MergeLeads.FromLead.Xpath"));
		return this;
	}

	public MergeLeadsPage clickToLead()
	{
		clickByXpath(prop.getProperty("MergeLeads.ToLead.Xpath"));
		return this;
  
	}

	public MergeLeadsPage clcikMerge(String data)
	{
		clickByLink(prop.getProperty("MergeLeads.Merge.Link"));
		return this;

	}
	public MergeLeadsPage verifypagetitle()
	{
		verifyTitle(prop.getProperty("MergeLeads.Title"));
		return this;
		
	}
	
	public FindLeadPage switchToLastwindow()
	{
		switchToLastWindow();
		return new FindLeadPage(driver,test);
	}



}
