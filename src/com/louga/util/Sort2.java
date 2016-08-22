package com.louga.util;

import java.util.Arrays;

import org.junit.Test;

/*
 * 定义一个类，选择排序
 * 方法名sort2()，输入一个int[]，返回一个int[]
 * 可以理解为实际上是有两个相同的数组，进行比较，第一次拿第一个元素和第二个数组的所有元素进行比较得到最小值，然后是
 * 第一个数组的第二个元素和第二个数组的所有元素进行比较，这样达到选择排序的效果
 */	 
public class Sort2 {
	 public int[] sort2(int[] arr){
		 for(int i=0;i<arr.length;i++){
			 int min=arr[i];
			 for(int j=i;j<arr.length;j++){
				 min=arr[i]>arr[j]?arr[j]:arr[i];
				 if(min!=arr[i]){
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			}		 	
			//System.out.print(min+" "); 
		 }
		 System.out.print("\n");
		 return arr;
	 }
	 
	 @Test
	 public void Test01(){
		 Sort2 sorttwo=new Sort2();
		 int[] arr={1,3,9,10,8,6,5,7,4,2};
		 
		 System.out.print(Arrays.toString(arr));
		 System.out.print(Arrays.toString(sorttwo.sort2(arr)));
	 }
}
