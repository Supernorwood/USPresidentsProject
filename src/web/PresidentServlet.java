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


//@WebServlet("/TermNumber")
public class PresidentServlet extends HttpServlet {
	private PresidentDAO presidentDAO;
	
	@Override
	public void init() throws ServletException {
		presidentDAO = new PresidentFileDAO(getServletContext());
	}
	/*
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("presidents", presidentDAO.getAllPresidents());
		//request.setAttribute("president",new President("man", 2, "timmyParty", "Loves pickels", "1123231"));
		//request.getRequestDispatcher("/presidentWeb.jsp").forward(request, response);
		request.setAttribute("presidents", presidentDAO.getAllPresidents());
		request.getRequestDispatcher("/presidentWeb.jsp").forward(request, response);
	
	} */
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		int termNumber = 1;
		try{
			termNumber = Integer.parseInt(request.getParameter("termNumber"));
		} catch(Exception e) {
			termNumber = 1;
		}
		
		President president;
		//error checking for wrong number
		if(termNumber>0&&termNumber<46) {
			president = presidentDAO.getPresidentByTerm(termNumber);
		}else {
			president = null;
		}
		
		
		
		if(president != null) {
			request.setAttribute("president", president);
			
			request.getRequestDispatcher("/presidentWeb.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}

}
