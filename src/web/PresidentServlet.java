package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.President;
import data.PresidentDAO;
import data.PresidentFileDAO;


@WebServlet("/TermNumber")
public class PresidentServlet extends HttpServlet {
	private PresidentDAO presidentDAO;
	
	@Override
	public void init() throws ServletException {
		presidentDAO = new PresidentFileDAO(getServletContext());
	}
       
   
//    public PresidentServlet() {
//        super();
//    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<President> n = presidentDAO.getAllPresidents();
//		request.setAttribute("presidents", presidentDAO.getAllPresidents());
//		request.getRequestDispatcher("/presidentWeb.jsp").forward(request, response);

		
		int termNumber = Integer.parseInt(request.getParameter("termNumber"));
		President president = presidentDAO.getPresidentByTerm(termNumber);
		if(president != null) {
			request.setAttribute("president", president);
			request.getRequestDispatcher("/presidnetWeb.jsp").forward(request, response);
		}
	}
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
