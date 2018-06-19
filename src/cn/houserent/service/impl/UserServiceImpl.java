package cn.houserent.service.impl;

import cn.houserent.dao.UserDao;
import cn.houserent.entity.User;
import cn.houserent.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

}
