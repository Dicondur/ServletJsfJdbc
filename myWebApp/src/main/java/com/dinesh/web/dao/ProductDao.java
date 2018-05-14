package com.dinesh.web.dao;

import java.sql.*;
//import java.sql.DriverManager;

import com.dinesh.web.model.Product;

public class ProductDao {
	
	//Implement CRUD from db
public void Init() {
   

    // Load SQL Server JDBC driver and establish connection.
    System.out.print("Connecting to SQL Server ... ");
  
      
}
	
	//Get Product
	public Product getProduct(int ProductID) {
		Product p = new Product();
//		Get product from DB
//		a.getProductID(ProductID);
		
		//Check DAO can be removed
//		p.setProductID(101);
//		p.setName("Google ChromeCast");
//		p.setModel("2018 4kHDR");
		
		
		//connect to db
		 String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Product;user=sa;password=password";
		  try {
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	Connection connection = DriverManager.getConnection(connectionUrl);
		    	Statement st = connection.createStatement();
		    	
		    	ResultSet rs = st.executeQuery("select * from dbo.Product where productID=" + ProductID);
		    	System.out.println("Sucess");
		    	
		        if (rs.next()) {
		        	
		        	p.setProductID(rs.getInt("productID"));
		    		p.setName(rs.getString("name"));
		    		p.setModel(rs.getString("model"));
		        	}
		        }
		    
		    catch (Exception e) {
		        e.printStackTrace();
		        
		        }
		
		
		
		return p;	
	}
	
	//Set Product
	
	//Update Product
	
	//Search Product
	
	//Delete Product
}
