package Advance_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TP_Register {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d =  new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	Thread.sleep(2000);
	WebElement u = d.findElement(By.xpath("//input[@placeholder=\"UserName\"]"));
	u.sendKeys("leelavathi.kakinada@gmail.com");
	Thread.sleep(1000);
	WebElement p = d.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	p.sendKeys("Leela@11");
	Thread.sleep(1000);
	WebElement but = d.findElement(By.xpath("//*[text()=\"New User\"]"));
	but.click();
	WebElement fn = d.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	fn.sendKeys("Leelavathi");
	WebElement ln = d.findElement(By.xpath("//input[@placeholder=\"lastname\"]"));
	ln.sendKeys("Kakinada");
	WebElement us = d.findElement(By.xpath("//input[@placeholder=\"UserName\"]"));
	us.sendKeys("leelavathi.kakinada@gmail.com");
	Thread.sleep(1000);
	WebElement pw = d.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	pw.sendKeys("Leela@11");
	WebElement reg = d.findElement(By.xpath("//input[@value=\"Register\"]"));
	reg.click();
	Thread.sleep(2000);
	d.quit();
	}

}
