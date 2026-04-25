package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{
	public int insertProduct(ProductBean pb) 
	{
		int rowCount=0;
		
		try 
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?,?)");
			
			pstmt.setString(1, pb.getP_code());
			pstmt.setString(2, pb.getP_name());
			pstmt.setString(3, pb.getP_company());
			pstmt.setString(4, pb.getP_price());
			pstmt.setString(5, pb.getP_qty());
			
			rowCount = pstmt.executeUpdate();			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}

}
























