package arrayprograms;

import java.util.Scanner;

public class PrimeNumber {

	public void CheckPrime() {
		
		int i,cnt=0,n;
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				cnt++;
				break;
			}
			
		}
		if(cnt==0)
		{
			System.out.println(n+" is a Prime Number");
		}
		else {
			System.out.println(n+" is not a Prime Number");

		}
	}
	public void PrimeInArray() {
		int []a=new int[7];
		int i,cnt=0,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 values in the array");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("My Array is ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+"     ");
		}
		
		System.out.println("\nPrime Numbers from Array are ");
		for(i=0;i<a.length;i++) {
//			n=a[i];
 		cnt=0;
			for(j=2;j<a[i];j++) {
				
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
	
	void Divides() {
		int n=121,i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber p =new PrimeNumber();
//		p.CheckPrime();
		p.PrimeInArray();
//		p.Divides();
	}

}
