package com.bitlabs.LibraryManager;

import java.sql.*;

public class BorrowImpl extends LibImpl implements BorDaoIntf
{
	public BorrowImpl() throws ClassNotFoundException, SQLException 
	{
		super();
	}
	public void borrowBook(int borrowerID,String title) throws SQLException 
	{
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select count(*) from borrowedbooks where BorrowerID="+borrowerID);
		while(rs.next())
		{
			if(rs.getInt(1)>=3)
			{
				System.out.println("You already have borrowed three books, please return a book to borrow another book");
				break;
			}
			else
			{
				ResultSet rs1=stmt.executeQuery("select * from book where Title="+title+";select * from users where userID="+borrowerID);
				while(rs1.next())
				{
				PreparedStatement pst=con.prepareStatement("insert into borrowedbooks values (?,?,?,?)");
				pst.setInt(1,rs1.getInt("BookID"));
				pst.setString(2,title);
				pst.setInt(3, rs1.getInt("userID"));
				pst.setString(4,rs1.getString("username"));
				int noofcopies=rs.getInt("Number_Of_Copies");
				if(noofcopies<1)
				{
					stmt.executeUpdate("update book set Availability='OutOfCopies' where Title="+title);
					System.out.println("Book is not available");
				}
				else
				{
				noofcopies--;
				stmt.executeUpdate("update book set Number_Of_Copies="+noofcopies+" where Title="+title);
				pst.executeUpdate();
				}
				}
			}
		}
		System.out.println("Book borrowed Successfully");
	}

	public void searchBookbyTitle(String title) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from book where title="+title);
		while(rs.next())
		{
			System.out.println("Title: "+rs.getString("Title"));
			System.out.println("Author: "+rs.getString("Author"));
			System.out.println("Genre: "+rs.getString("genre"));
			System.out.println("ISBN: "+rs.getLong("ISBN"));
			System.out.println("Availability status: "+rs.getString("Availability"));
		}	
	}
	public void searchBookbyAuthor(String author) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from book where author="+author);
		while(rs.next())
		{
			System.out.println(rs.getInt("BookID")+" "+rs.getString("Title")+" "+rs.getString("Author")+" "+rs.getString("genre")+" "+rs.getLong("ISBN"));
		}
	}
	public void displayBooksbyGenre(String genre) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from book where genre="+genre);
		while(rs.next())
		{
			System.out.println(rs.getInt("BookID")+" "+rs.getString("Title")+" "+rs.getString("Author")+" "+rs.getString("genre")+" "+rs.getLong("ISBN"));
		}
	}
	public void displayAllBooks() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from book");
		while(rs.next())
		{
			System.out.println(rs.getInt("BookID")+" "+rs.getString("Title")+" "+rs.getString("Author")+" "+rs.getString("genre")+" "+rs.getLong("ISBN"));
		}
	}
	public void displayBorrowedBooks(String boruser) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from borrowedbooks where BorrowerName="+"'"+boruser+"';");
		while(rs.next())
		{
			System.out.println(rs.getInt("BookID")+" "+rs.getString("Title"));
		}
	}
	
}