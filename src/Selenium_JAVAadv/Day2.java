package Selenium_JAVAadv;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txt=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		txt.sendKeys("student");
		WebElement pw=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pw.sendKeys("Password123");
		WebElement sub=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		sub.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String s="Congratulations student. You successfully logged in!";
		WebElement ui=driver.findElement(By.xpath("//p[@class=\"has-text-align-center\"]"));
		if(s.equalsIgnoreCase(ui.getText())) {
			System.out.println(s);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
