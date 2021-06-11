package com.codefresher.service;

import java.util.List;

import com.codefresher.model.Users;

public interface UserService {
	List<Users> getAllUser();
	
	Users saveUser(Users users);
}
