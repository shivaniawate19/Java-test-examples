package basicJava;


public class StaticAndNonStatic {
	
	String name = "shivani"; //non static global var
	static int age = 25;     //static global var

	public static void main(String[] args) {
		//how to call static method and variable?
		//1.by direct calling
		add();
		
		//2.calling by class name
		StaticAndNonStatic.add();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//how to call non static methods and variables?
		//1.by creating object of class name
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sum();
		System.out.println(obj.name);
		
		//can i access static method by using object reference?yes
		obj.add(); // but warning will be given

	}
	public void sum() {
		System.out.println("sum method");
		
	}
	public static void add() {
		System.out.println("add method");
		
	}

}
