package Testcases;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Page.GoForwardOptions;
import com.microsoft.playwright.Playwright;

public class Launch_diffbrowsers {

	public static void main(String[] args) throws InterruptedException {
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		double width=screensize.getWidth();
		double height=screensize.getHeight();
		System.out.println(height+ " "+width);
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext bc=browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width,(int)height));
		Page page=bc.newPage();
		page.navigate("https://way2automation.com");
		System.out.println(page.title());
		
//		########navigation######
		page.goBack(new GoBackOptions().setTimeout(500));
		Thread.sleep(1000);
		
		page.goForward(new GoForwardOptions().setTimeout(500));
//		Thread.sleep(1000);
		
		playwright.close();

	}

}
