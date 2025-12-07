package Advance_Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drp=driver.findElement(By.xpath("//input[@id=\"demo-multiple-select-input\"]"));
		Select s=new Select(drp);
		List<WebElement> li=s.getOptions();
		for(WebElement e: li) {
			System.out.println(e.getText());
		}
//		s.selectByVisibleText("Ms.");
//		Thread.sleep(2000);
//		s.selectByIndex(2);
//		Thread.sleep(2000);
//		s.selectByValue("1");
//		Thread.sleep(2000);
		
//		WebElement drop = driver.findElement(By.xpath("(//div[@data-g-action=\"try chat for work\"])[1]"));
//		Select dropdown = new Select(drop);
//		dropdown.selectByIndex(0);
//		Thread.sleep(2000);
		driver.quit();
//		driver.findElement(By.xpath("(//select[contains(@type,'text')])[2]")).sendKeys("in");
//		Thread.sleep(2000);
//		List<WebElement> op = driver.findElements("")
//		Select drop = new Select(dropdown);
//		drop.selectByIndex(6);
		
	}

}
