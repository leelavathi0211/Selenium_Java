package Selenium_JAVAadv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement x=driver.findElement(By.xpath("//button[text()=\"Start\"]"));
		x.click();
//		Thread.sleep(5000);
		
		System.out.print(driver.findElement(By.xpath("//div[@id=\"finish\"]")).getText());
		driver.quit();
	}

}
