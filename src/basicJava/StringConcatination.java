package basicJava;

public class StringConcatination {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y = "selenium";
		
		double c = 12.50;
		double d = 33.50;
		 
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y); 
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);

	}

}
