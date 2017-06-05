package com.registration.dao;

import java.util.List;

import com.registration.model.User;

public interface UserDao {
	public void save(User u);
	public User loadByName(String name);
	public List<User> getUsers();
<<<<<<< HEAD
	public User loadById(int id);
=======
>>>>>>> 601f57bcf35fc05414395f44ff2da8f66d0f2e47
}
