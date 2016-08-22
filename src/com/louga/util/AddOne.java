package com.louga.util;

import org.junit.Test;

public class AddOne {
	public void addOne() throws InterruptedException{
		int x=0;
		while(x>=0){
			System.out.println(x);
			x++;
			Thread.sleep(1000);
			
		}
	}
	@Test
	public void test01(){
		AddOne addone= new AddOne();
		try {
			addone.addOne();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
