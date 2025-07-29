
public class Convergence {

	public static void main(String[] args) {
		//Wrapper classes 
		int a = 10;
		Integer i = new Integer(a); 
		System.out.println("i :"+i);
		
		// type-conversion 
		double d = i.doubleValue(); 
		// Integer => double 
		System.out.println("d :"+d);
		
		float f = i.floatValue(); 
		// Integer => float 
		System.out.println("f :"+f);
		
		byte b = i.byteValue(); 
		//Integer => byte 
		System.out.println("b :"+b);
		
		// Helper function 
		int max = Integer.max(50, 70); 
		System.out.println("Max : "+max);
	}

}
