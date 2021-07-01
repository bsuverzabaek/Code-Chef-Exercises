//run as java -ea strangeOps
import java.util.Scanner;

public class strangeOps{
	public static void main(String[] args){
		int T,K,N,a,s;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<1000) : "N must be 1 <= N <= 10^3";
			assert(K>=1 && K<=1000000) : "K must be 1 <= K <= 10^6";

			s = 0;

			while(N>0){
				a = scan.nextInt();
				assert(a>=1 && a<=1000000000) : "Each element must be 1 <= a <= 10^9";

				s += a;

				N--;
			}

			if(s%2==0 && K==1){
				System.out.println("odd");
			}else{
				System.out.println("even");
			}

			T--;
		}
	}
}