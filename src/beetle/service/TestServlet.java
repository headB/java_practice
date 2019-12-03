package beetle.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @author lizhixuan
 *
 */



	
	
	//需要去设置web.xml的metadata-complete="false"

@WebServlet("/beetle123")
public class TestServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		System.out.println("我就是我,是需要初始化的我!");
		
	}
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, res);
		System.out.println("six six six");
		
		
		
		req.setAttribute("six", "six! 51凡66666！");
		
	
		//尝试去玩最后一个，关于map的，因为，我真的没有什么关于map的操作经验啊~。
		
		Map<String, String[]> map1 =  req.getParameterMap();
//		
//		System.out.println(map1);
		System.out.println(Arrays.toString(map1.get("name")));
		
	
		//尝试获取键值对
		
		Set<Entry<String, String[]>> s1 = map1.entrySet();
		
		for(Entry<String, String[]> x1:s1) {
			System.out.println(x1.getKey());
			System.out.println(Arrays.toString(x1.getValue()));
		}
		
		//然后转发请求
		req.getRequestDispatcher("/NewFile.jsp").forward(req, res);
		
//		System.out.println(s1);
		
		//顺便练习一下反射
		//Class.forName
		
		//然后如何查看方法呢？我意思是打印所有方法
		Class test1 = s1.getClass();
		
		Method[] m1 = test1.getMethods();
		
		for(Method m2:m1) {
//			System.out.println(m2);
		}

		//然后尝试返回啦。！
		
		
		//这个，如果需要返回输出流，有两种方法，但是只能使用其中一种来返回
//		ServletOutputStream  o1  =  res.getOutputStream();
//		o1.print("six six six!");
		
		//设置http的标准页面
		
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter p1 = res.getWriter();
		p1.write("s哈哈哈!");
		
		
		
		
	}
	
}



