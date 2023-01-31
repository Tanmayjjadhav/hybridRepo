package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	//decalaration for all the WebElements present on Users page

	@FindBy(linkText="Users") private WebElement Userstab;
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewuserButton;


	//initialization

	public UsersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}




	//utilzation
	public WebElement getUserstab() {
		return Userstab;
	}

	public WebElement getCreateNewuserButton() {
		return createNewuserButton;
	}



}