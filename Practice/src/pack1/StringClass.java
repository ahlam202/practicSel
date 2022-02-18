package pack1;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// string is an object that represant a sequence of character
		
		//we can define it in 2 ways
		//1/string literal
		//2/by creating obj of string (use "new" keyword)
		
		String a="ah"; //====string literal
		System.out.println(a);
		String s = new String("ah"); //=== by creating obj of string
		System.out.println(s);
		
		String b="welcome to TX";
		System.out.println(b.toUpperCase());
		System.out.println(b.concat("ahlam"));
		System.out.println(b.charAt(3));
		System.out.println(b.contains("t"));
		System.out.println(b.isEmpty());
	    
		String ar[]=b.split("to");
	    System.out.println(ar[0]);
	    System.out.println(ar[1]);
	
		}
	
		
		
		
		
		
		
		//print the string in reverse (qst interviw)
		
		/*String s= "ahlam";
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
			t= t+s.charAt(i);
		}
	 //StringBuffer sb = new StringBuffer(s);
	 //sb.reverse();
	 
		//System.out.println(sb);*/
	 
		
		
	}	
	


/*1. why strings are immutable in java
 2. how memory is allocated to string literal and string class obj
 3. diffrance between stringBuffer and stringBuild
 4. diff btw == and equels */
