//run as java -ea distinctSums
import java.util.Scanner;

public class distinctSums{
	public static void main(String[] args){
		int T,L,R;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			L = scan.nextInt();
			R = scan.nextInt();

			assert(L>=1 && L<=R && R<=1000000) : "L and R must be 1 <= L <= R <= 10^6";

			System.out.println((2*R)-(2*L)+1);

			T--;
		}	
	}
}