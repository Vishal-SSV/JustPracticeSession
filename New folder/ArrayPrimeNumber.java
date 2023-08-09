package arrayprograms;

import java.util.Scanner;

public class ArrayPrimeNumber {
	
	public void primeNumber() {
		
		int cnt=0,n;
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {				
				cnt++;
				break;
			}			
		}
		
		if(cnt==0) {
			System.out.println(n + " is a Prime Number");
		}
		else{
			System.out.println(n + " is not a Prime Number");
		}
		
	}
	
	public void primeFromArray() {
		
		int cnt;
		int[]a=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 values in the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Print Array
		System.out.println("Array Value given By User");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		//Check Prime Number From given Array
		System.out.println("\nPrime Number From Given array.");
		
		for(int i=0;i<a.length;i++) {
			cnt=0;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					cnt++;
					break;
				}
			}
			if(cnt==0) {
				System.out.print(a[i]+"     ");
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayPrimeNumber apn=new ArrayPrimeNumber();
		//apn.primeNumber();
		apn.primeFromArray();

	}

}
