package customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class cusDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean issuccess;
	
	public static boolean insertcustomer(String fname,String lname,String dob,String gen,String nic,String country,String passport,String email,String phone,String username,String password)
	{
		boolean issuccess = false;
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into customer values(0,'"+fname+"','"+lname+"','"+dob+"','"+gen+"','"+nic+"','"+country+"','"+passport+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				issuccess = true;
			}
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return issuccess;
	}
	public static boolean validate(String username,String password) {
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where username = '"+username+"'and password ='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				issuccess = true;
			}else
				issuccess = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return issuccess;
	}
	public static int cusId(String username,String password) {
		int id=0;
			try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select cusID  from customer where username = '"+username+"'and password ='"+password+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				 id = rs.getInt(1);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return id;
	}
	
	public static List<Customer> getcus(int cid){
		
		ArrayList<Customer> cus  = new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where cusID="+cid+"";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				int id = rs.getInt(1);
				String fname =rs.getString(2);
				String lname =rs.getString(3);
				String dob =rs.getString(4);
				String gen =rs.getString(5);
				String nic =rs.getString(6);
				String country =rs.getString(7);
				String passport =rs.getString(8);
				String mail =rs.getString(9);
				String phone =rs.getString(10);
				String uname =rs.getString(11);
				String pwd =rs.getString(12);
				
				Customer customer = new Customer(id,fname,lname,dob,gen,nic,country,passport,mail,phone,uname,pwd);
				cus.add(customer); 
			}else {
				Customer c = new Customer();
				cus.add(c);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cus;
	}
	public static boolean updatecustomer(int id,String fname,String lname,String dob,String gen,String nic,String country,String passport,String email,String phone,String username,String password)
	{
		boolean issuccess = false;
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "update customer set fname='"+fname+"',lname='"+lname+"',dob='"+dob+"',gender='"+gen+"',nic='"+nic+"',country='"+country+"',passport_no='"+passport+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"' where cusId = "+id+"";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				issuccess = true;
			}
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return issuccess;
	}
	
	
	public static boolean removeaccount(int id) {
		boolean issuccess = false;
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer where cusID = "+id+"";
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
