//######To launch 1url and hit enter or search and get first 3 element########

package Selenium_JAVAadv;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txt=driver.findElement(By.xpath("//input[@class=\"searchbox_input__rnFzM\"]"));
		txt.sendKeys("TCS Careers");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		List<WebElement> a=driver.findElements(By.xpath("//li[@data-layout=\"organic\"]"));
		for(int i=0;i<3;i++){
			System.out.println((i+1)+"."+a.get(i).getText());
		}
		
		
		
//		To PRESS ENTER key 
//		txt.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.quit();
	}

}
