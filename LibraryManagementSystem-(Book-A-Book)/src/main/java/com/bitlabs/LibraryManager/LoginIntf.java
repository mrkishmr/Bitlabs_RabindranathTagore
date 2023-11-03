package com.bitlabs.LibraryManager;

import java.sql.SQLException;

public interface LoginIntf 
{
public void registerUser(User us) throws SQLException;
public void librarianLogin(String libuser, String libpassword) throws SQLException, ClassNotFoundException;
public void borrowerLogin(String boruser, String borpassword) throws SQLException, ClassNotFoundException;
public void adminLogin(String admpassword) throws SQLException, ClassNotFoundException;
}
