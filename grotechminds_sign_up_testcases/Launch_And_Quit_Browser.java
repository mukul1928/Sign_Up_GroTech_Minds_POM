package grotechminds_sign_up_testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_And_Quit_Browser extends Listeners_Class
{
	@BeforeMethod
	public void Launch_Browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/user-account/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void Quit_Browser()
	{
		//driver.close();
	}
}
