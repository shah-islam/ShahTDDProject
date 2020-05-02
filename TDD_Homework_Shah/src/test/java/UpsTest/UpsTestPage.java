package UpsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UpsAction.UpsActionPage;
import UpsDriver.UpsDriverPage;

public class UpsTestPage extends UpsDriverPage {
	WebDriver driver = getChromeDriver();
	UpsActionPage shippingAction = new UpsActionPage(this.driver);
	final String URL = "https://www.ups.com/ship/guided/origin?tx=6801720182434837&loc=en_US";
	
	@BeforeMethod
	public void beforeMethod () {
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	@Test 
	public void shippingTest () {
		shippingAction.inputUserName();
		shippingAction.inputContactName();
		shippingAction.inputAddress();
		shippingAction.inputaddress2();
		shippingAction.inputZipcode();
		shippingAction.inputState();
		shippingAction.inputContinueBtn();
	}
	@AfterMethod 
	public void afterTest() {

		driver.close();

	
	
	
	

}
