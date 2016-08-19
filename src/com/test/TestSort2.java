package com.test;

import java.util.Arrays;

import com.louga.util.RandomCount;
import com.louga.util.Sort;

public class TestSort2 {
	public static void main(String[] args){
		int[] arr=RandomCount.generator(10);
		Sort sort=new Sort();
		System.out.println("排序前的数组是：");		
		System.out.println(Arrays.toString(arr));
		
		int[]arr2=sort.sort(arr);
		System.out.println("排序后的数组是：");
		System.out.println(Arrays.toString(arr2));
		
	}

}
