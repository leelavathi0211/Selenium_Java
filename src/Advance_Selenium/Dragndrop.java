package Advance_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Dragndrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dr=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drp=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(dr, drp).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[text()=\"Dropped!\"]")).getText());
		driver.quit();
	}

}
