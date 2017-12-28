package groups;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import groupswdMethods.SeMethods;



public class CreateLead extends SeMethods{
	
	
	//public static void main(String[] args)
	@Parameters({"url","browser","username","password"})
	@Test(groups={"smoke"})
	public void createLead1(String url, String browser, String username, String password)
	{
		
		//SeMethods se = new SeMethods();
		
		startApp(browser, url);
		
		WebElement user = locateElement("id", "username");
		type(user, username);
		
		WebElement pwd = locateElement("id", "password");
		type(pwd, password);
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);	
		
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement user = locateElement("id", "username");
		type(user, "DemoSalesManager");
		
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);	
		*/
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);
		
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, "TestLeaf");
		
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, "Sachin st");
		
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		type(lastName, "P");
		
		//phoneCountryCode
		
				WebElement phoneCountryCode = locateElement("id", "createLeadForm_primaryPhoneCountryCode");
				type(phoneCountryCode, "2");
				
				
				//phoneAreaCode
				
				WebElement phoneAreaCode = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
				type(phoneAreaCode, "3");
				
				
				//phoneNumber
				
				WebElement phoneNumber = locateElement("id", "createLeadForm_primaryPhoneNumber");
				type(phoneNumber, "4");
				
				WebElement smallSubmit = locateElement("class", "smallSubmit");
				click(smallSubmit);
				//CreateLead createLead1 = new CreateLead();
		//
		//String companyName  = createLead1.createLead();
		
		WebElement companyName1 = locateElement("id", "viewLead_companyName_sp");		
		String companyNametext = companyName1.getText();
		//companyNametext
		int beginIndex = companyNametext.indexOf('(');
		int endIndex = companyNametext.indexOf(')');
		
		String companyID = companyNametext.substring(beginIndex+1, endIndex);

		System.out.println(companyID);
		
		System.out.println("Create Lead");
		
		closeBrowser();

			}
	//@Test
	/*public String getCompanyID(SeMethods se)
	{
		
		
		//SeMethods se = new SeMethods();
		se.startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement user = se.locateElement("id", "username");
		se.type(user, "DemoSalesManager");
		
		WebElement pwd = se.locateElement("id", "password");
		se.type(pwd, "crmsfa");
		
		WebElement login = se.locateElement("class", "decorativeSubmit");
		se.click(login);
		
		WebElement crm = se.locateElement("link", "CRM/SFA");
		se.click(crm);	
		
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);
		
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, "TestLeaf");
		
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, "Sachin st");
		
		WebElement lastName = locateElement("id", "createLeadForm_lastName");
		type(lastName, "P");
		
		WebElement submitButton = se.locateElement("id", "createLeadForm_companyName");
		se.type(submitButton, "TestLeaf");
		
		WebElement smallSubmit = locateElement("class", "smallSubmit");
		click(smallSubmit);
		
		WebElement companyName1 = locateElement("id", "viewLead_companyName_sp");		
		String companyNametext = companyName1.getText();
		//companyNametext
		int beginIndex = companyNametext.indexOf('(');
		int endIndex = companyNametext.indexOf(')');
		
		String companyID = companyNametext.substring(beginIndex+1, endIndex);

		//System.out.println(companyID);

		
		return companyID ;
		
		

		

	}
	
*/	
	
	}


