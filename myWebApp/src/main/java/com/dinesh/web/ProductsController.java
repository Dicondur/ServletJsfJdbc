package com.dinesh.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dinesh.web.dao.ProductDao;
import com.dinesh.web.model.Product;


/**
 * Servlet implementation class ProductsController
 */
public class ProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Get from query parameter
		int prodID = Integer.parseInt(request.getParameter("productID")); //using query parameter
		
		
		
		//Get from DAO object
		ProductDao productDao = new ProductDao();
		
		//Create a model obj
		Product product1 = new Product();
		
		//Assign model object for the query parameter
		product1 = productDao.getProduct(prodID);
		
		//post result to another page can be redirect or request dispatcher
		//using request dispacther
		RequestDispatcher rd =request.getRequestDispatcher("Products.jsp");
		
		//Set request payload 
		request.setAttribute("product", product1);
		rd.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
