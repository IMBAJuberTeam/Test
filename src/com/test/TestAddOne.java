package com.test;

import com.louga.util.AddOne;

public class TestAddOne {
	public static void main(String[] args){
		AddOne addone=new AddOne();
		try {
			addone.addOne();
		} catch (InterruptedException e) {
			// ²ÝÁË¸ödj
			e.printStackTrace();
		}
	}
}
