package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class InvokeChrome {

	@Test(groups = {"tuesday"})
	public void chromeTest() throws MalformedURLException {
		RemoteWebDriver driver = null;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver = new ChromeDriver();
		driver = new RemoteWebDriver(new URL("http://localhost.4444/wd/hub"), dc);
		driver.get("https://www.moneycontrol.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("getAppModel")).getAttribute("class"));
		driver.close();
	}
}
