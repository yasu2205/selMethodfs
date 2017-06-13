package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers  {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Duplicate Lead Page", "FAIL");
		}
	}



	public DuplicateLeadPage enterCompanyName(String data)
	{
		enterById(prop.getProperty("DuplicateLead.Company.Id"), data);
		return this;
	}

	public DuplicateLeadPage enterFirstName(String data)
	{
		enterById(prop.getProperty("DuplicateLead.FirstName.Id"), data);
		return this;

	}

	public DuplicateLeadPage enterLastName(String data)
	{
		enterById(prop.getProperty("DuplicateLead.LastName.Id"), data);
		return this;

	}

	public ViewLeadPage clickCreateLeadBtn()
	{
		clickByName(prop.getProperty("DuplicateLead.CreateLead.Name"));
		return new ViewLeadPage(driver,test);

	}

	public DuplicateLeadPage verifypagetitle(String data)
	{
		verifyTitle(prop.getProperty("DuplicateLead.Title"));
		return this;
	}



}
