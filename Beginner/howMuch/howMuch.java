//run as java -ea howMuch
import java.util.Scanner;

public class howMuch{
	public static void main(String[] args){
		int R;
		Scanner scan = new Scanner(System.in);

		R = scan.nextInt();
		assert(R>=1 && R<=1000000000) : "R must be 1 <= R <= 10^9";

		if(R>=1 && R<=50){
			System.out.println("100");
		}else if(R>=51 && R<=100){
			System.out.println("50");
		}else{
			System.out.println("0");
		}
	}
}