package com.louga.util;

public class RandomCount{
	public static int[] generator(int s){
		int[] arr=new int[s];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		return arr;	
	}
}
