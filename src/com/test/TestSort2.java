package com.test;

import com.louga.util.RandomCount;
import com.louga.util.PrintSort;
import com.louga.util.Sort;

public class TestSort2 {
	public static void main(String[] args){
		int[] arr=RandomCount.generator(10);
		Sort sort=new Sort();
		System.out.println("����ǰ�������ǣ�");		
		PrintSort.printsort(arr);
		
		int[]arr2=sort.sort(arr);
		System.out.println("�����������ǣ�");
		PrintSort.printsort(arr2);
		
	}

}
