package grotechminds_sign_up_testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer
{
	int initial_count=0;
	int retry_counts=2;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initial_count<retry_counts)
		{
			initial_count++;
			return true;
		}
		return false;
	}

}
