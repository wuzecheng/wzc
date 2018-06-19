package cn.houserent.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.houserent.dao.UserDao;
import cn.houserent.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}
}
