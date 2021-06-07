package oops;


public class OopsPracticeClass {

	public static void main(String[] args) {
		OopsPracticeClass obj = new OopsPracticeClass();
		obj.mango();
		int c = obj.apple();
		System.out.println(c);
		String s1 = obj.banana();
		System.out.println(s1);
		double d = obj.kivi(30, 40);
		System.out.println(d);
		
		
		
		
		}
	public void mango() {
		System.out.println("Mango method");;
		
	}
	public int apple() {
		System.out.println("Apple method");
		int a = 25;
		int b = 35;
		int c = (b-a);
		System.out.println("print c" + c);
		return c;
		
	}
	public String banana() {
		System.out.println("Banana method");
		String s1 = "hello";
		return s1;
		
	}
	public double kivi(int x,int y) {
		double d = x*y;
		return d;
		
		
	}

}
