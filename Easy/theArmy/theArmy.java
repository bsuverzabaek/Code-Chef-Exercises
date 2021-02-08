//run as java -ea theArmy
import java.util.Scanner;
import java.lang.Math;

public class theArmy{
	public static void main(String[] args){
		int T,N,M,sumN,sumM;
		int minM,maxM,x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10000";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			sumN = 0;
			sumM = 0;

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(M>=1 && M<=100000) : "M must be 1 <= M <= 10^5";

			sumN += N;
			sumM += M;

			if(T==1){
				assert(sumN>=1 && sumN<=100000) : "Sum of N must be 1 <= sumN <= 10^5";
				assert(sumM>=1 && sumM<=100000) : "Sum of M must be 1 <= sumM <= 10^5";
			}

			minM = 1111111;
			maxM = -1111111;

			while(M>0){
				x = scan.nextInt();

				minM = Math.min(x,minM);
				maxM = Math.max(x,maxM);

				M--;
			}

			for(int i=0;i<N;i++){
				System.out.print(Math.max(Math.abs(i-minM),Math.abs(i-maxM)) + " ");
			}

			System.out.println();

			T--;
		}
	}
}