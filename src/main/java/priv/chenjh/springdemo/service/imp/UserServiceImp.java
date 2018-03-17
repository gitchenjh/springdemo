package priv.chenjh.springdemo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.chenjh.springdemo.dao.IUserDao;
import priv.chenjh.springdemo.entity.User;
import priv.chenjh.springdemo.service.IUserService;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	private IUserDao userDao;

	public User getUserById(int id) {
		return this.userDao.selectByPrimaryKey(id);
	}
}
