package com.spring.test.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.spring.test.dto.UserDto;
import com.spring.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	public UserDto addUserBefore(UserDto userDto) {
		log.info("addUserBefore is running!");
		return userDto;
	}
	
	public UserDto addUserAfter(UserDto userDto) {
		log.info("addUserAfter is running!");
		return userDto;
	}
	
	public UserDto addUserAfterReturning(UserDto userDto) {
		log.info("addUserAfterReturning is running!");
		return userDto;
	}

	public UserDto addUserAround(UserDto userDto) {
		log.info("addUserAround is running!");
		return userDto;
	}
}