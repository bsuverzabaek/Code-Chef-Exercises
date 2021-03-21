//run as java -ea euGene
import java.util.Scanner;

public class euGene{
	public static void main(String[] args){
		int T;
		long A,D,R,L,sum,K;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			A = scan.nextLong();
			D = scan.nextLong();
			L = scan.nextLong();
			R = scan.nextLong();

			assert(A>=1 && A<=1000000000) : "A must be 1 <= A <= 10^9";
			assert(D>=0 && D<=1000000000) : "D must be 0 <= D <= 10^9";
			assert(L>=1 && L<=R) : "L must be 1 <= L <= R";
			assert(R>=1 && R<=1000000000000000000L) : "R must be 1 <= R <= 10^18";

			A = F(A);
			D = F(D);
			K = (R-L+1)/9;

			sum = 0;

			for(long i=0;i<9;i++){
				sum += F(A+i*D);
			}

			sum *= K;

			for(long i=L;i<=R-(K*9);i++){
				sum += F(A+(i-1)*D);
			}

			System.out.println(sum);

			T--;
		}
	}

	public static long F(long X){
		if(X%9==0){
			return 9;
		}else{
			return X%9;
		}
	}
}