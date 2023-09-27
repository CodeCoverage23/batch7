package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7", "root", "@123456");

		// get statement object to send the requirement
		Statement stmt = con.createStatement();

		// got result
		ResultSet rs = stmt.executeQuery("select * from gold");

		while (rs.next()) {
			System.out.println(rs.getInt("id") + "	" + rs.getString("name") + "	" + rs.getString("quantity"));
		}

		// close the connection
		con.close();
	}

}
