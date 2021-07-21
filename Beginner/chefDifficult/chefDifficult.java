//run as java -ea chefDifficult
import java.util.Scanner;

public class chefDifficult{
	public static void main(String[] args){
		int T,a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			a = scan.nextInt();
			b = scan.nextInt();

			assert(a>=1 && a<=1000000000) : "a must be 1 <= a <= 10^9";
			assert(b>=1 && b<=1000000000) : "b must be 1 <= b <= 10^9";

			if(a==b || a<b || a>b){
				System.out.println("YES");
			}

			T--;
		}
	}
}