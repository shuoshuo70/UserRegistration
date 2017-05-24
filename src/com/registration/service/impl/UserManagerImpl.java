package com.registration.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.registration.dao.UserDao;
import com.registration.dao.impl.UserDaoImpl;
import com.registration.model.User;
import com.registration.service.UserManager;

@Component("userManager")
public class UserManagerImpl implements UserManager {
	UserDao userDao = new UserDaoImpl();
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.registration.service.impl.UserManager#existUser(com.registration.model.User)
	 */
	public boolean existUser(User u) throws Exception{
		return userDao.loadByName(u.getUsername()) != null;
	}
	
	/* (non-Javadoc)
	 * @see com.registration.service.impl.UserManager#add(com.registration.model.User)
	 */
	public void add(User u) throws Exception{
		userDao.save(u);
	}
}
