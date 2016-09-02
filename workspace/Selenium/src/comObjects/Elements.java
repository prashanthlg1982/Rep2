package comObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class Elements {

	@FindBy(xpath =".//*[@id='login-username']")
	public static WebElement userName;
	
	@FindBy(xpath=".//*[@id='login-signin']")
	public static WebElement next;
}
