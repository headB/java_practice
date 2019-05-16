package beetle.sims.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import beetle.sims.dao.IStudentDao;
import beetle.sims.domain.Student;
import beetle.util.MybatisUtil;

//我记得了，这个位置呢，就是，负责规范增删改查的啦。！记得的啦。！
//这里是实现接口的方法

public class StudentDAOImpl implements IStudentDao {
	
	
	
	//然后大家各自的连接，都是潮州音乐，自己顾自己
	
	public void listUser() {
		
		SqlSession conn = MybatisUtil.getConn();
		List<Object> list = conn.selectList("beetle.mapper.UserMapper.queryAll");
		
		System.out.println(list);
		conn.close();
		
	}
	
	public void addUser() {
		SqlSession conn = MybatisUtil.getConn();
		
		Student s1 =  new Student("lizhixuan",18,null);
		
		conn.insert("beetle.mapper.UserMapper.save", s1);
		
		conn.commit();
		conn.close();
		
		
	}
	
	public static void main(String[] args) {
		
		new StudentDAOImpl().listUser();
		new StudentDAOImpl().addUser();
		
	}
	

}
