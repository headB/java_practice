package beetle.web.webservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test_form")
public class FormTesetServlet extends HttpServlet {

	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		
		
		
		//测试调用表单
		
		//看看get和post是否在共用
		
		//设置编码预防乱码
		
		
		
		byte b2 = 4 ;
		byte b3 = 5;
		
		
		//原来这个地方呢，就是，get和post都是通杀的，意思就是，这个getParameter，
		//优先获取get的name，如果没有，就获取post过来的name，就是这个意思。
		System.out.println(req.getParameter("name"));
		
		req.getRequestDispatcher("/TestForm.jsp").forward(req, resp);
		
//		resp.sendRedirect(location);
		
		
	}
	
}
