package jen;

import test.test;

import org.testng.Assert;
import org.testng.annotations.Test;
public class LearningTest extends test {

	@Test
	public void Sumit() throws InterruptedException {

		driver.get("http://www.google.com");
		Thread.sleep(5000);
		Assert.assertTrue(AssertTrueMethod("Google"));
		System.out.println("Sumit1");
		
	}


}
