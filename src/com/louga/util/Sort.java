package com.louga.util;
/*
 * ����һ����Sort��ð�����򷨡�
 * ֻ��һ�������飬��һ�������ڵ�����Ԫ�ؽ��бȽϣ�����˳�����У�ѭ��һ�ο��԰����ֵ������Сֵɸѡ����
 * Ȼ�������ѭ��
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
