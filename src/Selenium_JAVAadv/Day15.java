package Selenium_JAVAadv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/flights\r\n");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement flight=driver.findElement(By.xpath("//h4[@class=\"mt-1 mb-0\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);",flight );
		Thread.sleep(2000);
		WebElement m=driver.findElement(By.xpath("(//a[@class=\" hover-primary rounded-4 d-flex p-3 px-4 fadeout waves-effect\"])[1]"));
		m.click();
		Thread.sleep(8000);
		List<WebElement> prices=driver.findElements(By.xpath("//span[@class=\"price\"]"));
//		for(WebElement k:prices) {
//			
//			System.out.println(k.getText());
//		}
//		Collections.sort(prices);
		List<Double> a=new ArrayList<>();
		for(WebElement i:prices) {
//			String p=i.getText();
				String p=i.getText().replaceAll("[^0-9.]", "");
//				if(p.endsWith("."))
				double x=Double.parseDouble(p);
				a.add(x);
				
					
				
//			
		}
//		System.out.println(a);
		double min=Collections.max(a);
		System.out.println(min);
		System.out.println(a.get(0));
//		for(int g:a) {
//		System.out.println(g);
//		}
//		for(Double j:a) {
//			
				
			
		driver.quit();
	}

}
