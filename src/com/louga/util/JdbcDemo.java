package com.louga.util;
import java.sql.Statement;
import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcDemo {
	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=GBK&zeroDateTimeBehavior=convertToNull","root","");
			//Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			Statement stmt=conn.createStatement();
			
			//String sql="select * from area where areaName like \'11%\' ";
			String sql="select * from area where areaCode like '%0000'";
			ResultSet rs=stmt.executeQuery(sql);
			
			int columns=rs.getMetaData().getColumnCount();
			while(rs.next()){
				for(int i=1;i<=columns;i++){
				    System.out.print(rs.getString(i));
				    System.out.print("\t");
				}
			    System.out.print("\n");
			}
			System.out.print(rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	/*
	 * 查询全国所有的市
	 */
	public void test01(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=GBK","root","");
			Statement stmt=conn.createStatement();
			String sql="select * from area where areaName like '%市'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Test
	/*
	 * 查询全国所有的区
	 */
	public void test02(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=GBK","root","");
			Statement stmt=conn.createStatement();
			String sql="select * from area where areaName like \"%区\"";
			ResultSet rs=stmt.executeQuery(sql);
			int columns=rs.getMetaData().getColumnCount();
			while(rs.next()){
				for(int i=1;i<=columns;i++){
				System.out.print(rs.getString(i));
				System.out.print("\t");
				}
			System.out.print("\n");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
