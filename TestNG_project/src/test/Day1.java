package test;

import org.testng.annotations.Test;

public class Day1 {
	@Test(groups={"regressionTest","smokeTest"})
	public void Demo()
	{
		System.out.println("hello");
	}
	@Test(groups={"regressionTest","smokeTest"})
	public void SecondTest()
	{
		System.out.println("bye");
	}

}
