package pack1;

public class Static {

	
	String name; // instance variable
	String address;
	static String city="TX"; // all static variable is class variable
	static int i=0;
	
	public Static(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.address=address;
		i++;
		System.out.println(i);
		
	}
	
	public void getdata() {
		
		System.out.println(name+" "+ address+" "+city);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Static s = new Static("Bob","Austin");
Static st = new Static("mia","dallas");
s.getdata();
st.getdata();

	}

}
