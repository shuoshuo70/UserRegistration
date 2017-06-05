package com.registration.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.vo.UserRegistorInfo;

@Component("userAction")
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
	}

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		if(um.existUser(u)) return "fail";
		um.add(u);
		return "success";
	}
	
	public String list() {
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

	@Resource(name="userRegistorInfo")
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
