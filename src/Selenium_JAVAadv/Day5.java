package Selenium_JAVAadv;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();
		Thread.sleep(2000);
		String main=driver.getWindowHandle();
//		System.out.println(main);
		Set<String> wh=driver.getWindowHandles();
		for(String s:wh) {
			if(!s.equals(main)){
				driver.switchTo().window(s);
			System.out.println(s);
			System.out.println(driver.getTitle());
			System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]")).getText());
			}
		}
		driver.switchTo().window(main);
		System.out.println(driver.getTitle());
		driver.quit();
	
	}

}
