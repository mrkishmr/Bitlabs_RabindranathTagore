package com.bitlabs.LibraryManager;

import java.sql.*;

public class LibImpl implements LoginIntf
{
	Connection con;
	Statement stmt;
	public LibImpl() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryms", "database-server_username", "database-server_password");
		System.out.println("Connection established sucesfully");
		stmt=con.createStatement();
	}
	public void registerUser(User us) throws SQLException 
	{
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from users");
		while(rs.next())
		{
			if(us.getUsername().equals(rs.getString("username")))
			{
				System.out.println("Username already Exists");
				break;
			}
			else
			{
				PreparedStatement pst=con.prepareStatement("insert into users(username,password) values(?,?)");
				pst.setString(1,us.getUsername());
				pst.setString(2,us.getPassword());
				int i=pst.executeUpdate();
				if(i>0)
				{
					System.out.println("User registered successfully");
				}
				else
				{
					System.out.println("Registration failed");
				}
			}
		}
	}
	public void librarianLogin(String libuser, String libpassword) throws SQLException, ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from users where user_type='librarian'");
		while(rs.next())
		{
			if(libuser.equals(rs.getString("username"))&&libpassword.equals(rs.getString("password")))
			{
				System.out.println("Login successful");
				App.librarianMenu();
				break;
			}
				System.out.println("Username and password do not match! Try again");
		}
	}
	public void borrowerLogin(String boruser, String borpassword) throws SQLException, ClassNotFoundException
	{
		ResultSet rs=stmt.executeQuery("select * from users where user_type='borrower'");
		while(rs.next())
		{
			if(boruser.equals(rs.getString("username"))&&borpassword.equals(rs.getString("password")))
			{
				System.out.println("Login successful");
				App.borrowerMenu();
				break;
			}
				System.out.println("Username and password do not match! Try again");
		}
	}
	public void adminLogin(String admpassword) throws SQLException, ClassNotFoundException
	{
		ResultSet rs=stmt.executeQuery("select * from users where user_type='admin'");
		while(rs.next())
		{
			if(rs.getString("username").equals("admin")&&admpassword.equals(rs.getString("password")))
			{
				System.out.println("Login successful");
				App.adminMenu();
				break;
			}
				System.out.println("Invalid password! Try again");
		}
	}
}
