package arrayprograms;

public class ArrayClass {
	public static void main(String args[]) {
		//we declare array following way.
		//1)
		int[]a=new int[5];
		//2)
		int[]b;
		b=new int[5];
		
		//we assign value following way
		int[]c={10,30,50,90,70,47,1};
		
		//Print All Array Value.
		System.out.println("All Value store in Array");
		for(int i=0;i<c.length;i++) {
			
			System.out.print(c[i]+" ");
		}
		System.out.println("");
		System.out.println("================================");
		
		
		//Print largest number without changing its original positions
		int max=c[0];
		for(int i=0;i<c.length;i++) {
			
			if(c[i]>max) {
				
				max=c[i];
			}
		}
		System.out.println("Largest Number : "+ max);		
		System.out.println("================================");
		
		//Print smallest number without changing its original positions
		int min=c[0];
		for(int i=0;i<c.length;i++) {
			
			if(c[i]<min) {
				
				min=c[i];
			}
		}
		System.out.println("Smallest Number : "+ min);
		System.out.println("================================");
		//Arrange array in ascending order.
		int temp;
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]>c[j]) {
					temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}				
			}
			System.out.print(c[i]+" ");
		}
		System.out.println("");
		System.out.println("================================");
		
		//Arrange array in descending order.
		int temp1;
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]<c[j]) {
					temp1=c[j];
					c[j]=c[i];
					c[i]=temp1;
				}				
			}
			System.out.print(c[i]+" ");
		}
		System.out.println("");
		System.out.println("================================");
		
		
		//Print only prime numbers from array
		int cnt;
		System.out.println("\nPrime Numbers from Array are ");
		for(int i=0;i<c.length;i++) {
//			n=a[i];
			cnt=0;
			for(int j=2;j<c[i];j++) {
				
				if(c[i]%j==0) {
					cnt++;
					break;
				}
			}
			if(cnt==0) {
				System.out.print(c[i]+" ");
			}
		}
	}

}
