package com.louga.util;

import java.util.Arrays;

import org.junit.Test;

public class RandomCount{
	public static int[] generator(int s){
		int[] arr=new int[s];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		return arr;	
	}
	@Test
	public void test01(){
		RandomCount rc=new RandomCount();
		System.out.print(Arrays.toString(rc.generator(10)));
	}
}
