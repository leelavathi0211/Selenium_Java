package Testcases;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		double width=screensize.getWidth();
		double height=screensize.getHeight();
		System.out.println(height+ " "+width);
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		BrowserContext bc=browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width,(int)height));
		Page page=bc.newPage();
		page.navigate("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		Thread.sleep(1000);
		Locator checkboxes=page.locator("(//input[@type=\"checkbox\"])");
		System.out.println(checkboxes.count());
		for(int i=0;i<checkboxes.count();i++) {
			checkboxes.nth(i).click();
		}
		
		Thread.sleep(1000);
		
		playwright.close();
	}

}
