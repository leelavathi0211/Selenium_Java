package Advance_Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		WebElement drp=driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]"));
		Thread.sleep(2000);
		String s=drp.getCssValue("color");
		System.out.println(s);
		actions.clickAndHold(drp).build().perform();
		String t=drp.getCssValue("color");
		System.out.println(t);
		//double click
//		WebElement drp=driver.findElement(By.xpath("//button[@ondblclick=\"myDoubleclick()\"]"));
//			actions.doubleClick(drp).build().perform();
//			Thread.sleep(2000);
//			System.out.println(driver.findElement(By.xpath("//p[text()=\"You have Double clicked \"]")).getText());
	driver.quit();
	}

}
