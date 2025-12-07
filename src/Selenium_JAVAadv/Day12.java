package Selenium_JAVAadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement p=driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]"));
		String tip=p.getAttribute("aria-label");
//		String a=p.getAttribute("aria-label");
		System.out.println(tip);
		driver.quit();
	}

}
