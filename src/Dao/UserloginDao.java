package Dao;

import Model.Userlogin;

public interface UserloginDao {
	
	void addlogin(Userlogin ul);
	
	boolean query(String username);
	
	boolean query(String username,String password);
}
