package comTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest {
	//WebDriver driver;
  @Test
  public void f() {
	  System.out.println("1");
	  System.out.println("Title ::"+ comTestcases.Base.driver.getTitle());
	  System.out.println("2");
	 
PageFactory.initElements(comTestcases.Base.driver, comObjects.Elements.class);  

comObjects.Elements.userName.sendKeys("prash");	  
comObjects.Elements.next.click();
	  
  }
}
