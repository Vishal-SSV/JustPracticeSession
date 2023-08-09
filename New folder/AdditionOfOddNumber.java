package arrayprograms;

import java.util.Scanner;

public class AdditionOfOddNumber {
	
	public void oddNumberAddtion() {
		
		int cnt=0,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number for Odd Number addition");
		n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			
			if(i%2!=0) {
				cnt=cnt+i;
			}
		}
		System.out.println("Additon of odd Number:= " + cnt);
		
	}
	
	public void oddNumberAddtionFromArray() {
		
		int cnt1=0;
		int[] a=new int[7];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number for Odd Number addition");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Odd Number Addition given Array");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0) {
				System.out.println(a[i] + "odd number");
				cnt1=cnt1+a[i];
			}
		}
		System.out.println("Additon of odd Number:= " + cnt1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfOddNumber odd=new AdditionOfOddNumber();
		//odd.oddNumberAddtion();
		odd.oddNumberAddtionFromArray();

	}

}
