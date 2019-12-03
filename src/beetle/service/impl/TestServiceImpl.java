package beetle.service.impl;

import beetle.service.ITestService;
import beetle.sims.dao.impl.StudentDAOImpl;
import org.junit.Test;

public class TestServiceImpl implements ITestService {
	
	//然后就可以实例化一个DAO对象了。
	
	 StudentDAOImpl s1 = new StudentDAOImpl();
	 
	 

	@Override
	public void save() {
		// TODO Auto-generated method stub
		s1.addUser();
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		s1.listUser();
		
	}

	
	}
	
	
	
