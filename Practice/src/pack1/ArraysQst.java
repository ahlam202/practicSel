package pack1;

public class ArraysQst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//get the minimum (smallest) number in this matrix
		/*2 4 5
		  3 4 7 
		  1 2 9*/
		
		int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min=a[0][0];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j]<min) {//2---to find the maximum should create a[i][j]>min 
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
		
	}

}
