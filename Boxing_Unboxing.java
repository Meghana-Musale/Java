
public class Boxing_Unboxing {

	public static void main(String[] args) {
		//Converting primitive to wrapper --> Boxing 
		int a = 10;
		Integer b = new Integer(a); // Boxing 
		System.out.println("b :"+b);
		
		//Converting wrapper to primitive -> unboxing 
		int c = b.intValue(); // Unboxing  
		System.out.println("c :"+c);

	}

}
