

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

// 多个参数的post案例
C:\Users\Administrator>curl -X POST "http://localhost:8080/user/getUsersByAgeRange" -H "Content-Type: application/x-www-form-urlencoded" -H "Accept: application/json" -d "ageStart=18&ageEnd=30"

[{"id":1,"name":"张三","email":"zhangsan@example.com","age":25},{"id":2,"name":"李四","email":"lisi@example.com","age":30},{"id":3,"name":"王五","email":"wangwu@example.com","age":28},{"id":5,"name":"钱七","email":"qianqi@example.com","age":22},{"id":6,"name":"孙八","email":"sunba@example.com","age":27},{"id":8,"name":"吴十","email":"wushi@example.com","age":29},{"id":9,"name":"郑一","email":"zhengyi@example.com","age":26},{"id":11,"name":"冯三","email":"fengsan@example.com","age":24},{"id":13,"name":"褚五","email":"chuwu@example.com","age":23},{"id":15,"name":"蒋七-JJP","email":"jiangqi@example.com","age":28},{"id":17,"name":"韩九","email":"hanjiu@example.com","age":27},{"id":18,"name":"杨十","email":"yangshi@example.com","age":30},{"id":19,"name":"朱一","email":"zhuyi@example.com","age":25},{"id":20,"name":"秦二","email":"qiner@example.com","age":29},{"id":22,"name":"许四","email":"xusi@example.com","age":26},{"id":24,"name":"吕六","email":"lvliu@example.com","age":24}]





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
 