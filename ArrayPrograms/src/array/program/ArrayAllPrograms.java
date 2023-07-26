package array.program;

import java.util.Scanner;

public class ArrayAllPrograms {
	
	public void additionOfOddNumber(int n) {
		int count=0;
		int[] a=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print Array Value");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		System.out.println("\nPrint Odd Number and it's Addition");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]+" = is Odd Number");
				count=count+a[i];
			}			
		}
		System.out.println("Addition of Odd Number is="+count);
	}
	
	public void additionOfEvenNumber(int n) {
		
		int count=0;
		int[] a=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print Array Value");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrint Even Number and it's Addition");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+"= is Even Number");
				count=count+a[i];
			}
		}
		System.out.println("Addtion of Even Number is="+count);
	}
	
	public void findOddOrEvenNumber(int n) {
		int[] a=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print Array Value");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrint Odd and Even Number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+"= is Even Number");
			}
			else {
				System.out.println(a[i]+"= is Odd Number");
			}
		}
		
	}
	
	public void primeNumberFromArray(int n) {
		int count;
		int[] a=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print Array Value");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrint Prime Number from Array");
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=2;j<a[i];j++) {				
				if(a[i]%j==0) {
					count++;
					break;
				}				
			}
			if(count==0) {
				System.out.println(a[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		ArrayAllPrograms ap=new ArrayAllPrograms();
		//ap.additionOfOddNumber(7);
		//ap.additionOfEvenNumber(10);
		//ap.findOddOrEvenNumber(10);
		ap.primeNumberFromArray(5);

	}

}
