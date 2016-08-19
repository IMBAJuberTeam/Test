package com.louga.caculate;

import java.util.Arrays;
/**
 * @describtion ð������
 * @author tolbrandir
 */
import com.louga.util.MathUtil;

public class MathCaculate {
	public static void main(String[] args) {
		int[] numbers = MathUtil.generateRandoms();
		System.out.println("����������飺"+ Arrays.toString(numbers));
		System.out.println("�������������飺" + Arrays.toString(bubbleSort(numbers)));
	}
	
	//�Ƚ��������Ĵ�С������˳�򷵻�
	public static int[] swap(int variable_x, int variable_y){
		int[] result = new int[2];
		int temp = 0;
		if( variable_x > variable_y){
			temp = variable_y;
			variable_y = variable_x;
			variable_x = temp;
		}
		result[0] = variable_x;
		result[1] = variable_y;
		
		return result;
	}
	
	public static int[] bubbleSort(int[] numbers){
		int[] result = new int[2];
		//��ѭ��
		for (int i = 0; i < numbers.length; i++) {
			//��ѭ��
			for (int j = i +1; j < numbers.length; j++) {
				result = swap(numbers[i], numbers[j]);
				numbers[i] = result[0];
				numbers[j] = result[1];
			}
		}
		
		return numbers;
	}
}
