package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		
		
	}	
	
	public static Connection getDB() {
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/adoption";
		String user="root";
		String password= "duncan04";
		//String sql="insert into dog(kind,year, sex,per, vac,waf)value()";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection(url, user, password);
			
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}	
	public static Connection getLogin(){
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="duncan04";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}			
		return conn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
