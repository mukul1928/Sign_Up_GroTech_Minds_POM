package grotechminds_sign_up_testcases;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import grotechminds_sign_up_page.Sign_Up_Page;
@Listeners(Listeners_Class.class)
public class TC_1_Grotech_Sign_Up extends Launch_And_Quit_Browser
{
@Test(retryAnalyzer=grotechminds_sign_up_testcases.Retry_Class.class)
public void sign_up()
{
	Sign_Up_Page a1=new Sign_Up_Page(driver);
	a1.click_sign_up();
	a1.enter_email();
	a1.enter_username();
	a1.enter_password();
	a1.repeat_password();
	a1.checkbox();
	a1.sign_up_button();
	
	Assert.assertEquals(driver.getTitle(), "User Account - GroTechMinds"); 
}
}
