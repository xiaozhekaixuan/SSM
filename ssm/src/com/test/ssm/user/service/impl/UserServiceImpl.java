package com.test.ssm.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.ssm.user.mapper.UserMapper;
import com.test.ssm.user.model.User;
import com.test.ssm.user.service.UserService;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
    public UserMapper userMapper;
	
	@Override
	public List<User> findAllUser() {
		List<User> findAllUser = userMapper.findAllUser();
		return findAllUser;
	}

}
