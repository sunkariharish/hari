package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC4test {
	
	@Test
	public void m1()
	{
		Reporter.log("t4 started",true);
	}
	
	public void m2()
	{
		Reporter.log("t4 m2 working",true);
	}
}
