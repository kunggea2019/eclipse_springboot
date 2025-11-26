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
	public int addUser(User user) {
		
		// 调用 Mapper 插入用户，接收影响行数（1=成功，0=失败）
	    int insertCount = userMapper.insertUser(user);
	    
	    // 校验插入结果，失败则抛出异常（可被全局异常处理器捕获返回友好提示）
	    if (insertCount != 1) {
	        throw new RuntimeException("用户插入失败，影响行数异常：" + insertCount);
	    }
	    
	    return insertCount;
	}
    
}
