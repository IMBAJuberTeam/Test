package com.louga.util;
import java.sql.DriverManager;

import com.mysql.jdbc.*;
public class JdbcDemo {
	public static void main(String[] args){
		try {
			//�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			
			//�������ݿ�����
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test:3306","root","");
			
			//Ϊ���Ӵ���һ��״̬
			Statement stmt=conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
