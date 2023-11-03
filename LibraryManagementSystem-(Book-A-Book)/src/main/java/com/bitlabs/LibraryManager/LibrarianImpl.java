package com.bitlabs.LibraryManager;

import java.sql.*;

public class LibrarianImpl extends LibImpl implements LibDaoIntf
{

	public LibrarianImpl() throws ClassNotFoundException, SQLException 
	{
		super();
	}

	public void addBook(Book bk) throws SQLException 
	{
		// TODO Auto-generated method stub
		PreparedStatement pst=con.prepareStatement("insert into book(BookID,Title,Author,ISBN,genre,Number_Of_Copies) values (?,?,?,?,?,?)");
		pst.setInt(1,bk.getBookID());
		pst.setString(2,bk.getTitle());
		pst.setString(3,bk.getAuthor());
		pst.setLong(4,bk.getIsbn());
		pst.setString(5,bk.getGenre());
		pst.setInt(6,bk.getNoofcopies());
		int i=pst.executeUpdate();
		if(i>0)
		{
			System.out.println("Book Added Successfully");
		}
		else
		{
			System.out.println("Cannot add Book");
		}
	}
	public void removeBook(int bookID) throws SQLException
	{
		PreparedStatement pst=con.prepareStatement("delete from book where BookID="+bookID);
		int i=pst.executeUpdate();
		if(i>0)
		{
			System.out.println("Book removed successfully");
		}
		else
		{
			System.out.println("Could not remove book");
		}
	}
	public void issueBook(int bookID, int borrowerID) throws SQLException
	{
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
				ResultSet rs1=stmt.executeQuery("select * from book where BookID="+bookID+";select * from users where userID="+borrowerID);
				while(rs1.next())
				{
				PreparedStatement pst=con.prepareStatement("insert into borrowedbooks values (?,?,?,?)");
				pst.setInt(1,bookID);
				pst.setString(2,rs1.getString("Title"));
				pst.setInt(3, rs1.getInt("userID"));
				pst.setString(4,rs1.getString("username"));
				int noofcopies=rs.getInt("Number_Of_Copies");
				if(noofcopies<1)
				{
					stmt.executeUpdate("update book set Availability='OutOfCopies' where Title="+rs1.getString("Title"));
					System.out.println("Book is not available");
				}
				else
				{
				noofcopies--;
				stmt.executeUpdate("update book set Number_Of_Copies="+noofcopies+" where Title="+rs1.getString("Title"));
				pst.executeUpdate();
				}
				}
			}
		}
		System.out.println("Book Issued Successfully");
	}

	public void returnBook(int bookID, int borrowerID,int days) throws SQLException
	{
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from borrowedbooks where BorrowerID="+borrowerID+" and BookID="+bookID+";select * from book;");
		while(rs.next())
		{
			if(days>15)
			{
				float fine=2.0f*(days-15);
				System.out.println("The book to be returned is overdue\nFine to be paid="+fine);
				System.out.println("Please clear your dues and continue to borrow books");
                stmt.executeUpdate("delete from borrowedbooks where BookID="+bookID+" and BorrowerID="+borrowerID);
                int noofcopies=rs.getInt("Number_Of_Copies");
                noofcopies++;
                if(noofcopies==1)
				{
					stmt.executeUpdate("update book set Availability='Available',Number_Of_Copies="+noofcopies+" where Title="+rs.getString("Title"));
				}
				else
				{
				stmt.executeUpdate("update book set Number_Of_Copies="+noofcopies+" where Title="+rs.getString("Title"));
				}
			}
			else
			{
				stmt.executeUpdate("delete from borrowedbooks where BookID="+bookID+" and BorrowerID="+borrowerID);
                int noofcopies=rs.getInt("Number_Of_Copies");
                noofcopies++;
                if(noofcopies==1)
				{
					stmt.executeUpdate("update book set Availability='Available',Number_Of_Copies="+noofcopies+" where Title="+rs.getString("Title"));
				}
				else
				{
				noofcopies--;
				stmt.executeUpdate("update book set Number_Of_Copies="+noofcopies+" where Title="+rs.getString("Title"));
				}
			}
		}
		System.out.println("Book returned Sucessfully");
	}

	public void searchBookByTitle(String title) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from book where title="+title);
		while(rs.next())
		{
			System.out.println("Book ID: "+rs.getInt("BookID"));
			System.out.println("Title: "+rs.getString("Title"));
			System.out.println("Author: "+rs.getString("Author"));
			System.out.println("Genre: "+rs.getString("genre"));
			System.out.println("ISBN: "+rs.getLong("ISBN"));
			System.out.println("Availability status: "+rs.getString("Availability"));
		}
	}

	public void sortBooksbyTitle() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=stmt.executeQuery("select * from book order by title");
		while(rs.next())
		{
			System.out.println(rs.getInt("BookID")+" "+rs.getString("Title")+" "+rs.getString("Author")+" "+rs.getString("genre")+" "+rs.getLong("ISBN"));
		}
	}

	public void searchBooksbyAuthor(String author) throws SQLException {
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
	public void displayAllBooks() throws SQLException
	{
		ResultSet rs=stmt.executeQuery("select * from book");
		while(rs.next())
		{
			System.out.println(rs.getInt("BookID")+" "+rs.getString("Title")+" "+rs.getString("Author")+" "+rs.getString("genre")+" "+rs.getLong("ISBN"));
		}
	}
}
