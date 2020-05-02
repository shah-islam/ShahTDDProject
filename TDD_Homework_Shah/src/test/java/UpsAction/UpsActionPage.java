package UpsAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UpsElement.UpsElementpage;

public class UpsActionPage {
	UpsElementpage loginPageElements;

	public UpsActionPage (WebDriver driver) {
		this.loginPageElements = new UpsElementpage ();
		PageFactory.initElements(driver, loginPageElements);
	
	}
	
  public void inputUserName () {
	  loginPageElements.name.sendKeys("Shah Islam");
	  
	  
  }
  public void inputContactName () {
	  
	  loginPageElements.contactName.sendKeys("Shah Islam" );
  }
  public void inputAddress () {
	  loginPageElements.address.sendKeys("80-20 woodside Ave");
  }
  public void inputaddress2 () {
	  loginPageElements.address2.sendKeys("123");
	  
  }
  public void inputZipcode () {
	  loginPageElements.postal.sendKeys("11422");
  }
  public void inputState () {
	 loginPageElements.state.sendKeys("New York");
	  
  }
  public void inputContinueBtn () {
	  loginPageElements.continueBtn.click();
	  
	  
  }
  
  
  
}