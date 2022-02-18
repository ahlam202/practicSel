package pack1;

public class InterfaceAndClass2 implements InterfaceAndClasss,inerface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceAndClass2 i = new InterfaceAndClass2();
i.redstop();
i.greengo();
i.fashyaloow();
i.walkon();
i.Trainsymbol();


	}
public void walkon() {
	System.out.println("walking");
	
}
	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation"); 
	}

	@Override
	public void fashyaloow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yallow implementation"); 
	}
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

}
