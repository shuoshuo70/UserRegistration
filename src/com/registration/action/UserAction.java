package com.registration.action;

import java.util.List;

<<<<<<< HEAD
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
=======

>>>>>>> a0196abeb35b3d9c3455d55c110c945669150e65

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.vo.UserRegistorInfo;
<<<<<<< HEAD

@Component("user")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven{
	private UserManager um;
	private UserRegistorInfo info = new UserRegistorInfo();
	private List<User> users;
	private User user;
	
	public UserManager getUm() {
		return um;
	}
	
	@Resource(name="userManager")
	public void setUm(UserManager um) {
		this.um = um;
=======


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
>>>>>>> a0196abeb35b3d9c3455d55c110c945669150e65
	}

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
<<<<<<< HEAD
		if(um.existUser(u)) return "fail";
		um.add(u);
=======
		if(userManager.existUser(u)) return "fail";
		userManager.add(u);
>>>>>>> a0196abeb35b3d9c3455d55c110c945669150e65
		return "success";
	}
	
	public String list() {
<<<<<<< HEAD
		users = um.getUsers();
		return "list";
	}

	public String load() {
		user = um.loadById(info.getId());
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
	
=======
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

>>>>>>> a0196abeb35b3d9c3455d55c110c945669150e65
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
