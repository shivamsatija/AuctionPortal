package franchise;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FranchiseLoginServlet
 */
@WebServlet("/FranchiseLoginServlet")
public class FranchiseLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FranchiseDetails franchiseDetails=new FranchiseDetails();
		String franchiseSignUpLogin=new String();
		franchiseSignUpLogin=request.getParameter("franchiseSignUpLogin");
		
		//Existing User
		if(franchiseSignUpLogin.equalsIgnoreCase("Franchise Login")){
			franchiseDetails.setFranchiseId(request.getParameter("franchiseId"));
			franchiseDetails.setPassword(request.getParameter("franchisePassword"));
			franchiseDetails=FranchiseDAO.login(franchiseDetails);
			if(franchiseDetails==null)
				response.sendRedirect("invalidLogin.jsp");
			else if(franchiseDetails.getPassword().compareTo(request.getParameter("franchisePassword"))==0){
				HttpSession session=request.getSession(true);
				session.setAttribute("FranchiseSessionUser", franchiseDetails);
				response.sendRedirect("FranchiseLogged.jsp");
			}
//				response.sendRedirect("FranchiseLogged.jsp");
			else
				response.sendRedirect("invalidLogin.jsp");
			
		}
		
		//New User
		else if(franchiseSignUpLogin.equalsIgnoreCase("Franchise SignUp")){
			franchiseDetails.setFranchiseId(request.getParameter("franchiseId"));
			franchiseDetails.setFranchiseTeamName(request.getParameter("franchiseTeamName"));
			franchiseDetails.setFranchiseOwner(request.getParameter("franchiseOwner"));
			franchiseDetails.setFranchiseCoach(request.getParameter("franchiseCoach"));
			franchiseDetails.setAmountLeft(0);
			franchiseDetails.setAmountSpent(0);
			franchiseDetails.setPassword(request.getParameter("franchisePassword"));
			franchiseDetails=FranchiseDAO.signUp(franchiseDetails);
			if(franchiseDetails!=null){
				HttpSession session=request.getSession(true);
				session.setAttribute("FranchiseSessionUser", franchiseDetails);
				response.sendRedirect("FranchiseLogged.jsp");
			}
				
			else
				response.sendRedirect("invalidLogin.jsp");
		}
		
	}

}
