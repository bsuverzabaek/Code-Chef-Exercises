//run as java -ea chefIdeal
import java.util.Scanner;

public class chefIdeal{
	public static void main(String[] args){
		int X;
		Scanner scan = new Scanner(System.in);

		System.out.println(1);

		X = scan.nextInt();
		System.out.println(X == 2 ? 3 : 2);

		scan.close();
	}
}