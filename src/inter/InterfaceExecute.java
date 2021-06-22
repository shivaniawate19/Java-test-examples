package inter;

public class InterfaceExecute implements InterfaceThird{

	

	@Override
	public void car() {
		System.out.println("Car Method");
	
	}

	@Override
	public void bike() {
		System.out.println("bike Method");
		
		
	}
	
     public static void main(String[] args) {
    	 InterfaceExecute obj = new InterfaceExecute();
    	 obj.bike();
    	 obj.car();
		
	}

}
