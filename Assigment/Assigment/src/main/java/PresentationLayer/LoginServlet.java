package PresentationLayer;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BussinessLayer.BussinessComponents.EntitiesBUS.UsersBus;
import BussinessLayer.BussinessComponents.UtilitiesData.Cookies;
import BussinessLayer.BussinessComponents.UtilitiesData.SHA_224;
import BussinessLayer.BussinessEntities.Users;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public  static Users u=null;
    /**
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet(){
        super();
  
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=Cookies.getCookie("username", request);
		String password=Cookies.getCookie("passwd", request);
		System.out.println(username);
		System.out.println(password);
		request.setAttribute("username", username);
		request.setAttribute("passwd", password);
		request.getRequestDispatcher("/view/function/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersBus userBus=new UsersBus();
		String username=request.getParameter("username");
		String pass=request.getParameter("passwd");
		String password=SHA_224.SHA_224(request.getParameter("passwd"));
		int hours=request.getParameter("remember")==null?0:50;
         
		try {
			u=userBus.loGin(username, password);
			if(u!=null) {
				String extend[]= {"Login","Forgot Password","Registration","Log Out","Edit Profile"};
				request.setAttribute("login",extend);
				request.setAttribute("ten",userBus.loGin(username, password).getFullName());
				request.setCharacterEncoding("utf-8");
				Cookies.save("username", username, hours, response);
				Cookies.save("passwd", pass, hours, response);
		        request.setAttribute("message_alert", "alert alert-success");
		        request.setAttribute("message", "Đăng nhập thành công");
		        
		        try {
					Thread.sleep(1000);
					request.getRequestDispatcher("/view/function/login.jsp").forward(request, response);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		String extend[]= {"Login","Registration"};
		request.setAttribute("login",extend);
		 request.setAttribute("message_alert", "alert alert-danger");
	        request.setAttribute("message", "Đăng nhập thất bại");
	
		request.getRequestDispatcher("/view/function/login.jsp").forward(request, response);
		doGet(request, response);
		
	}

}
