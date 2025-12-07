package Advance_Selenium;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class TP_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		WebElement drp = d.findElement(By.xpath("//*[@id='inputGroupSelect03']"));
		Select s = new Select(drp);
		Thread.sleep(2000);
		s.selectByVisibleText("Proof.");
//		System.out.println(first.getText());
		s.selectByIndex(4);
		Thread.sleep(2000);
//		WebElement drp2 = d.findElement(By.xpath("//*[@id='inputGroupSelect03']"));
//		Select s2 = new Select(drp2);
		s.selectByVisibleText("Mrs.");
		Thread.sleep(2000);
//		System.out.println(s);
		List<WebElement> tot = s.getOptions();
//		for(WebElement i=0;i<tot;i++)
//			System.out.println(i.getText());
		for (WebElement op : tot)
			System.out.println(op.getText());
//		WebElement first = s.getFirstSelectedOption();
//		System.out.println(first.getText());
		d.quit();
	}

}
