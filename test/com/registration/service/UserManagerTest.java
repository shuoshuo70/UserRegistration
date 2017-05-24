package com.registration.service;

import org.junit.Assert;
import org.junit.Test;

import com.registration.model.User;
import com.registration.service.impl.UserManagerImpl;

public class UserManagerTest {

	@Test
	public void testExist() throws Exception {
		UserManager um = new UserManagerImpl();
		User u = new User();
		u.setUsername ("a");
		boolean exists = um.existUser(u);
		Assert.assertEquals(true, exists);
	}
	
	@Test
	public void testAdd() throws Exception {
		UserManager um = new UserManagerImpl();
		User u = new User();
		u.setUsername ("b");
		u.setPassword("b");
		boolean exists = um.existUser(u);
		if(!exists) {
			um.add(u);
			Assert.assertEquals(true, um.existUser(u));
		} else {
			Assert.fail("not added!");
		}
	}
	

}
