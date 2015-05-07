package soaPackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import session.AuctionPortalUtil;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
			throws ServletException, java.io.IOException{
		try{
			UserBean user=new UserBean();
//			user.setUserId(1);
			user.setEmailId(httpRequest.getParameter("username"));
			user.setUserPassword(httpRequest.getParameter("password"));
						
			SessionFactory sessionFactory=AuctionPortalUtil.getSessionFactory();
			
			user=UserDAO.login(user, sessionFactory);
			
			if(user.isValid()){
				HttpSession session=httpRequest.getSession(true);
				session.setAttribute("currentSessionUser", user);
				httpResponse.sendRedirect("userLogged.jsp");
			}
			else
				httpResponse.sendRedirect("invalidLogin.jsp");
		}
		
		catch(Throwable theException){
			System.out.println(theException);
		}
	}
}
