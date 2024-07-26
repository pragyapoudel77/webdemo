package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void signup(User user) {
		String sql = "Insert into user(firstname,lastname,username,password) values('"+user.getFirstname()+"','"+user.getLastname()+"','"+user.getUsername()+"','"+user.getPassword()+"')";
		try {
			Statement stm=DB.getDbCon().createStatement();
			stm.execute(sql);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean login(String username, String password) {
		
		
		String sql = "select * from user where username = '"+username+"' and password ='"+password+"' ";
		
		
		try {
			Statement stm = DB.getDbCon().createStatement();
			ResultSet rs =stm.executeQuery(sql);
			
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
}
