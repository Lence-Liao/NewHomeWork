package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Userlogin;

public class implUserlogin {
	public  void addlogin(String username,String password) {
		
		Connection conn=DbConnection.getLogin();
		String sql="insert into login (username,password) values(?,?)";
		Userlogin ul=new Userlogin(username,password); 
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, ul.getUsername());
			ps.setString(2, ul.getPassword());
			ps.executeUpdate();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(impldog.class.getName()).log(Level.SEVERE, null, ex);
		}				
	}
}
