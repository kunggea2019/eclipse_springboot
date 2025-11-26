package org.kunggea.demo.controller;

import java.util.List;

import org.kunggea.demo.pojo.User;
import org.kunggea.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

 
	@Autowired
	private UserService userService;

	/**
	 * 获取所有用户列表
	 * 
	 * @return 用户列表
	 */
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	
	
	// 在UserController中添加   alibaba ai工具过于好用  支持复制代码到eclipse中直接使用即可
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Integer id) {
	    return userService.getUserById(id);
	}
	
	@GetMapping("/getUserbyname/{name}")
	private User getUserbyname(@PathVariable String name) {
	    User user = userService.getUserByName(name);
	    return user;
	}
	
	@PostMapping("/getUserByAge")
	public List<User> getUserByAge(Integer age) {
	    // 这里可以根据需要实现按年龄查询用户的逻辑
		List<User> userList =	userService.getUsersByAge(age);
	    return userList; // 示例中返回null，实际应返回查询结果
	}
	
	// added in github 
	
	/**
	 * getUsersByAgeRange 
	 * @param ageStart
	 * @param ageEnd
	 * @return
	 */
	@PostMapping("/getUsersByAgeRange")
	public List<User> getUsersByAgeRange(Integer ageStart, Integer ageEnd) {
	    // 这里可以根据需要实现按年龄查询用户的逻辑
		List<User> userList =	userService.getUsersByAgeRange(ageStart, ageEnd);
	    return userList; // 示例中返回null，实际应返回查询结果
	}
	
	@PostMapping("/addUser")
	public String addUser(String name, Integer age) {
		
	    User user = new User();
	    user.setName(name);
	    user.setAge(age);
	    user.setEmail(name + "@qq.com"); // 示例中简单生成email
	    
	    int insertCount =userService.addUser(user);
	    
	    if (insertCount != 1) {
	        return "Failed to add user";
	    }
	    
	    return "User added successfully";
	}
	
	
}
