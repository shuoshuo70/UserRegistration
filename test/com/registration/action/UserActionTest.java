package com.registration.action;

import static org.junit.Assert.*;

import org.junit.Test;

import com.registration.vo.UserRegistorInfo;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception{
		UserAction ua = new UserAction();
		UserRegistorInfo info = new UserRegistorInfo();
		info.setUsername("e");
		info.setPassword("e");
		info.setPassword2("e");
		ua.setInfo(info);
		String ret = ua.execute();
		assertEquals("sucess", ret);
	}

}
