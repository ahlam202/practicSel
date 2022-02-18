package pack1;



public class MethodsObject {
int a=2;
	
	public void data() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how create object
		MethodsObject m = new MethodsObject();//call from other method
			 m.data();
			
			
				
				System.out.println(m.a);// call from veriabale
				
				MethodsObject2 mo = new MethodsObject2();// call fom other class 
				mo.add();
				
			
		/*1. what is platform independent
		 2. what is JDK & JRE
		 */
				
				
		
	
	}
	
	}