package com.registration.dao;

import java.util.List;

import com.registration.model.User;

public interface UserDao {
	public void save(User u);
	public User loadByName(String name);
	public List<User> getUsers();
	public User loadById(int id);
}
