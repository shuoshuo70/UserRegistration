package com.registration.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception{
		UserAction ua = new UserAction();
		ua.setUsername("e");
		ua.setPassword("e");
		String ret = ua.execute();
		assertEquals("sucess", ret);
	}

}
