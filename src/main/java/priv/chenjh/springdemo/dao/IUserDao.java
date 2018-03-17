package priv.chenjh.springdemo.dao;

import priv.chenjh.springdemo.entity.User;

public interface IUserDao {

    User selectByPrimaryKey(Integer id);
}