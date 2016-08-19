package com.test;

import com.louga.util.PrintSort;
import com.louga.util.Sort;

public class TestSort {
	public static void main(String[] args){
		int[] arr={1,3,9,5,8,7,4,2,10,6,0};
		Sort sort=new Sort();
		System.out.println("排序前的数组是：");		
		PrintSort.printsort(arr);
		
		int[]arr2=sort.sort(arr);
		System.out.println("排序后的数组是：");
		PrintSort.printsort(arr2);
		
	}

}
