package com.registration.action;

import java.util.List;



import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.vo.UserRegistorInfo;


public class UserAction extends ActionSupport implements ModelDriven{
	private UserManager userManager;
	private UserRegistorInfo info = new UserRegistorInfo();
	private List<User> users;
	private User user;
	
	public UserManager getuserManager() {
		return userManager;
	}
	
	public void setuserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		if(userManager.existUser(u)) return "fail";
		userManager.add(u);
		return "success";
	}
	
	public String list() {
		users = userManager.getUsers();
		return "list";
	}
	
	public String load() {
		user = userManager.loadById(info.getId());
		return "load";
	}
	public UserRegistorInfo getInfo() {
		return info;
	}

	public void setInfo(UserRegistorInfo info) {
		this.info = info;
	}

	public Object getModel() {
		return info;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setList(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
