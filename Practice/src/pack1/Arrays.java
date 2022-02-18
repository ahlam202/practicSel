package pack1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array: a container which stores multiple values of the same data type
		//1. single dimension
	/*	int a[]=new int[5];//declares an array and allocates memory for the values
		a[0]=2;
		a[1]=6;
	    a[2]=1;
	    a[3]=9;
	    a[4]=12;//initialized values into that array
	    
	    for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);// retrieve values present in this array 
		}*/
		
	    // use this method it is easy and fast
	    int b[]= {1,4,3,5,7,8};
	   /* for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	    //we can used for loop or for each loop method
	    for (int i : b) {
		System.out.println(i);
	}*/
	    //check if array has multiple of 2
	    for (int i = 0; i < b.length; i++) {
			if (b[i] %2 ==0) {
				System.out.println(b[i]);
				break;// we use break to terminate from loop immediately when we get what we want 
				      // we use it when we use for loop and if together 
			}
		} 
	//multi dimension
	  /*  int c[][]=new int[2][3];
	    c[0][0]=2; //c[row][column]
	    c[0][1]=4;
	    c[0][2]=5;
	    c[1][0]=3;
	    c[1][1]=4;
	    c[1][2]=7;
	    for (int i = 0; i < 2; i++) {//have 2 row
	    	for (int j = 0; j < 3; j++) {//have 3 column
	    		System.out.println(c[i][j]);
			}
		}
	   
	    int d[][]= {{2,4,5},{3,4,7}};
	    for (int i = 0; i < 2; i++) { //row
			for (int j = 0; j <3; j++) {//column
				System.out.println(d[i][j]);
			}
		}*/
	
	
	
	
	
	}
}
