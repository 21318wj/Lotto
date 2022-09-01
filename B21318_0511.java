package lotto;

import java.util.*;

public class B21318_0511 {

	public static void main(String[] args) {
		//Lotto
		int [] num = new  int[6];
		
		Random r = new Random();
		
		for(int i=0;i<num.length;i++) {
			num[i] = r.nextInt(45)+1;	
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) 			
					i--;
			}																							
		}			
		for(int a=1; a<num.length; a++) {	
			for(int i=0; i<num.length-1; i++) {
				if(num[i]>num[i+1]) {
					int temp = num [i];
					num [i] = num[i+1];
					num [i+1] = temp;
				}					
			}
		}	
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d \t", num[i]);
		}
		
	}
}
