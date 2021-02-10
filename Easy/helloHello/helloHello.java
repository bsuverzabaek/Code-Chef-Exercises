//run as java -ea helloHello
import java.util.Scanner;

public class helloHello{
	public static void main(String[] args){
		int T,N,ans;
		float D,U,M,R,C,min;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			D = scan.nextFloat();
			U = scan.nextFloat();
			N = scan.nextInt();

			assert(D>=0.5 && D<=10.0) : "D must be 0.5 <= D <= 10.0";
			assert(U>=1 && U<=10000) : "U must be 1 <= U <= 10000";
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			min = D*U;
			ans = 0;

			for(int i=0;i<N;i++){
				M = scan.nextFloat();
				R = scan.nextFloat();
				C = scan.nextFloat();

				assert(M>=1 && M<=36) : "M must be 1 <= M <= 36";
				assert(R>=0.05 && R<D) : "R must be 0.05 <= R < D";
				assert(C>=1 && C<=1000) : "C must be 1 <= C <= 1000";

				if((C/M)+(R*U)<min){
					min = (C/M)+(R*U);
					ans = i+1;
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}