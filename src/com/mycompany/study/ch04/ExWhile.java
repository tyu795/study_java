package com.mycompany.study.ch04;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 1;
		
			while(i<=10) {
				sum = sum + i;
				i++;
				System.out.println(sum);
			}
			
			System.out.println("total sum:" + sum);
	}

}
