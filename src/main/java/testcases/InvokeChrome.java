package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChrome {

	@Test(groups = {"tuesday"})
	public void chromeTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("getAppModel")).getAttribute("class"));
		driver.close();
	}
}
