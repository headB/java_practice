package beetle.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	
	//这个是用于返回一个有效的mybatis连接池
	
	//所以，这里，构造器就私有化了。！
	
	private MybatisUtil() {
		
	}
	
	
	//类第一次加载到内存的时候，就运行获取mybatis
	
	//静态代码成功创建了mybatis之后，就设置到成员变量里面
	
	//是啊，上面这个变量也是必须是类成员的啊~
	
	private static SqlSessionFactory factory = null;
	
	static {
		
		try {
		 factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
		
		//然后这里设置一个方法返回这个mybatic连接池对象
		public static SqlSession getConn() {		
			//然后返回一个需要手动提交事务的连接池
			return factory.openSession();
			
		}
		
	
}
