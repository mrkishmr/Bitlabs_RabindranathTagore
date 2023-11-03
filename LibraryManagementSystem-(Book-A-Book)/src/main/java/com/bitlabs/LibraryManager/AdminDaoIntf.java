package com.bitlabs.LibraryManager;

import java.sql.SQLException;

public interface AdminDaoIntf 
{
public void addLibrarian(String username, String password) throws SQLException;
}
