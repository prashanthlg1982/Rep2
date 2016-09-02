package comTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver;
	
	/*@FindBy(xpath =".//*[@id='login-username']")
	WebElement userName;
	
	@FindBy(xpath=".//*[@id='login-signin']")
	WebElement next;*/
	
	
	@Test
	public  void Login() {
		// TODO Auto-generated method stub
		
		
		//driver = new HtmlUnitDriver();
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/Downloads/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	
		//PageFactory.initElements(driver, this);
		
		String baseUrl = "https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com";
		
		driver.get(baseUrl);
		
/*PageFactory.initElements(comTestcases.Base.driver, comObjects.Elements.class);
		
		comObjects.Elements.userName.sendKeys("prash");			
		comObjects.Elements.next.click();*/
		//String title = driver.getTitle();
		

		
/*userName.sendKeys("kjhsdjfhsdjh@dfhsjhfk.com");
System.out.println("1");
next.click();
System.out.println("2");
System.out.println("Title::" + title);	*/

		
	}
	
	/*@BeforeTest 
	@Parameters("browser")
	public static void Parallel(String browser) {
		if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equals("IE")) {
			driver = new InternetExplorerDriver();			
		}		
	}*/
	
	/*@Test
	public static void Login() {
		
		String baseUrl = "https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com";
		
		driver.get(baseUrl);
		
		String title = driver.getTitle();
		
		System.out.println("Title::" + title);	
		
	}*/

}
