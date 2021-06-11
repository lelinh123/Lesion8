package com.codefresher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefresher.model.Users;
import com.codefresher.repository.UserRepository;
import com.codefresher.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Users saveUser(Users users) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
	}

}
