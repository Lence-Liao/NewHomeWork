package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Model.Userlogin;

public class implUserlogin implements UserloginDao{
	public  void addlogin(Userlogin userlogin) {		
		Connection conn=DbConnection.getDB();
		String sql="insert into login (username,password) values(?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userlogin.getUsername());
			ps.setString(2, userlogin.getPassword());
			ps.executeUpdate();
		} catch (SQLException ex) {		
			Logger.getLogger(impldog.class.getName()).log(Level.SEVERE, null, ex);
		}				
	}

	@Override
	public boolean query(String username) {
		boolean x=false;
		Connection conn=DbConnection.getDB();
		String sql="select * from login where username=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				x=true;
				JOptionPane.showMessageDialog(null,"帳號重複重新輸入");
				
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}								
		return x;
	}
	@Override
	public boolean query(String username, String password) {
		boolean x=false;
		Connection conn=DbConnection.getDB();
		String sql="select * from login where username=? and password=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				x=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return x;
	}
}
