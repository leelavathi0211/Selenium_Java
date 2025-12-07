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
public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> l=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(int i=0;i<2;i++) {
			l.get(i).click();
			System.out.println(l.get(i).isSelected());
		}
		
		Thread.sleep(2000);
driver.quit();
}
}