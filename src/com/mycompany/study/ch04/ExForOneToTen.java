package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		 
        for (int i = 1; i <= 10; i++) {
 
            sum += i;
 
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        
        

		int sum2 = 0;
		
		for (int i = 11; i <= 50; i++) {
			if(i%2 == 0) {
		
		    sum2 += i;
		    System.out.println(i + "|" + sum2);
		}
		
		}
        
	}
			
}

		
	
	
	
	

