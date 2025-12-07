package Advance_Selenium;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		WebElement frm=driver.findElement(By.xpath("//iframe[@src=\"/sampleiframe\"]"));
		driver.switchTo().frame(frm);
		WebElement s=driver.findElement(By.xpath("//body[text()=\"Parent frame\"]"));
		System.out.println(s.getText());
		WebElement fr=driver.findElement(By.xpath("//iframe[@src=\"/sampleiframe\"]"));
		driver.switchTo().frame(fr);
		driver.switchTo().defaultContent();
//		WebElement x=driver.findElement(By.xpath("//h1[text()=\"Selenium - Automation Practice Form\"]"));
//		System.out.println(x.getText());
//		List<WebElement> l=driver.findElements(By.xpath("//iframe[@src=\"new-tab-sample.php\"]"));
//		System.out.println(l.size());
//		
		
//		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
//		WebElement frm=driver.findElement(By.xpath("(//iframe[@src=\"new-tab-sample.php\"])[1]"));
//		driver.switchTo().frame(frm);
//		WebElement s=driver.findElement(By.xpath("//h1[text()=\"New Tab\"]"));
//		System.out.println(s.getText());
//		driver.switchTo().defaultContent();
//		WebElement x=driver.findElement(By.xpath("//h1[text()=\"Selenium - Automation Practice Form\"]"));
//		System.out.println(x.getText());
//		List<WebElement> l=driver.findElements(By.xpath("//iframe[@src=\"new-tab-sample.php\"]"));
//		System.out.println(l.size());
		
		driver.quit();
	}
}
