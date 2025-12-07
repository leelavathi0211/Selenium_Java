package Advance_Selenium;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		WebElement tab = d.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]"));
//		List<WebElement> r=d.findElements(By.xpath(".//th"));
		for(int i=0;i<=7;i++) {
//			WebElement s=d.findElement(By.xpath(""))
			String a=null;
			 a=d.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]//th["+i+"]")).getText();
			if(a.equalsIgnoreCase("Salary")) {
				for(int j=1;j<=7;j++) {
					String b=null;
//					 b=d.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]//tr[3]//td[3]"));
				}
				
			}
		}
		
//		alternate Method
//		WebElement a=d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[1]/td[5]"));
//		WebElement b=d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[5]"));
//		WebElement c=d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[3]/td[5]"));
//		String i=a.getText();
//		String j=b.getText();
//		String k=c.getText();
//		int p=Integer.parseInt(i);
//		int q=Integer.parseInt(j);
//		int r=Integer.parseInt(k);
//		System.out.println(p);
//		System.out.println(q);
//		System.out.println(r);
//		if(p>q&&p>r) {
//			System.out.println(p);
//		}
//		else if(q>p&&q>r) {
//			System.out.println(q);
//		}
//		else
//			System.out.println(r);
//		
		
//		WebElement tab = d.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]"));
//		List<WebElement> r=d.findElements(By.xpath(".//td[5]"));
//		int m=Integer.MIN_VALUE;
//		for(WebElement w:r) {
//			int val=Integer.parseInt(w.getText());
//			if(val>m) {
//				m=val;
//			}
			
			
			
//		int a=Integer.parseInt(r.getText());
//		String max=r.getText();
//		for(WebElement w:r) {
//			if(w.)
//			String max=w.get(1);
//		}
//			System.out.println(m);
		
		d.quit();
	}

}