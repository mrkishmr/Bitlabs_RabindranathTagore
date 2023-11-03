package com.bitlabs.LibraryManager;

import java.sql.SQLException;

public interface BorDaoIntf 
{
   public void borrowBook(int borrowerID,String title) throws SQLException;
   public void displayBorrowedBooks(String boruser) throws SQLException;
   public void searchBookbyTitle(String title) throws SQLException;
   public void searchBookbyAuthor(String author) throws SQLException;
   public void displayBooksbyGenre(String genre) throws SQLException;
   public void displayAllBooks() throws SQLException;
}
