package pack1;

public class ThisKyword {

	
	
	  int a= 2;  
	  public void getData()  { 
		  int a= 3; 
		  int b=a+this.a;  // sum of globl and local veriabl
		  System.out.println(a); 
		  System.out.println(this.a);
		  System.out.println(b);  
		  // this refers to current object- object scope lies in class level
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKyword  t = new ThisKyword ();
t.getData();
	}

}
