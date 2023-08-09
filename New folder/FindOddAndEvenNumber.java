package arrayprograms;

import java.util.Scanner;

public class FindOddAndEvenNumber {
	
	public void oddEvenNumber() {
		
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number for Odd Number addition");
		n=sc.nextInt();
		sc.close();
		if(n%2!=0) {
			System.out.println(n+"is Odd Number.");
		}
		else {
			System.out.println(n+"is Even Number.");
		}	
		
	}
	
	public void oddEvenNumberFromArray() {
		int[] a=new int[7];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 7 value for Array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		//Print Array
		System.out.println("Array Value given By User");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		
		System.out.println("\nOddEven Number From Given array.");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				
				System.out.println(a[i] + "odd number");				
			}
			else {
				System.out.println(a[i] + "Even number");
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		FindOddAndEvenNumber fnd=new FindOddAndEvenNumber();
		//fnd.oddEvenNumber();
		fnd.oddEvenNumberFromArray();

	}

}
