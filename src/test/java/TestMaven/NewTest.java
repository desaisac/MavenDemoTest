package TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\SELENIUM AUTOMATION\\chromedriver_win32\\chromedriver.exe");
	  
	  //WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
		
  }
}
