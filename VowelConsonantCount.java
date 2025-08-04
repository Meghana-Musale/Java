import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		int vowels = 0;
		int consonants = 0;
		for(char c : str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels++;
			}
			else if(Character.isLetter(c)) {
				consonants++;
			}
		}
		System.out.println("Vowels :"+vowels+ "\nConsonants :"+consonants);
	}

}
