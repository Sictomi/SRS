package service;

import model.User;

import java.sql.SQLException;

import dao.UserDao;
import daoImp.UserDaoImpl;

public class UserService {
    UserDao userDao=new UserDaoImpl();
	public Boolean login(User user) throws SQLException {
		//System.out.println(user.getPassword()+" "+user.getSsn());
		//userDao.findBySsn("001");
		return userDao.findBySsn(user.getSsn()).getPassword().equals(user.getPassword())?true:false;
		
	}
	
}
