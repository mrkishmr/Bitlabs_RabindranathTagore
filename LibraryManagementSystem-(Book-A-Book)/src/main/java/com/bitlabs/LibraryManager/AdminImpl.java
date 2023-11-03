package com.bitlabs.LibraryManager;

import java.sql.*;

public class AdminImpl extends LibImpl implements AdminDaoIntf
{
	public AdminImpl() throws ClassNotFoundException, SQLException 
	{
		super();
	}
    public void addLibrarian(String username, String password) throws SQLException
    {
    	PreparedStatement pst=con.prepareStatement("insert into users(username,password) values(?,?)");
		pst.setString(1,username);
		pst.setString(2,password);
		int i=pst.executeUpdate();
		if(i>0)
		{
			System.out.println("Librarian added successfully");
		}
		else
		{
			System.out.println("Registration failed");
		}
    }
}
