package org.kunggea.demo.service;

import java.util.List;

import org.kunggea.demo.mapper.UserMapper;
import org.kunggea.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;
    
    /**
     * 获取所有用户列表
     * @return 用户列表
     */
	@Override
	public List<User> getAllUsers() {
		 return userMapper.selectAllUsers();
	}

	@Override
	public User getUserById(Integer id) {
		 return userMapper.selectUserById(id);
	}
    
    

	 
	@Override
	public User getUserByName(String name) {
	
		return userMapper.selectUserByName(name);
	}
    
    @Override
    public List<User> getUsersByAge(Integer age) {
    	return userMapper.getUsersByAge(age);
    }
    
    @Override
	public List<User> getUsersByAgeRange(Integer ageStart, Integer ageEnd) {
		return userMapper.getUsersByAgeRange(ageStart, ageEnd);
	}

	@Override
	public void addUser(User user) {
		
		userMapper.insertUser(user);
		
	}
    
}
