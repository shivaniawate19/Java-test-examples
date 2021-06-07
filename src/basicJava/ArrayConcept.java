package basicJava;

public class ArrayConcept {

	public static void main(String[] args) {
		//1.int array
		//lowest index = 0
		//upper bound/index = n-1
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//error = ArrayIndexOutOfBoundExeption
		System.out.println(i.length);//size/length of array
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		//2.double array:
		double d[] = new double [3];
		d[0]= 12.33;
		d[1]= 13.44;
		System.out.println(d[1]);
		
		//3.char array
		char c[] = new char[2];
		c[0] = 'a';
		//4. string array
				
	}

}
