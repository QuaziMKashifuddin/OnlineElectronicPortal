package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect
{

	static Connection con =null;
	
	static 
	{
		try 
		{
			Class.forName(DBInfo.driver);
			con =DriverManager.getConnection(DBInfo.url,DBInfo.user,DBInfo.pwd);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured in DBConnect Class");
			e.printStackTrace();
		}
		
	}
	public static Connection getCon() 
	{
		
		return con;
	}

}
