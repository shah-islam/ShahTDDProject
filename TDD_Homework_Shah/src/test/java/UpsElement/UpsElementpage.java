package UpsElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsElementpage {
	@FindBy (id="originname")
	public WebElement name;
	
	@FindBy (id="origincontactName")
	public WebElement contactName;
	
	@FindBy (id="originaddress1")
	public WebElement address  ;
	
	@FindBy (id="originaddress2")
	public WebElement address2;
	
	@FindBy (id="originpostal")
	public WebElement postal;
	
	@FindBy (id= "originstate")
	public WebElement state;
	
	@FindBy (id="nbsBackForwardNavigationContinueButton")
	public WebElement continueBtn;
	
	

}
