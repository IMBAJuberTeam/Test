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
			String sql="select * from area";
			ResultSet rs=stmt.executeQuery(sql);
			
			//String sql2="update user set password=\"123\" where username=\"dengyouqing\"";
			//ResultSet rs2=stmt.executeUpdate(sql2);
			int columns=rs.getMetaData().getColumnCount();
			while(rs.next()){
			    for(int i=1;i<=columns;i++){
			    	System.out.print(rs.getString(i));
			    	System.out.print("\t\t");
			    }
			    System.out.println();
			}
			System.out.println(rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
