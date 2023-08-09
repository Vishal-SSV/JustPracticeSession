package arrayprograms;

import java.util.Scanner;

public class RemoveDuplicateValueFromArray {
	
	
	
	public void duplicateValueOfArray() {
		
		int[]a=new int[6];
		int[]b=new int[a.length];
		int i,j,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 vlaue for Array ");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("================================");
		//print array
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n================================");
		
		//int[] b=new int [a.length];
		
		for(i=0;i<a.length;i++) {
			int cnt=0;
			for(j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {

					cnt++;
					break;
				}				
			}
			if(cnt==0) {
				b[k]=a[i];
				k++;
			}
		}
		System.out.println("My Unique Array is");
		for(i=0;i<k;i++) {
			System.out.print(b[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicateValueFromArray da=new RemoveDuplicateValueFromArray();
		da.duplicateValueOfArray();
	
	}

}
