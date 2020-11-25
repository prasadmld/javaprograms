package com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url, username, password);
		String sql="insert into employee values (?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "Mahi");
		preparedStatement.setInt(3, 40000);
		preparedStatement.setString(4, "Hcl");
		int x=preparedStatement.executeUpdate();
		if(x==1)
		{
			System.out.println("Record inserted");
		}

}
}