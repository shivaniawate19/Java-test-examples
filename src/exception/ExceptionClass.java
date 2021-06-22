package exception;

public class ExceptionClass {

	public static void main(String[] args) {
		int x =0;
		int y = 10;
//     	System.out.println(y/x);
		
		try {
			System.out.println(y/x);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			
		}catch (Exception e) {
			System.out.println("Exeption Handling");
			
		}
		System.out.println("After Exception");

	}

}
