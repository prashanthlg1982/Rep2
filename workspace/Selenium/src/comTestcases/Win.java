package comTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Win {
  @Test
  public void f() {
	  WebDriver driver;
	  WebElement we;
	  System.setProperty("webdriver.chrome.driver", "C:/Users/dell/Downloads/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("http://preview.harriscountyfws.org/");
	  driver.manage().window().maximize();

	  we = driver.findElement(By.cssSelector("[href=\"/Alerts\"]"));
	  if (we != null) we.click(); else System.out.println("Failed Link Click");

	  driver.switchTo().defaultContent();
	  By docLibrary = By.xpath(".//*[@id='NavMenu']/ul/li[4]/div/a");
	  driver.findElement(docLibrary).click();
  }
}
