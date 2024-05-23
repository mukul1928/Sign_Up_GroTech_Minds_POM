package grotechminds_sign_up_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up_Page 
{
	WebDriver driver;
	
	@FindBy(id="masterstudy-authorization-sign-up")
	WebElement sign_up;
	
	@FindBy(name="register_user_email")
	WebElement email;
	
	@FindBy(name="register_user_login")
	WebElement username;
	
	@FindBy(name="register_user_password")
	WebElement password;
	
	@FindBy(name="register_user_password_re")
	WebElement re_enter_password;
	
	@FindBy(xpath="(//span[@class='masterstudy-authorization__checkbox-wrapper'])[1]")
	WebElement click_checkbox;
	
	@FindBy(xpath="(//span[.='Sign Up'])[2]")
	WebElement click_on_Sign_Up_Button;
	
	public void click_sign_up()
	{
		sign_up.click();
	}
	
	public void enter_email()
	{
		email.sendKeys("mukulpandey89@gmail.com");
	}
	
	public void enter_username()
	{
		username.sendKeys("mukul_143");
	}
	
	public void enter_password()
	{
		password.sendKeys("Mukul1928@");
	}
	
	public void repeat_password()
	{
		re_enter_password.sendKeys("Mukul1928@");
	}
	
	public void checkbox()
	{
		click_checkbox.click();
	}
	
	public void sign_up_button()
	{
		click_on_Sign_Up_Button.click();
	}
	public Sign_Up_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
}
