package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers  {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page", "FAIL");
		}
	}



	public EditLeadPage enterCompanyName(String data)
	{
		enterById(prop.getProperty("EditLead.Company.Id"), data);
		return this;
	}

	public EditLeadPage enterFirstName(String data)
	{
		enterById(prop.getProperty("EditLead.FirstName.Id"), data);
		return this;

	}

	public EditLeadPage enterLastName(String data)
	{
		enterById(prop.getProperty("EditLead.LastName.Id"), data);
		return this;

	}

	public ViewLeadPage clickUpdateBtn()
	{
		clickByXpath(prop.getProperty("EditLead.Update.Xpath"));
		return new ViewLeadPage(driver,test);

	}

	public EditLeadPage verifypagetitle(String data)
	{
		verifyTitle(prop.getProperty("EditLead.Title"));
		return this;
		
	}
	
	



}
