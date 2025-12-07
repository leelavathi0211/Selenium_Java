package Selenium_JAVAadv;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.List;
public class Day6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(1000);
		alert.accept();
		ArrayList<String> l=new ArrayList<>();
		String x=driver.findElement(By.xpath("//p[@id=\"result\"]")).getText(); 
		l.add(x);
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		alert.accept();
		String y=driver.findElement(By.xpath("//p[@id=\"result\"]")).getText(); 
		l.add(y);
		for(String i: l) {
			System.out.println(i);
		}
		driver.quit();
	}

}
