package pack1;

public class InhiritanceCh extends InheritanceP {
// multiple inheritance is not allowed in java
	
	public void engine() {
		System.out.println("new engine");
	
	}
	//String color="green";
	public void color() {
		System.out.println(color);
		//System.out.println(super.color);//when we have same variable 
	}
	/*public void audiosystem() {
		System.out.println("new audio");
		//super.audiosystem();//use super when we have same methods in child and perent class
		//
	}*/
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InhiritanceCh i = new InhiritanceCh();
i.audiosystem();
i.brakes();
i.gear();
i.color();

	}

}
