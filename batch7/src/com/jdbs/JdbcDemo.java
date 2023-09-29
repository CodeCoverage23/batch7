package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch","root","pass3421");
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs= stmt.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println(rs.getInt("idstudent")+" "+rs.getString("studentname")+" "+rs.getString("studentage")+" "+rs.getString("studentskilllanguage"));
		}
		
		conn.close();

	}

}
