package com.test.ssm.role.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.ssm.role.model.Role;
@Repository
public interface RoleMapper {
	
	List<Role> findAllRole();
}
