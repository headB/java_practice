package beetle.web.webservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beetle.service.impl.TestServiceImpl;


@WebServlet("/lizhixuan")
public class TestServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		
		System.out.println("hello world!");
		
		//尝试直接new一个service类进来
		
		TestServiceImpl t1 = new TestServiceImpl();
		
		t1.save();
		
	}

}
