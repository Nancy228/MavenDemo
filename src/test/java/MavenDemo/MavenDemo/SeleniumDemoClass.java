package MavenDemo.MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoClass {

	public static void main(String[] args) {
	     
		System.setProperty("webdriver.chrome.driver","C:\\DriverFiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.close();
		
	}
	
}
