package com.skilldistiller.cart.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.skildistillery.cart.data.Cart;
import com.skildistillery.cart.data.Product;
import com.skildistillery.cart.data.ProductDAO;
import com.skildistillery.cart.data.ProductDAOMapImpl;

/**
 * Servlet implementation class ShoppingCartServlet
 */
//@WebServlet("/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet() {
        super();
    }
    
    private ProductDAO dao = new ProductDAOMapImpl();
//    private Cart cart;
//    private List<Product> cart = new ArrayList<>();
    
    @Override
    public void init() {
    	dao = new ProductDAOMapImpl();
//    	cart = new Cart();
    	
    }
//			@Override
//			public Product getProductByUPC(long upc) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public List<Product> getALLProducts() {
//				// TODO Auto-generated method stub
//				return null;
//			}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String prod =request.getParameter("product");
		HttpSession session = request.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		if(cart == null) {
			cart = new Cart();
			session.setAttribute("cart", cart);
		}

		String clearIt = request.getParameter("clearCart");
		if(clearIt != null) {
			session.invalidate();
		}
		
//		String result = "";
		try {
		long upc = Long.parseLong(prod);
		Product p = dao.getProductByUPC(upc);
		if(p != null) {
		cart.add(p);
		request.setAttribute("product", p);
		
//		result = p.toString() + " added to cart";
		}
		}
		catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		List<Product> inv = dao.getALLProducts();
//		request.setAttribute(arg0, arg1);
		request.setAttribute("inventory", inv);
//		request.setAttribute("cart", cart);
		request.getRequestDispatcher("/cart.jsp").forward(request, response); 
		
//		result +="<hr><h3>Your Cart:</h3>" + cart;
//		
//		PrintWriter page = response.getWriter();
//		page.println("<html><head><title>Cart</title></head>");
//		page.println("<body>");
//		page.println(result);
//		page.println("</body></html>");
		
		
//		page.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
