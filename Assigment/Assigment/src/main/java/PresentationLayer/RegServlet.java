package PresentationLayer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BussinessLayer.BussinessComponents.EntitiesBUS.UsersBus;
import BussinessLayer.BussinessComponents.UtilitiesData.sendMail;
import BussinessLayer.BussinessEntities.Users;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersBus us=new UsersBus();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("/view/function/reg.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");		
		response.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
        String passwd=request.getParameter("passwd");
        String fullname=request.getParameter("fullname");
        String email=request.getParameter("email");
      try {
		HashMap<Object, String>error=us.sendError(username, passwd);
		if(!error.isEmpty()) {
			 Users u=new Users(username, passwd,fullname, email, false);
		      
				if(us.addToDB(u)>0) {
			    
				request.setAttribute("reg", "alert alert-success");
				request.setAttribute("reg_message", "Tạo tài khoản thành công");				
				request.getRequestDispatcher("/view/function/reg.jsp").forward(request, response);			
				return;
				}else {
					request.setAttribute("reg", "alert alert-danger");
					request.setAttribute("reg_message", "Tạo tài khoản thất bại");
					request.setCharacterEncoding("utf-8");
					request.getRequestDispatcher("/view/function/reg.jsp").forward(request, response);
				}
			
		}else {
			for(Map.Entry<Object, String> x:error.entrySet()) {
				request.setAttribute(x.getKey().toString(), x.getValue());
			}
		}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     //   String result = new String(fullname.getBytes(), StandardCharsets.UTF_8);
       
		
		doGet(request, response);
	}

}
