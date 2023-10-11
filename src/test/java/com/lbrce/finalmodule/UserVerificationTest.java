package com.lbrce.finalmodule;
import org.testing.Assert;
import org.testing.annotations.Test;
public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true,uv.check("usha","usha@2020"));
		
	}
	public void testcase2()
	{
		Assert.assertEquals(true,uv.check("usha","usha@2020"));
		
	}
	@Test
	public void testcase3()
	{
		Assert.assertEquals(false,uv.check("usha1","usha@2020"));
		
	}
}
