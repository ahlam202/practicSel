package pack1;

public class Constructor {

	//default constructor (not accept any values)
	 public Constructor(){ 
			System.out.println(" I am in the constructor");
			System.out.println(" I am in the constructor lecture 1"); 
			} 
	 
	 //parameterized constructor
	 public Constructor(int a,int b){
		 System.out.println("i am the parameterized constractor");
	 }
	 
	 //public constructor(string)
	 public Constructor(String s) {
		System.out.println(s);
	}
	 
	 
	 
	 public void getdata() { 
			System.out.println("I am the method"); 
			} 
	 //will not return values 
	 //name of constructor should be the class name
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c= new Constructor(); 
		Constructor con= new Constructor(4,5); 
		Constructor co= new Constructor("hello"); 
		// compiler will call implict constructor if you have not defined constructor block 
		//when ever you create an object constructor is called 
		//block of code when ever an object is created }
        c.getdata();
	}
	}


