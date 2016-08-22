package com.louga.util;
import java.sql.DriverManager;

import com.mysql.jdbc.*;
public class JdbcDemo {
	public static void main(String[] args){
		try {
			//加载数据库驱动类
			Class.forName("com.mysql.jdbc.Driver");
			
			//创建数据库连接
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test:3306","root","");
			
			//为连接创建一个状态
			Statement stmt=conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
