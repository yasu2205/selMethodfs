package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}
	}



	public ViewLeadPage VerifyFirstname(String data)
	{
	verifyTextById(prop.getProperty("ViewLead.firstname.Id"), data);
	return this;
	}

public EditLeadPage ClickEditbtn()
{
	clickByLink(prop.getProperty("ViewLead.Edit.Link"));
	return new EditLeadPage(driver,test);
}

public DuplicateLeadPage ClickDuplicatebtn()
{
	clickByLink(prop.getProperty("ViewLead.Duplicate.Link"));
	return new DuplicateLeadPage(driver,test);
}

public MyLeadsPage ClickDeletebtn() 
{
	clickByLink(prop.getProperty("ViewLead.Delete.Link"));
	return new MyLeadsPage(driver,test);
}

public ViewLeadPage verifypagetitle(String data)
{
	verifyTitle(prop.getProperty("ViewLead.Title"));
	return this;
}

}
