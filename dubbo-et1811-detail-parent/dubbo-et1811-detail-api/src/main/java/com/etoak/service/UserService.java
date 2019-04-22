package com.etoak.service;

import java.util.List;

import com.etoak.bean.User;

public interface UserService {

	List<User> queryUser(User user);
}
