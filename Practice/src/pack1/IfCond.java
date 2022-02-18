package pack1;

public class IfCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//using for loop with if condition
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				System.out.println("T");
			} else {
				System.out.println("F");
			}
	 
		}
		
		//nested loops works - 
		/*for(int i=1;i<=4;i++)  //(outer for loop) this block will loop for 4 times 
		{
	  System.out.println("outer loop started"); 
		for(int j=1;j<=4;j++) // inner loop 
			{ 
			System.out.println("inner loop");
			}
				System.out.println("outer loop finshed");
			 
			}*/
		
		/*int k=1;
		for(int i=0;i<4;i++)  //(outer for loop) this block will loop for 4 times 
		{
	  //System.out.println("outer loop started"); 
		for(int j=1;j<=4-i;j++) // inner loop 
			{ 
			System.out.print(k);
			System.out.print("\t");
			
			k++;
			}
		System.out.println("");
		1 2 3 4
		5 6 7
		8 9 
		10
		} 
		int k=1;
	for (int i = 1; i <5; i++) {
		//System.out.println("outer");
		for (int j = 1; j <=i; j++) {
		System.out.print(k);
		System.out.print("\t");
		k++;
		}
		System.out.println("");
		1
		2 3 
		4 5 6
		7 8 9 10
		
	}	
	for (int i = 1; i < 5; i++) {
			//System.out.println("outer");
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
				System.out.print("\t");
				
				
			}
			System.out.println("");	
			/*1
			1 2
			1 2 3
			1 2 3 4 
		int k=1;
		for (int i = 1; i < 5; i++) {
			//System.out.println("outer");
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");	
			
		}*/
		
		
		
	} 
				
}
