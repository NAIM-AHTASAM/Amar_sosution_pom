package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Amar_solution_pom.Amar_Solution_Home;
import utility.DriverSetup;

public class HomePageTest  extends DriverSetup{

	
	@Test
	public void TestHomePageTitle() {
		
		
		Amar_Solution_Home amarsolutionhomepage = new Amar_Solution_Home();
		
		driver.get("https://amarsolution.com/");
		assertEquals(driver.getTitle(), amarsolutionhomepage.HOME_PAGETITLE);
		
	}
	
	
}
