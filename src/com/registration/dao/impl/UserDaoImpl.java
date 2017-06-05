package com.registration.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.registration.dao.UserDao;
import com.registration.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;

	public void save(User u) {
		hibernateTemplate.save(u);
	}

	public User loadByName(String name) {
		List<User> list = (List<User>)hibernateTemplate.find("from User u where u.username = '" + name + "'");
		if(list == null) return null;
		return list.get(0);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public List<User> getUsers() {
		return (List<User>)hibernateTemplate.find("from User");
	}

	public User loadById(int id) {
		return (User)this.hibernateTemplate.load(User.class, id);
	}

}
