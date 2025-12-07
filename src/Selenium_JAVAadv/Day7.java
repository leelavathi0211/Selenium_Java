package Selenium_JAVAadv;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> l=driver.findElements(By.xpath("//table[@id=\"table1\"]//tr//td[4]"));
		List<Double> f=new ArrayList<>();
		for(WebElement i:l) {
			String amount=i.getText().replace("$", "");
			Double a=Double.parseDouble(amount);
			f.add(a);
					}
//		Collections.sort(f);
		double max=Collections.max(f);
		System.out.println(max);
//		System.out.println(f.get(f.size()-1));
		for(int k=0;k<f.size();k++) {
			if(f.get(k)==max) {
			WebElement g=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+(k+1)+"]"));
			System.out.println(g.getText());
			}
		}

					driver.quit();
		}
	}

