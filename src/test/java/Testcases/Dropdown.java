package Testcases;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		double width=screensize.getWidth();
		double height=screensize.getHeight();
		System.out.println(height+ " "+width);
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		BrowserContext bc=browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width,(int)height));
		Page page=bc.newPage();
		page.navigate("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		Thread.sleep(1000);
		//select by value
		page.selectOption("//select[@class=\"form-select\"]", "Ms.");
		Thread.sleep(1000);
		
		//select by text
		page.selectOption("//select[@class=\"form-select\"]",new SelectOption().setLabel("Mr."));
		Thread.sleep(1000);
		
		//slectby index
		page.selectOption("//select[@class=\"form-select\"]", new SelectOption().setIndex(3));
		Thread.sleep(1000);
		
		//To get list of web element-findelement
		Locator values=page.locator("//select[@class=\"form-select\"]//option");
		System.out.println(values.count());
		for(int i=0;i<values.count();i++) {
			System.out.println(values.nth(i).innerText()+"  "+values.nth(i).getAttribute("value"));
		}
		
		//Findelements-list
		List<ElementHandle> valuel=page.querySelectorAll("//select[@class=\"form-select\"]//option");
		System.out.println(valuel.size());
		for(ElementHandle j:valuel) {
		System.out.println(j.innerText());
		}
		
		playwright.close();
		}

}
