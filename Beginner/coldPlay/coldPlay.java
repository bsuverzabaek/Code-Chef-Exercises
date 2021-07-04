//run as java -ea coldPlay
import java.util.Scanner;

public class coldPlay{
	public static void main(String[] args){
		int T,M,S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			M = scan.nextInt();
			S = scan.nextInt();

			assert(M>=1 && M<=100) : "M must be 1 <= M <= 100";
			assert(S>=1 && S<=10) : "S must be 1 <= S <= 10";

			System.out.println(M/S);

			T--;
		}
	}
}