package com.registration.action;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 49edd69c02a89d8dd0528c0558a2674f4ac0d978
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.vo.UserRegistorInfo;

@Component("user")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven{
	private UserManager um;
	private UserRegistorInfo info = new UserRegistorInfo();
<<<<<<< HEAD
	private List<User> users;
=======
>>>>>>> 49edd69c02a89d8dd0528c0558a2674f4ac0d978
	
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
<<<<<<< HEAD
	
	public String list() {
		users = um.getUsers();
		return "list";
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
=======

	public UserRegistorInfo getInfo() {
		return info;
	}

	public void setInfo(UserRegistorInfo info) {
		this.info = info;
	}

	public Object getModel() {
		return info;
>>>>>>> 49edd69c02a89d8dd0528c0558a2674f4ac0d978
	}

}
