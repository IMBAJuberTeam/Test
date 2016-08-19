package com.louga.util;

public class Chengfabiao {
	public void chengFaBiao(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
				
			}
			System.out.print("\n");
		}
	}

}
