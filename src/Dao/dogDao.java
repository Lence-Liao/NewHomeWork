package Dao;

import java.util.List;

import Model.adopDog;

public interface dogDao {
	//新增
	void add(String kind,int year,String sex,String per,String vac,String waf);
	void add(adopDog ad);
	//收尋
	String quely1();
	List<adopDog >quely2();//沒做好
	//更新
	adopDog quelyId(int id);
	
	void update(adopDog a);
	
	//刪除
	void delete(int id);
	
	
	
	
	
	
}
