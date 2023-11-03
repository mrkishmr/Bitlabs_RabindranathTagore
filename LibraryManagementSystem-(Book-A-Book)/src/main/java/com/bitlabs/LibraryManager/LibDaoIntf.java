package com.bitlabs.LibraryManager;

import java.sql.SQLException;

public interface LibDaoIntf 
{
public void addBook(Book bk) throws SQLException;
public void removeBook(int bookID) throws SQLException;
public void issueBook(int bookID, int borrowerID) throws SQLException;
public void returnBook(int bookID, int borrowerID,int days) throws SQLException;
public void searchBookByTitle(String title) throws SQLException;
public void sortBooksbyTitle() throws SQLException; 
public void searchBooksbyAuthor(String author) throws SQLException;
public void displayBooksbyGenre(String genre) throws SQLException;
public void displayAllBooks() throws SQLException;
}
