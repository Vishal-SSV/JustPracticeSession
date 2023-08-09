package arrayprograms;

import java.util.Scanner;

public class ArrayAllProgram {
	
	public void simpleArrayAccess() {
		
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Value");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		System.out.println("My Array is");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public void aditionOfArray() {
		
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Value");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		System.out.println("Addition of array is");
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];			
		}
		System.out.println("Additon is="+sum);
	}
	
	public void arrayPalindrom() {
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
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			int rem,sum=0;
			int org=a[i];
			while(a[i]!=0) {
				
				rem=a[i]%10;
				sum=rem+sum*10;
				a[i]=a[i]/10;
			}
			System.out.println("===============");
			if(org==sum) {
				System.out.println(org +" is palindrome");
			}
			else {
				System.out.println(org +" is not palindrome");
			}
			
			
		}
	}
	
	public void maxArrayNo() {
		//Declare Array and Assigned value.
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//Print Array
		System.out.println("Array is");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//Print Max Number
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
				if(a[i]>max) {
					
					max=a[i];
				}
		}
		System.out.println("Maximum No is="+max);
		
	}
	


	public static void main(String[] args) {
		
		ArrayAllProgram sp=new ArrayAllProgram();
		//sp.simpleArrayAccess();
		//sp.aditionOfArray();
		//sp.arrayPalindrom();
		//sp.maxArrayNo();
		

	}

}
