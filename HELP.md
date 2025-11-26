

一定要安装ai   Copilot
不是eclipse真的就是傻子


curl来模拟post请求
curl -X POST -d "age=29" http://localhost:8080/user/getUserByAge


C:\Users\Administrator>curl -X POST -d "age=29" http://localhost:8080/user/getUserByAge
[{"id":8,"name":"吴十","email":"wushi@example.com","age":29},{"id":20,"name":"秦二","email":"qiner@example.com","age":29}]
C:\Users\Administrator>
 
C:\Users\Administrator>curl -X POST -d "age=33" http://localhost:8080/user/getUserByAge
[{"id":7,"name":"周九","email":"zhoujiu@example.com","age":33},{"id":21,"name":"尤三","email":"yousan@example.com","age":33}]
C:\Users\Administrator>curl -X POST -d "age=31" http://localhost:8080/user/getUserByAge
[{"id":10,"name":"王二","email":"wanger@example.com","age":31},{"id":23,"name":"何五","email":"hewu@example.com","age":31}]



eclipse默认不保存必须手动报错才会修改磁盘的代码  sourcetree Git才能看到改变 真不如IDEA



垃圾eclipse下载网络文件都不行
只能改为本地引用了


mybatis-3-mapper。dtd 

 这个离线文件很重要的一定要从run成功的IDEA项目里复制出来
 
 
 xxx-mapper.xml中需要这样来引用本地文件才行
 
 <?xml version="1.0" encoding="UTF-8"?>
<!-- <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd"> -->
    
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Configuration 3.0//EN" "../mybatis-3-mapper.dtd" >

<mapper namespace="org.kunggea.demo.mapper.UserMapper">

    <!-- 查询所有用户 -->
    <select id="selectAllUsers" resultType="org.kunggea.demo.pojo.User">
        SELECT *
        FROM users
    </select>

</mapper>
 
 
 
 
 
 写作接口的原因
 public interface UserService {
	// service层会出现大量业务，所以用接口来限定函数
	// controller不用
	// mapper本身就是接口了，xml中写具体的sql
	
	 public List<User> getAllUsers();
	 public User getUserById(Integer id);

}
 