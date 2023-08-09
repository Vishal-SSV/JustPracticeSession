package arrayprograms;

import java.util.Scanner;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		
		
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array is");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int max=a[0],secondmax=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				secondmax=max;
				max=a[i];
			}
			if(a[i]>secondmax && a[i]<max) {
				secondmax=a[i];
			}
		}
		System.out.println("Highest Number= "+ max);
		System.out.println("Second Highest Number= "+ secondmax);

	}

}
