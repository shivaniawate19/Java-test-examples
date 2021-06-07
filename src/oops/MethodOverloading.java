package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		
		
		

	}
	public static void main(int a) {   //we can create main method but its not good
		
	}
	public void sum() {
		System.out.println("sum method --0 input parameter");
		
	}
	public void sum(int i) {
		System.out.println("sum method --1 input parameter");
		
		
	}
	public void sum(int m,int n) {
		System.out.println("sum method --2 input parameter");
		
		
	}
	

}
