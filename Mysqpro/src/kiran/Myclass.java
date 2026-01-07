package kiran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Myclass {
	
	static final String dburl="jdbc:mysql://localhost/nepal";
	static final String user="root";
	static final String pass="kiran";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 
		Connection con=null;
		Statement stmt=null;
		
		System.out.println("Connecting to Database");
		con=DriverManager.getConnection(dburl,user,pass);
		stmt=con.createStatement();
		
		System.out.println("Creat a database");
		String sql="insert into student(id,name,city) values(1,'kiran','ktm')";
	
		stmt.executeUpdate(sql);
		System.out.println("Table created!!");
		 
	}

}
