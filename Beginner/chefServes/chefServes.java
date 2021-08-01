//run as java -ea chefServes
import java.util.Scanner;

public class chefServes{
	public static void main(String[] args){
		int T,P1,P2,K,a;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			P1 = scan.nextInt();
			P2 = scan.nextInt();
			K = scan.nextInt();

			assert(P1>=0 && P1<=1000000000) : "P1 must be 0 <= P1 <= 10^9";
			assert(P2>=0 && P2<=1000000000) : "P2 must be 0 <= P2 <= 10^9";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			a = (P1+P2)/K;

			if(a%2==0){
				System.out.println("CHEF");
			}else{
				System.out.println("COOK");
			}

			T--;
		}
	}
}