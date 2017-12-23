package pagetests;

import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName) {
		new MyHomePage()
		.clickLeadTab()
		.clickCreateLead();
		
	}
}
