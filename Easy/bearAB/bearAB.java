//run as java -ea bearAB
import java.util.Scanner;

public class bearAB{
	public static void main(String[] args){
		int T,N,K,countA,countB;
		long ans;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(N*K>=1 && N*K<=1000000000) : "N*k must be 1 <= N*K <= 10^9";

			S = scan.next();

			countA = 0;
			countB = 0;
			ans = 0;

			for(int i=0;i<N;i++){
				if(S.charAt(i)=='a'){
					countA++;
				}

				if(S.charAt(i)=='b'){
					countB++;
					ans += countA;
				}
			}

			ans *= K;
			ans += (long)countA*countB*K*(K-1)/2;
			System.out.println(ans);

			T--;
		}
	}
}