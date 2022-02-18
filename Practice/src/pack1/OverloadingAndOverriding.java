package pack1;

public class OverloadingAndOverriding {
//multiple methods with the same name
	//argument count should be different or 
	//argument data type should be different
	
	public void getdata(int a) {
		
		System.out.println(a);
	}
	public void getdata(int a,int b) {
		
		System.out.println(b);
	}
	public void getdata(String a) {
		
		System.out.println(a);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverloadingAndOverriding  o = new OverloadingAndOverriding ();
o.getdata(2);
o.getdata("hello");
o.getdata(3, 5);


//overriding: 
//both have method same name,same signature, same parameters 
// it is in inheritance(audio systeme)
	}

}
