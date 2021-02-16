//run as java -ea findSum
import java.util.Scanner;

public class findSum{
	public static void main(String[] args){
		int T;
		long N,Q,p,q,sumN,sumQ,x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;
		sumQ = 0;

		while(T>0){
			N = scan.nextLong();
			Q = scan.nextLong();

			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";
			assert(Q>=1 && Q<=100000) : "Q must be 1 <= Q <= 10^5";

			sumN += N;
			sumQ += Q;

			if(T==1){
				assert(sumN<=500000) : "Sum of N must be <=5*10^5";
				assert(sumQ<=500000) : "Sum of Q must be <=5*10^5";
			}

			long[] B = new long[(int)N+1];
			B[1] = 0;

			for(long i=1;i<N;i++){
				x = scan.nextLong();
				assert(x>=1 && x<=1000000000) : "B[i] must be 1 <= B[i] <= 10^9";
				B[(int)(i)+1] = x-B[(int)i];
			}

			while(Q>0){
				p = scan.nextLong();
				q = scan.nextLong();
				assert(p>=1 && p<=N && q>=1 && q<=N) : "p and q must be 1 <= p,q <= N";

				if((p%2==1 && q%2==0) || (p%2==0 && q%2==1)){
					System.out.println(B[(int)p]+B[(int)q]);
				}else{
					System.out.println("UNKNOWN");
				}

				Q--;
			}

			T--;
		}
	}
}