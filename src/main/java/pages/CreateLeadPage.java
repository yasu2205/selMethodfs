package pages;

import org.openqa.selenium.remote.RemoteWebDriver;


import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers  {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}



	public CreateLeadPage enterCompanyName(String data)
	{
		enterById(prop.getProperty("CreateLead.Company.Id"), data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data)
	{
		enterById(prop.getProperty("CreateLead.FirstName.Id"), data);
		return this;

	}

	public CreateLeadPage enterLastName(String data)
	{
		enterById(prop.getProperty("CreateLead.LastName.Id"), data);
		return this;

	}

	public ViewLeadPage clickCreateLeadBtn()
	{
		clickByName(prop.getProperty("CreateLead.CreateLead.Name"));
		return new ViewLeadPage(driver,test);

	}




}
