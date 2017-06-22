package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repo.DataRepo;
import com.example.demo.util.Data;
import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DataRepo myDataRepo;
	
	@Test
	public void whenSaveDataExpectToFindData() {
		// create it
		Data d = new Data();
		d.setCount(3);
		d.setName("Hello");
		
		// save it
		myDataRepo.save(d);
		
		// fetch it
		Data found = myDataRepo.findOne(d.getId());

		// we assert that the fetched entity has correct values
		Assert.assertEquals("Name saved incorrectly", d.getName(), found.getName());
		Assert.assertEquals("Count saved incorrectly", d.getCount(), found.getCount());
	}

}
