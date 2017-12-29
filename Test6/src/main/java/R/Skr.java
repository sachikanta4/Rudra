package R;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch browser
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				//maximize
				driver.manage().window().maximize();
				System.out.println("maximize are successfully");
				// get URL
				driver.get("http://www.leaftaps.com/opentaps");
				System.out.println("ull has been opened successfully");
				//launch AUT
				driver.findElementById("username").sendKeys("DemoSalesManager");
				System.out.println("Username has been entered successfully");
				driver.findElementById("password").sendKeys("crmsfa");
				System.out.println("passworr has been entered successfully");
				driver.findElementByClassName("decorativeSubmit").click();
				System.out.println("login successfully");
				driver.findElementByLinkText("CRM/SFA").click();
				System.out.println("CRM/SFA opened successfully");
				//click find leads button
				driver.findElementByLinkText("Leads").click();
				System.out.println("createleads clicked successfully");
				//capture name of first resulting lead
				driver.findElementByLinkText("Merge Leads").click();
				System.out.println("mergelead click are successfully");
				//capture name of first resulting lead
				driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
				
				//new window
				Set<String>allwindowe = driver.getWindowHandles();
			    List<String>allWHandles = new ArrayList<String>();
			    allWHandles.addAll(allwindowe);
			    String secondWindow = allWHandles.get(1);
			    driver.switchTo().window(secondWindow);
			    System.out.println(driver.getTitle());
			    
			    driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10446");
			    driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
			    Thread.sleep(3000);
			   
			    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			    
			    driver.switchTo().window(allWHandles.get(0));
			    System.out.println(driver.getTitle());
			    
			    driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
			    //next window
			    Set<String>window = driver.getWindowHandles();
			    List<String>windows = new ArrayList<String>();
			    windows.addAll(window);
			    String secondWindo = windows.get(1);
			    driver.switchTo().window(secondWindo);
			    System.out.println(driver.getTitle());
			    
			    driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10450");
			    driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
			    Thread.sleep(3000);
			   
			    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			    driver.switchTo().window(allWHandles.get(0));
			    System.out.println(driver.getTitle());
			    
			    driver.findElementByLinkText("Merge").click();
			    
			    Alert merge = driver.switchTo().alert();
			    String mer = merge.getText();
			    System.out.println(mer);
			    merge.accept();
			    driver.close();
			    

	}

}
