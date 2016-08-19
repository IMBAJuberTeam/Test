package com.louga.util;

import java.util.Random;

public class MathUtil {
	
	//生成随机数组
	public static int[] generateRandoms(){
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			Random random =new Random();
			int r = random.nextInt(100) + 1;
			numbers[i] = r;
		}
		return numbers;
	}
}
