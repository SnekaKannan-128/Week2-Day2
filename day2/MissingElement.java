package week2.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,2,8,6,7}; 
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int i=0, sum1=0, sum2=0;
		for(i=0; i<a.length; i++) {
			sum1 = sum1+a[i];			
		}
		System.out.println("Sum of all elements in array : " + sum1);
		
		for(i=1; i<=8; i++) {
			sum2 = sum2 + i;
			
		}
			System.out.println("Sum of all range: "+ sum2);
			
			System.out.println("Missing element is : " + (sum2-sum1));

	}

}
