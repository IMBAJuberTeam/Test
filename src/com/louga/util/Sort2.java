package com.louga.util;

import java.util.Arrays;

import org.junit.Test;

/*
 * ����һ���࣬ѡ������
 * ������sort2()������һ��int[]������һ��int[]
 * �������Ϊʵ��������������ͬ�����飬���бȽϣ���һ���õ�һ��Ԫ�غ͵ڶ������������Ԫ�ؽ��бȽϵõ���Сֵ��Ȼ����
 * ��һ������ĵڶ���Ԫ�غ͵ڶ������������Ԫ�ؽ��бȽϣ������ﵽѡ�������Ч��
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
