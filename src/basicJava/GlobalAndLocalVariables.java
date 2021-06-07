package basicJava;

public class GlobalAndLocalVariables {
	//global variables
	String name = "shivani";
	int age = 25;
	
	public static void main(String[] args) {
		int i = 10;    //local var for main method
		System.out.println(i);
		GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.add());

	}
	public int add() {
		int i = 20;   // local var for add method
		int j = 15;
		int k = (i+j);
		return k;
	}

}
