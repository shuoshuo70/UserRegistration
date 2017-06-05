package com.registration.service;

import java.util.List;

import com.registration.model.User;


public interface UserManager {

	public abstract boolean existUser(User u) throws Exception;

	public abstract void add(User u) throws Exception;

	public abstract List<User> getUsers();
<<<<<<< HEAD
	
	public abstract User loadById(int id);
=======
>>>>>>> 601f57bcf35fc05414395f44ff2da8f66d0f2e47

}