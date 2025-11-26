package org.kunggea.demo.service;

import java.util.List;

import org.kunggea.demo.pojo.User;

public interface UserService {
	// service层会出现大量业务，所以用接口来限定函数
	// controller不用
	// mapper本身就是接口了，xml中写具体的sql
	
	 public List<User> getAllUsers();
	 public User getUserById(Integer id);
	 public User getUserByName(String name);
	 public List<User> getUsersByAge(Integer age);
	 public List<User> getUsersByAgeRange(Integer ageStart, Integer ageEnd);
	 public void addUser(User user);

}
