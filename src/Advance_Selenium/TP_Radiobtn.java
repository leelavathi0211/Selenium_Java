package Advance_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List;
public class TP_Radiobtn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://demoqa.com/radio-button");
//		Thread.sleep(1000);
//		WebElement y=d.findElement(By.xpath("//input[@id=\"yesRadio\"])"));
//		y.click();
//		Thread.sleep(2000);
//		d.quit();
//		
		
		
		
		
		
		d.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement r = d.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		Boolean b=r.isSelected();
		System.out.println(b);
		r.click();
		Thread.sleep(2000);
//		List<WebElement> radios = d.findElements(By.xpath("(//input[@type=\"radio\"])"));
//		int tot = radios.size();
//		System.out.println(tot);
		Boolean status = r.isSelected();
		System.out.println(status);
		d.quit();
	}

}
