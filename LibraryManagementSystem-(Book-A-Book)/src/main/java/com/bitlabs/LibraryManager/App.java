package com.bitlabs.LibraryManager;

import java.sql.SQLException;
import java.util.*;

public class App 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        App.login();
    }
    public static void login() throws ClassNotFoundException, SQLException
    {
    	Scanner sc=new Scanner(System.in);
    	User us=new User();
    	LibImpl lib=new LibImpl();
    	System.out.println("Welcome to Book-A-Book");
    	System.out.println("1. Register as new User\n2. Login as Existing user");
    	int ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
    	{
    		String username,password,confpassword;
    		do
    		{
    		System.out.println("Enter new username");
    		username=sc.next();
    		System.out.println("Create password");
    		password=sc.next();
    		System.out.println("Confirm your password");
    		confpassword=sc.next();
    		if(password.equals(confpassword))
    		{
    		us.setUsername(username);
    		us.setPassword(password);
    		lib.registerUser(us);
    		}
    		else
    		{
    			System.out.println("Passwords do not match");
    		}
    		}while(!password.equals(confpassword));
    		break;
    	}
    	case 2:
    	{
    		System.out.println("Login as");
    		System.out.println("1. Admin\n2. Librarian\n3. Borrower");
    		int op=sc.nextInt();
    		switch(op)
    		{
    		case 1:
    		{
    			System.out.println("Enter your password");
    			String password=sc.next();
    			lib.adminLogin(password);
    			break;
    		}
    		case 2:
    		{
    			System.out.println("Enter Librarian ID and Password");
    			String libuser=sc.next();
    			String libpassword=sc.next();
    			lib.librarianLogin(libuser,libpassword);
    			break;
    		}
    		case 3:
    		{
    			System.out.println("Enter Borrower ID and Password");
    			String boruser=sc.next();
    			String borpassword=sc.next();
    			lib.borrowerLogin(boruser,borpassword);
    			break;
    		}
    		}
    	}
    	}
    }
    public static void librarianMenu() throws ClassNotFoundException, SQLException
    {
    	Scanner sc=new Scanner(System.in);
    	LibrarianImpl lib=new LibrarianImpl();
    	Book bk=new Book();
    	System.out.println("Welcome Librarian");
    	char c=' ';
    	do
    	{
    		System.out.println("Choose any of the following options");
        	System.out.println("1. Add Book\n2. Remove Book\n3. Issue Book/n4. Return Book\n5. Search for book by title\n6. Sort books by title\n7. Search for books by author\n8. Display books by genre\n9. Display All books\n10. Exit Application");
    		int ch=sc.nextInt();
    		switch(ch)
    		{
    		case 1:
    		{
    			System.out.println("Enter the book details");
    			System.out.println("Book ID");
    			int bookID=sc.nextInt();
    			sc.nextLine();
    			System.out.println("Book Title");
    			String title=sc.nextLine();
    			System.out.println("Author");
    			String author=sc.nextLine();
    			System.out.println("Genre");
    			String genre=sc.nextLine();
    			sc.nextLine();
    			System.out.println("ISBN");
    			long isbn=sc.nextLong();
    			System.out.println("Available copies");
    			int noofcopies=sc.nextInt();
    			bk.setBookID(bookID);
    			bk.setTitle(title);
    			bk.setAuthor(author);
    			bk.setGenre(genre);
    			bk.setIsbn(isbn);
    			bk.setNoofcopies(noofcopies);
    			lib.addBook(bk);
    			break;
    		}
    		case 2:
    		{
    			System.out.println("Enter the book ID which has to be removed");
    			int bookID=sc.nextInt();
    			lib.removeBook(bookID);
    			break;
    		}
    		case 3:
    		{
    			System.out.println("Enter the book ID and the borrower ID to issue book");
    			int bookID=sc.nextInt();
    			int borrowerID=sc.nextInt();
    			lib.issueBook(bookID,borrowerID);
    			break;
    		}
    		case 4:
    		{
    			System.out.println("Enter the book ID and the borrower ID to return");
    			int bookID=sc.nextInt();
    			int borrowerID=sc.nextInt();
    			System.out.println("Enter the number of days borrowed till now");
    			int days=sc.nextInt();
    			lib.returnBook(bookID,borrowerID,days);
    			break;
    		}
    		case 5:
    		{
    			System.out.println("Enter the book title");
    			String title=sc.nextLine();
    			lib.searchBookByTitle(title);
    			break;
    		}
    		case 6:
    		{
    			lib.sortBooksbyTitle();
    			break;
    		}
    		case 7:
    		{
    			System.out.println("Enter the author name to search for books written by author");
    			String author=sc.nextLine();
    			lib.searchBooksbyAuthor(author);
    			break;
    		}
    		case 8:
    		{
    			System.out.println("Enter the genre do display those books of the given genre");
    			String genre=sc.next();
    			lib.displayBooksbyGenre(genre);
    			break;
    		}
    		case 9:
    		{
    			lib.displayAllBooks();
    			break;
    		}
    		case 10:
    		{
    			System.exit(0);
    		}
    		}
    		System.out.println("Press y to continue or n to exit");
    		c=sc.next().charAt(0);
    	}while(c!='n');
    }
    public static void borrowerMenu() throws ClassNotFoundException, SQLException
    {
    	Scanner sc=new Scanner(System.in);
    	BorrowImpl bml=new BorrowImpl();
    	System.out.println("Welcome Borrower");
    	char c=' ';
    	do
    	{
    		System.out.println("Choose any one of the following options");
        	System.out.println("1. Borrow Book\n2. Display Borrowed Books\n3. Search book by title\n4. Search book by author\n5. Search book by genre\n6. Display all books\n7. Exit Application");
        	int ch=sc.nextInt();
    		switch(ch)
    		{
    		case 1:
    		{
    			System.out.println("Enter borrower ID");
    			int borID=sc.nextInt();
    			System.out.println("Enter the book title");
    			String title=sc.nextLine();
    			bml.borrowBook(borID,title);
    			break;
    		}
    		case 2:
    		{
    		    System.out.println("Enter borrower username");
    		    String user=sc.next();
    			bml.displayBorrowedBooks(user);
    			break;
    		}
    		case 3:
    		{
    			System.out.println("Enter the book title to search for the book in catalog");
    			String title=sc.nextLine();
    			bml.searchBookbyTitle(title);
    			break;
    		}
    		case 4:
    		{
    			System.out.println("Enter the author's name to display their books");
    			String author=sc.nextLine();
    			bml.searchBookbyAuthor(author);
    			break;
    		}
    		case 5:
    		{
    			System.out.println("Enter the genre to display the list of those particular books");
    			String genre=sc.nextLine();
    			bml.displayBooksbyGenre(genre);
    			break;
    		}
    		case 6:
    		{
    			bml.displayAllBooks();
    			break;
    		}
    		case 7:
    		{
    			System.exit(0);
    		}
    		}
    		System.out.println("Press y to continue or n to exit");
    		c=sc.next().charAt(0);
    	}while(c!='n');
    	System.out.println("Thank you for using this application");
    }
    public static void adminMenu() throws ClassNotFoundException, SQLException
    {
    	Scanner sc=new Scanner(System.in);
    	AdminImpl adm=new AdminImpl();
    	System.out.println("Welcome Admin");
    	char c=' ';
    	do
    	{
    		System.out.println("Choose any one of the following options");
        	System.out.println("1. Add Librarian\n2. View as Librarian\n3. View as Borrower\n4. Exit Application");
        	int ch=sc.nextInt();
        	switch(ch)
        	{
        	case 1:
        	{
        		System.out.println("Add Librarian Details");
        		String password,confpassword;
        		String libusername=sc.next();
        		do
        		{
        			System.out.println("Create a password for the librarian");
        			password=sc.next();
        			System.out.println("Confirm Password");
        			confpassword=sc.next();
        			if(password.equals(confpassword))
        			{
        				adm.addLibrarian(libusername,password);
        			}
        			else
        			{
        				System.out.println("Passwords do not match! Try again");
        			}
        		}while(!password.equals(confpassword));
        		break;
        	}
        	case 2:
        	{
        		App.librarianMenu();
        	}
        	case 3:
        	{
        		App.borrowerMenu();
        	}
        	case 4:
        	{
        		System.exit(0);
        	}
        	}
        	System.out.println("Press y to continue or n to exit");
    		c=sc.next().charAt(0);
    	}while(c!='n');
    }
}