package Advance_Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement sc=driver.findElement(By.xpath("//h2[text()=\"Static Web Table\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", sc);
		Thread.sleep(2000);
		List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/td[4]"));
		
		for(WebElement j:li) {
			
			System.out.println(j.getText());
		}
		List<Integer> sorted=new ArrayList<>();
		for(WebElement k:li) {
			sorted.add(Integer.parseInt(k.getText()));
		}
		Collections.sort(sorted);
		System.out.println("Sorted");
		for(Integer m:sorted) {
			System.out.println(m);
		}
//		for(int i=1;i<=7;i++) {
//			String price=null;
//			 price=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[" +i+ "]/td[4]")).getText();
//			System.out.println(price);
//		}
		driver.quit();
	}

}
