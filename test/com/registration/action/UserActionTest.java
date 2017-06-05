package com.registration.action;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.registration.vo.UserRegistorInfo;
<<<<<<< HEAD
=======


import com.registration.vo.UserRegistorInfo;

>>>>>>> a0196abeb35b3d9c3455d55c110c945669150e65

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
	
	@Test
	public void testList() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserAction ua = (UserAction) ctx.getBean("user");
		ua.list();
		assertTrue(ua.getUsers().size() > 0);
	}

}
