//run as java -ea matrixGame
import java.util.Scanner;

public class matrixGame{
	public static void main(String[] args){
		int T,N,M,res;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=50) : "N must be 1 <= N <= 50";
			assert(M>=1 && M<=50) : "M must be 1 <= M <= 50";

			int[][] mat = new int[N][M];
			int[] a = new int[N];

			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					mat[i][j] = scan.nextInt();
					assert(mat[i][j]>=1 && mat[i][j]<=50) : "All matrix values must be 1 <= mat[i][j] <= 50";
				}
			}

			for(int i=0;i<N;i++){
				a[i] = mat[i][M-1];

				for(int j=M-2;j>=0;j--){
					if(mat[i][j]>a[i]){
						a[i] = mat[i][j];
					}else{
						a[i] = mat[i][j]-1;
					}
				}
			}

			res = 0;

			for(int i=0;i<N;i++){
				res ^= a[i];
			}

			if(res!=0){
				System.out.println("FIRST");
			}else{
				System.out.println("SECOND");
			}

			T--;
		}
	}
}