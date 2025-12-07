package Advance_Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
	WebElement a=driver.findElement(By.xpath("//a[@onclick=\"displayTwoPrompts();\"]"));
	a.click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Leela");
	Thread.sleep(2000);
//	System.out.println(s);
//	
	alert.accept();
	Thread.sleep(2000);
	driver.quit();
	
	
	//a[@onclick="displayPrompt();"]
	
//	driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
//	WebElement al= driver.findElement(By.xpath("//button[@onclick=\"showAlert()\"]"));
//	Thread.sleep(2000);
//	al.click();
//	Alert alert  = driver.switchTo().alert();
//	String s = alert.getText();
//	System.out.println(s);
//	Thread.sleep(2000);
//	alert.accept();
//	Thread.sleep(2000);
//	driver.quit();
	}

}
