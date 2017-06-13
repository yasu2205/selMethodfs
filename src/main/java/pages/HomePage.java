package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers  {

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public HomePage verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath1"), data);
		return this;
	}

public MyHomePage clickCRM()
{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText(prop.getProperty("Home.CRMSFA.Link"))));

	clickByLink(prop.getProperty("Home.CRMSFA.Link"));
	return new MyHomePage(driver,test);
}
	
	public LoginPage clickLogout() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new LoginPage(driver,test);

	}
	
	
	
	
}
