package com.test;

import java.util.Arrays;
import com.louga.util.RandomCount;
import com.louga.util.Sort2;

public class TestSort2 {
	public static void main(String[] args){
		int[] arr=RandomCount.generator(10);
		Sort2 sort2=new Sort2();
		System.out.println("排序前的数组是：");		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2=sort2.sort2(arr);
		System.out.println("排序后的数组是：");
		System.out.println(Arrays.toString(arr2));
		
	}

}
