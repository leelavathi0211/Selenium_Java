package Advance_Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Login_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xe.com/currencyconverter/convert/?Amount=1&From=INR&To=USD");
		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.findElement(By.id("username")).sendKeys("leelavathi.kakinada@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.id("password")).sendKeys("Klv@0211");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		WebElement dropdown = driver.findElement(By.xpath(//input[contains(@type,'text')])[2]);
//		Select dropdown = new Select(dropdown);
//		dropdown.selectByIndex(6);
		Thread.sleep(3000);
		driver.close();
	}

}
