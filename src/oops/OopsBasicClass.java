package oops;

public class OopsBasicClass {

	public static void main(String[] args) {
		OopsBasicClass obj = new OopsBasicClass();
		obj.adidas();
		int sum = obj.reebok();
		System.out.println(sum);
		String str = obj.puma();
		System.out.println(str);
		double b = obj.division(1000, 7);
		System.out.println(b);
				



	}
	
	public void adidas() {
		System.out.println("Adidas Method");
		
	}
	public int reebok() {
		System.out.println("areebok Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
		
	}
	public String puma() {
		System.out.println("Puma Method");
		String s1 = "selenium";
		return s1;
		
	}
	public double division(int x, int y) {
		double d = x/y;
		return d;
		
		
	}
	

	

}
