package Advance_Selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class Calendar {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
	driver.manage().window().maximize();
	Thread.sleep(1000);
WebElement calendar = driver.findElement(By.xpath("//input[@id=\"datetimepicker2\"]"));
calendar.click();
Thread.sleep(1000);
WebElement year = driver.findElement(By.xpath("(//input[@class=\"numInput cur-year\"])[2]"));
year.clear();
year.sendKeys("2001");
Thread.sleep(2000);
WebElement drp = driver.findElement(By.xpath("(//select[@class=\"flatpickr-monthDropdown-months\"])[2]"));
Select select = new Select(drp);
select.selectByVisibleText("November");
Thread.sleep(1000);
WebElement date = driver.findElement(By.xpath("//span[@aria-label=\"November 2, 2001\"]"));
date.click();
System.out.println(date);
WebElement ampm = driver.findElement(By.xpath("(//span[@class=\"flatpickr-am-pm\"])[2]"));
ampm.click();
ampm.click();
Thread.sleep(2000);
WebElement time = driver.findElement(By.xpath("(//input[@class=\"numInput flatpickr-hour\"])[2]"));
time.clear();
time.sendKeys("6");
Thread.sleep(2000);
WebElement min = driver.findElement(By.xpath("(//input[@class=\"numInput flatpickr-minute\"])[2]"));
min.clear();
min.sendKeys("30");
String v = calendar.getAttribute("value");
//System.out.println(driver.findElement(By.xpath("(//input[@placeholder=\"Select date and time\"])[2]")));

//Thread.sleep(2000);
//calendar.click();
//String v = calendar.getAttribute();
//if(calendar.EqualsIgnoreCase(""))
driver.quit();
	}

}
