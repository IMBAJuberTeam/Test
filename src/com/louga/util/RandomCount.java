package com.louga.util;

public class RandomCount{
	public static int[] generator(int n){
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		return arr;
	}
}
