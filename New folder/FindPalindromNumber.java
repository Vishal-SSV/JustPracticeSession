package arrayprograms;

import java.util.Scanner;

public class FindPalindromNumber {
	
	public void palindromNumber() {
		
		int orgnum=0,rev=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		n=sc.nextInt();
		orgnum=n;
		sc.close();
		while(n!=0){
			
			rev=rev*10 + n%10;
			n=n/10;
		}
		System.out.println(rev);
		System.out.println("=====================================");
		if(orgnum==rev) {
			System.out.println(orgnum +" is palindrome");
		}
		else {
			System.out.println(orgnum +" is not palindrome");
		}
		

		
	}
	
	public void palindromNumberFromArray() {
		
		int[] a=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 vlaue for Array ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		//print array
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			int rev=0;
			int orgnum=a[i];
			while(a[i]!=0){
				
				rev=rev*10 + a[i]%10;
				
				a[i]=a[i]/10;
			}
//			System.out.println(rev);
			System.out.println("=====================================");
			if(orgnum==rev) {
				System.out.println(orgnum +" is palindrome");
			}
			else {
				System.out.println(orgnum +" is not palindrome");
			}
		}
		
		
	}



	public static void main(String[] args) {
		
		FindPalindromNumber pn=new FindPalindromNumber();
		//pn.palindromNumber();
		pn.palindromNumberFromArray();

	}

}
