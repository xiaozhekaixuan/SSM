package com.test.ssm.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.ssm.user.model.User;
@Repository
public interface UserMapper {
	
	List<User> findAllUser();
}
