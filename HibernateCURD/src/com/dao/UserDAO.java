package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dto.UserDto;
import com.utility.HbUtil;

public class UserDAO {
	static  Session session = null;
	static Transaction tx = null;
	public static  void userSave(UserDto user) {
		
		  session = HbUtil.getDBSession();
		  tx = session.beginTransaction();
		  
		  session.save(user);
		  System.out.println("user saved");
		  tx.commit();
		  System.out.println("user saved connection is closed ");
		  session.close();
		
	}
	
	public static  void userRead(int id) {
		
		  session = HbUtil.getDBSession();
		  tx = session.beginTransaction();
		   UserDto us = session.get(UserDto.class, id);
		
		   System.out.println("============");
		   System.out.println("userid "+us.getId());
		   System.out.println("username "+us.getName());
		   System.out.println("============");
		    
		  System.out.println("user reading completed !");
		  tx.commit();
		  System.out.println("user saved connection is closed ");
		  session.close();
		
	}
	
	// update method 
	
	public static  void userUpdate(String newName , int id) {
		
		  session = HbUtil.getDBSession();
		  tx = session.beginTransaction();
		   UserDto us = session.get(UserDto.class, id);
		   System.out.println("============");
		   System.out.println(" old name is = "+us.getName());
		
		   us.setName(newName); // set the new data to obj 
		   System.out.println("name is updated with = "+newName);
		   session.save(us);
		   
		   System.out.println("============");
		    
		  System.out.println("user update completed !");
		  tx.commit();
		  System.out.println("user update connection is closed ");
		  session.close();
		
	}
	
	// delete the user 
	
	public static  void userDelete(int id) {
		
		  session = HbUtil.getDBSession();
		  tx = session.beginTransaction();
		   UserDto us = session.get(UserDto.class, id);
		   
		    session.delete(us);
		    
		  System.out.println("user deleted succ completed !");
		  tx.commit();
		  System.out.println("user delete  connection is closed ");
		  session.close();
		
	}
	
	
}
