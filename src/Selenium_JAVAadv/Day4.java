package Selenium_JAVAadv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		Select s=new Select(d);
		List<WebElement> drp=s.getOptions();
		ArrayList<String> a=new ArrayList<>();
		Collections.sort(a);
		for(WebElement i:drp) {
		System.out.println(i.getText());		
		}
//		s.selectByIndex(6);
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//select[@class=\"form-select\"]//option[7]")).getText());
		String last=a.get(a.size()-1);
		System.out.println(last);
		Thread.sleep(2000);
		s.selectByVisibleText(last);
		Thread.sleep(2000);
//		String sel=s.getFirstSelectedOption().getText();
		System.out.println(s.getFirstSelectedOption().getText());
//		for(int i=0;i<p;i++ ) {
//			System.out.println(a.get(i).getText());
//		}
		driver.quit();
	}

}
