import java.util.Scanner; 
public class Convergence_using_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Given number is "+num);
		System.out.println("Binary number :" +Integer.toBinaryString(num));
		System.out.println("Octal number :" +Integer.toOctalString(num));
		System.out.println("Hexadecimal number :" +Integer.toHexString(num));
	}

}
