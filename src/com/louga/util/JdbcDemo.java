package com.louga.util;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcDemo {
	public static void main(String[] args){
		try {
			//�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			
			//�������ݿ�����
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			
			//Ϊ���Ӵ���һ��״̬
			Statement stmt=conn.createStatement();
			
			//����һ��sql��䣬��һ�����sqlִ�н������ResultSet����
			String sql="select * from area where areaName like '%省' ";
			//String sql="select * from area ";
			ResultSet rs=stmt.executeQuery(sql);
			
			int columns=rs.getMetaData().getColumnCount();
			while(rs.next()){
				for(int i=1;i<=columns;i++){
				    System.out.print(rs.getString(i));
				    System.out.print("\t\t");
				}
			    System.out.print("\n");
			}
			System.out.print(rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
