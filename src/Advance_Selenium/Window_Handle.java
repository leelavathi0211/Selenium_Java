package Advance_Selenium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;
public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		WebElement a=driver.findElement(By.xpath("//button[@title=\"New Tab\"]"));
		a.click();
		Set<String> all=driver.getWindowHandles();
		ArrayList<String> li=new ArrayList<>(all);
		driver.switchTo().window(li.get(1));
		String txt=driver.findElement(By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]")).getText();
		System.out.println(txt);
		driver.switchTo().window(li.get(0));
		Thread.sleep(2000);
		WebElement main=driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]"));
		System.out.println(main.getText());
		driver.quit();
		
		
//		####USING FOR EACH loop####
//		for(String i:all) {
//			if(!parent.equalsIgnoreCase(i)) {
//				driver.switchTo().window(i);
//				String txt=driver.findElement(By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]")).getText();
//				System.out.println(txt);
//			}
//		}
//		driver.switchTo().window(parent);
//		Thread.sleep(2000);
//		WebElement main=driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]"));
//		System.out.println(main.getText());
//		driver.quit();
		
	
		
//		#####Using iterator###
//		Iterator<String> it=all.iterator();
//		
//		while(it.hasNext()) {
//			String c=it.next();
//			
//			if(!parent.equalsIgnoreCase(c)) {
//			driver.switchTo().window(c);
//			String txt=driver.findElement(By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]")).getText();
//			
//			System.out.println(txt);
//			driver.close();
//			}
//		}
//			Thread.sleep(2000);
//			driver.switchTo().window(parent);
//			Thread.sleep(2000);
//			WebElement main=driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]"));
//			System.out.println(main.getText());
//			driver.quit();
			
		}


}
