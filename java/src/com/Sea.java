package com;

import java.io.ObjectInputStream.GetField;
import java.sql.*;
import java.util.*;

public class Sea {
	public static void main(String args[]) throws SQLException {
		try{
		Class.forName( "com.mysql.jdbc.Driver");

	}catch (ClassNotFoundException e){
		e.getStackTrace();
	}
		Connection conn= null;
		String  url = "jdbc:mysql://localhost:8080/map";
		String username = "root";
		String password = "123456";
		conn =DriverManager.getConnection(url,username,password);
		Statement st = null;
		st  = conn.createStatement();
		String sql = "select id form mess";
		ResultSet rt = st.executeQuery(sql);
		List list = new ArrayList();
		while(rt.next()){
			System.out.println(rt.getString(1));
		}
		
		
		
		
		
		
		
		
		
		}
}
