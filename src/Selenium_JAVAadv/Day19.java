package Selenium_JAVAadv;
//
import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Day19 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////	     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//	        WebDriver driver = new ChromeDriver();
//	        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
//	        driver.manage().window().maximize();       // Take screenshot
//	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	        File dest=new File("C:\\Leela");
//	        FileHandler.copy(src, dest);
////	        FileHandler.copy(src,dest);
//	        // Save screenshot to desired location
////	        FileUtils.copyFile(screenshot, new File("path/to/screenshot.png"));
//
//	        driver.quit();
//	}
//
//}
//package seleniumPractice;


public class Day19 {
    public static void main(String[] args){
        // 1. Launch the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Navigate to any confirmation or demo page
        driver.get("https://www.example.com");  // replace with your confirmation page URL

        // 3. Take screenshot of the page
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // 4. Define destination file path
        File destFile = new File("C:\\Leela\\Selenium");

        // 5. Copy screenshot to destination
//        FileUtils.copy(srcFile, destFile);

        // 6. Verify if the screenshot file exists
        if (destFile.exists()) {
            System.out.println("Screenshot saved successfully: " + destFile.getAbsolutePath());
        } else {
            System.out.println("Screenshot not found!");
        }

        // 7. Close browser
        driver.quit();
    }
}
