//run as java -ea maxPlus
import java.util.Scanner;
import java.lang.Math;

public class maxPlus{
	public static void main(String[] args){
		int T,N,M,sumN,sumM;
		long max,max_upto,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;
		sumM = 0;

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=3 && N<=1000) : "N must be 3 <= N <= 1000";
			assert(M>=3 && M<=1000) : "M must be 3 <= M <= 1000";

			sumN += N;
			sumM += M;

			if(T==1){
				assert(sumN<=1000) : "Sum of N must be <=1000";
				assert(sumM<=1000) : "Sum of M must be <=1000";
			}

			int[][] G = new int[N+1][M+1];
			int[][] left = new int[N+1][M+1];
			int[][] right = new int[N+1][M+1];
			int[][] up = new int[N+1][M+1];
			int[][] down = new int[N+1][M+1];

			max = Long.MIN_VALUE;

			for(int i=1;i<=N;i++){
				for(int j=1;j<=M;j++){
					G[i][j] = scan.nextInt();
					assert(Math.abs(G[i][j])<=1000000) : "|G[i][j]| must be <=10^6";
				}
			}

			for(int i=1;i<=N;i++){
				max_upto = 0;
				for(int j=1;j<=M;j++){
					if(max_upto>=0){
						max_upto += G[i][j];
						left[i][j] = (int) max_upto;
					}else{
						max_upto = G[i][j];
						left[i][j] = (int) max_upto;
					}
				}
			}

			for(int i=1;i<=N;i++){
				max_upto = 0;
				for(int j=M;j>=1;j--){
					if(max_upto>=0){
						max_upto += G[i][j];
						right[i][j] = (int) max_upto;
					}else{
						max_upto = G[i][j];
						right[i][j] = (int) max_upto;
					}
				}
			}

			for(int j=1;j<=M;j++){
				max_upto = 0;
				for(int i=1;i<=N;i++){
					if(max_upto>=0){
						max_upto += G[i][j];
						up[i][j] = (int) max_upto;
					}else{
						max_upto = G[i][j];
						up[i][j] = (int) max_upto;
					}
				}
			}

			for(int j=1;j<=M;j++){
				max_upto = 0;
				for(int i=N;i>=1;i--){
					if(max_upto>=0){
						max_upto += G[i][j];
						down[i][j] = (int) max_upto;
					}else{
						max_upto = G[i][j];
						down[i][j] = (int) max_upto;
					}
				}
			}

			for(int i=2;i<N;i++){
				for(int j=2;j<M;j++){
					ans = (G[i][j]+left[i][j-1]+right[i][j+1]+up[i-1][j]+down[i+1][j]);
					if(ans>max){
						max = ans;
					}
				}
			}

			System.out.println(max);

			T--;
		}
	}
}