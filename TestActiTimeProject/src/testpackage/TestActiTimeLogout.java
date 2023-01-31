package testpackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

@Listeners(CustomListner.class)
public class TestActiTimeLogout extends BaseTest {

	@Test
	public void logout() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		HomePage hp = new HomePage(driver);
		hp.logOutmethod();
	}
	
}
