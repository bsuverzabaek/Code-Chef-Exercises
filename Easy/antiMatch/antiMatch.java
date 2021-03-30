//run as java -ea antiMatch
import java.util.Scanner;

public class antiMatch{
	public static void main(String[] args){
		int T,N,M,u,v,max,tri,v1,v2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";
			assert(M>=0 && M<=10000) : "M must be 0 <= M <= 10^4";

			int[][] adjList = new int[N][N-1];

			for(int i=0;i<N;i++){
				for(int j=0;j<N-1;j++){
					adjList[i][j] = 0;
				}
			}

			int[] edgeCnt = new int[N];

			for(int i=0;i<N;i++){
				edgeCnt[i] = 0;
			}

			for(int i=0;i<M;i++){
				u = scan.nextInt();
				v = scan.nextInt();

				assert(u>=1 && u<=N) : "u must be 1 <= u <= N";
				assert(v>=1 && v<=N) : "v must be 1 <= v <= N";
				assert(u!=v) : "u must not equal v";

				adjList[u-1][edgeCnt[u-1]] = v-1;
				adjList[v-1][edgeCnt[v-1]] = u-1;

				edgeCnt[u-1]++;
				edgeCnt[v-1]++;
			}

			max = 0;

			for(int i=0;i<N;i++){
				if(edgeCnt[i]>max){
					max = edgeCnt[i];
				}
			}

			if(max==2){
				tri = 0;

				for(int i=0;i<N;i++){
					if(edgeCnt[i]==2){
						v1 = adjList[i][0];
						v2 = adjList[i][1];

						for(int j=0;j<edgeCnt[v1];j++){
							if(adjList[v1][j]==v2){
								tri = 1;
								break;
							}
						}
					}
				}

				if(tri!=0){
					max = 3;
				}
			}

			System.out.println(max);

			T--;
		}
	}
}