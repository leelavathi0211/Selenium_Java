package Advance_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class kickoff {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//a[@class=\"wp-block-button__link has-text-color has-background has-very-dark-gray-background-color\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
