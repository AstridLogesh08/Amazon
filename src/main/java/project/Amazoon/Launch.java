package project.Amazoon;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	
	@Test
	public void browserlaunch() {
		System.out.println("Program started");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("Start-Maximzed");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.amazon.com");
		System.out.println("Browser launched");
		
	
	}
}
