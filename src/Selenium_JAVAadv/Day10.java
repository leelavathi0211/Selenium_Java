package Selenium_JAVAadv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		WebElement a=driver.findElement(By.xpath("//a[text()=\"iFrame\"]"));
//		a.click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("(//iframe[@src=\"new-tab-sample.php\"])[1]"));
		driver.switchTo().frame(frame);
		System.out.print(driver.getTitle());
		driver.quit();
	}

}
