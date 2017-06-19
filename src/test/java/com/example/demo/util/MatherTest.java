package com.example.demo.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatherTest {

	/**
	 * Example of a simple test to exercise a utility we use for addition.
	 * @throws Exception
	 */
	@Test
	public void whenAddingTwoNumbersExpectCorrectSum() throws Exception {
		Mather m = new Mather();
		Assert.assertEquals("Hey we got a sum that didn't make sense.", 3, m.add(1, 2));
		Assert.assertEquals("Hey we got a sum that didn't make sense.", 1, m.add(-1, 2));
		Assert.assertEquals("Hey we got a sum that didn't make sense.", -3, m.add(-1, -2));
		Assert.assertEquals("Hey we got a sum that didn't make sense.", 0, m.add(0, 0));
	}
	
}
