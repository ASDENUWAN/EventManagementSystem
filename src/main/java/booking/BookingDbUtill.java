package booking;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import customer.DBconnect;

public class BookingDbUtill {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean insertbooking(int cid,String type,String venue,String time,String date)
	{
		boolean issuccess = false;
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String stat = "Pending";
			String sql = "insert into booking values(0,'"+type+"','"+venue+"','"+time+"','"+date+"',"+cid+",'"+stat+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				issuccess = true;
			}
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return issuccess;
	}
	
	public static List<book> getbook(int cid){
		
		ArrayList<book> b  = new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from booking where cID="+cid+"";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int bid = rs.getInt(1);
				String type =rs.getString(2);
				String venue =rs.getString(3);
				String time =rs.getString(4);
				String date =rs.getString(5);
				String cid1 = rs.getString(6);
				String stat =rs.getString(7);
				
				book book = new book(bid,type,venue,time,date,stat);
				b.add(book); 
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
	public static boolean updatebook(int id, String type,String venue,String time,String date)
	{
		boolean issuccess = false;
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "update booking set type='"+type+"',venue='"+venue+"',time='"+time+"',date='"+date+"' where bID = "+id+"";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				issuccess = true;
			}
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return issuccess;
	}
	
	public static boolean cancel(int id) {
		boolean issuccess = false;
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from booking where bID = "+id+"";
			int rs = stmt.executeUpdate(sql);
			if(rs>0) {
				issuccess = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return issuccess;
		
	}

}
