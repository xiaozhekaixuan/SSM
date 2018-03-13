package com.test.ssm.role.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.ssm.role.mapper.RoleMapper;
import com.test.ssm.role.model.Role;
import com.test.ssm.role.service.RoleService;

@Service(value="roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

	@Resource
    public RoleMapper roleMapper;
	
	@Override
	public List<Role> findAllRole() {
		List<Role> findAllRole = roleMapper.findAllRole();
		return findAllRole;
	}

}
