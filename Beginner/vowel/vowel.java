import java.util.Scanner;

public class vowel{
	public static void main(String[] args){
		char C;
		Scanner scan = new Scanner(System.in);

		while(true){
			C = scan.next(".").charAt(0);

			if(C<=64 || C>=91){
				System.out.println("Character C must be an upper case English letter");
			}else{
				break;
			}
		}

		if(C=='A' || C=='E' || C=='I' || C=='O' || C=='U'){
			System.out.println("Vowel");
		}else{
			System.out.println("Consonant");
		}
	}
}