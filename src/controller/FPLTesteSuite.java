package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FPLTesteSuite {
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public  FPLTesteSuite() {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		driver = new FirefoxDriver();
	    	wait = new WebDriverWait(driver, 10);
	}
	
	public  void abrirURL(String ambiente) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver.get(ambiente);
	}

}
