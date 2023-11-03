package com.bitlabs.LibraryManager;

public class Book 
{
private int bookID,noofcopies;
private String title,author,genre;
private long isbn;
public int getNoofcopies() {
	return noofcopies;
}
public void setNoofcopies(int noofcopies) {
	this.noofcopies = noofcopies;
}
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
}
