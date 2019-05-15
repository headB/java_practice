package beetle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;



//import com.mysql.jdbc.Driver;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//准备来测试JDBC！
	@Test
	public void testJDBC() throws SQLException, ClassNotFoundException {
		
		//DriverManager.registerDriver(new Driver());
		//jia lian yuzhi shi
//		1加载
		Class.forName("com.mysql.jdbc.Driver");
//		2获取连接对象
		Connection conn =   DriverManager.getConnection("jdbc:mysql://192.168.113.1:3306", "root", "Kumanxuan@gzitcast123");
//		3预编译
		Statement st = conn.createStatement();
//		4执行SQL
		
//		5.关闭两个链接
		
		st.close();
		conn.close();
		
		
		
		System.out.println(conn);
		
//		Iusb b1 =new Beetle();
//		b1.beetle();		
	}	
	}
 interface Iusb{
	
	void beetle();
	
}
 class Beetle implements Iusb{

	@Override
	public void beetle() {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
	}
	
	public void test() {
		System.out.println("I am man!");
	}
	
}
