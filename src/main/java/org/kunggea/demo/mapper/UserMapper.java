package org.kunggea.demo.mapper;

import org.kunggea.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    
    /**
     * 查询所有用户
     * @return 用户列表
     */
//    @Select("SELECT id, name, email, age FROM users") // 注解放sql比較離譜了哦
//    List<User> selectAllUsers();
    
    
    List<User> selectAllUsers();
    
    
    /**
     * 根据ID查询用户
     * @param id 用户ID
     * @return 用户对象
     */
    User selectUserById(Integer id);


	User selectUserByName(String name);


	List<User> getUsersByAge(Integer age);
}
