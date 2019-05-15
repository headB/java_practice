package beetle;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {
	
	
	@Test
	public void test2ConnectMysql() throws IOException {
		
	//获取配置信息，也就是连接数据库的四要素
	SqlSessionFactory factory  = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
	//然后就开始连接,并且是手动设置事务
	SqlSession s1 = factory.openSession();
	
	//创建一个有故事的对象
	//User user = new User(null,"婷婷",18);
	
	//然后是插入操作
	//s1.insert("beetle.UserMapper.save",user);
	
	//然后我还想查询的啦。！
//	List<User> users =  s1.selectList("beetle.UserMapper.queryAll");
	System.out.println(s1.selectList("beetle.UserMapper.queryAll"));
	
	//然后就是提交事务
	s1.commit();
	s1.close();
	
		
	}
	

}
