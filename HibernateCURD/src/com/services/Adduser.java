package com.services;

import com.dao.UserDAO;
import com.dto.UserDto;

public class Adduser {
	
	public static void main(String[] args) {
		
		// Create the data... 
				UserDto  userdto = new UserDto();
				userdto.setId(21);
				userdto.setName("user21 3");
				userdto.setAddress("rajstan");
				
				try {
					UserDAO.userSave(userdto);
				} catch (Exception e) {
					System.out.println("not added user chek the data");
				}
			
			// read the data ..	
				try {
					UserDAO.userRead(1);
				} catch (Exception e) {
				//	System.out.println("no user found");
				}
			
			// update the data
				
				try {
				//	UserDAO.userUpdate("newsuer_there_3_3", 2);
				} catch (Exception e) {
					System.out.println("check user id .. ");
				}
				
			// delete user ;
				
				try {
				//	UserDAO.userDelete(1123);
				} catch (Exception e) {
					System.out.println("user not found to delete ...!");
				}
				
				
				
	}

}
