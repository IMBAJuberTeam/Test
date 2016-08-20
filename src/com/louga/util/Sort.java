package com.louga.util;
/*
 * 定义一个类Sort【冒泡排序法】
 * 只有一个数数组，第一次是相邻的两个元素进行比较，按照顺序排列，循环一次可以把最大值或者最小值筛选出来
 * 然后是外层循环
 */
public class Sort {
	public int[] sort(int[] arr){
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					//PrintSort.printsort(arr);
				}
			}
		}
		return arr;
	}

}
