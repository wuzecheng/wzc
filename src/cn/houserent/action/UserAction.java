package cn.houserent.action;

import cn.houserent.entity.User;
import cn.houserent.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private UserService user;

	public UserService getUser() {
		return user;
	}

	public void setUser(UserService user) {
		this.user = user;
	}

	
	public String add() {
		User u = new User();
		u.setId(23);
		u.setName("asg");
		u.setPassword("agh");
		
		user.save(u);
		return SUCCESS;
	}

}
