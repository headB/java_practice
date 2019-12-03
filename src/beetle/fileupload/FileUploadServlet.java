package beetle.fileupload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/upload")
public class FileUploadServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		
		String s1 = "png;jpeg;gif";
		
		System.out.println(Arrays.asList(s1.split(";")).contains("jpeg"));
		
		 List<String> s2 = new ArrayList<>();
		 
		 String[] s3 = {"4","5"};
		 char s11 = 'A';
		 
	}

}
