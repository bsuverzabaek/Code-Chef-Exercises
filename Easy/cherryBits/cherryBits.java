//run as java -ea cherryBits
import java.util.Scanner;

public class cherryBits{
	public static void main(String[] args){
		int N,M,Q;
		int x1,x2,y1,y2;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		assert(N>=1 && N<=1000 && M>=1 && M<=1000) : "N and M must be 1 <= N,M <= 1000";

		char[][] S = new char[N][M];
		int[][] ans = new int[N][M];
		int[][] pre = new int[N][M];

		for(int i=0;i<N;i++){
			S[i] = scan.next().toCharArray();
		}

		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				assert(S[i][j]=='0' || S[i][j]=='1') : "There can only be 0 or 1 in the array";
				ans[i][j] = S[i][j]-'0';
				pre[i][j] = 0;
			}
		}

		Q = scan.nextInt();
		assert(Q>=1 && Q<=1000000) : "Q must be 1 <= Q <= 10^6";

		while(Q>0){
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();

			assert(x1>=1 && x1<=x2 && x2>=x1 && x2<=N) : "x1 and x2 must be 1 <= x1 <= x2 <= N";
			assert(y1>=1 && y1<=y2 && y2>=y1 && y2<=M) : "y1 and y2 must be 1 <= y1 <= y2 <= M";

			x1--;
			x2--;
			y1--;
			y2--;

			pre[x1][y1]++;

			if(x2+1<N && y2+1<M){
				pre[x2+1][y2+1]++;
			}

			if(x2+1<N){
				pre[x2+1][y1]--;
			}

			if(y2+1<M){
				pre[x1][y2+1]--;
			}

			Q--;
		}

		for(int i=0;i<M;i++){
			for(int j=1;j<N;j++){
				pre[j][i] += pre[j-1][i];
			}
		}

		for(int i=0;i<N;i++){
			for(int j=1;j<M;j++){
				pre[i][j] += pre[i][j-1];
			}
		}

		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(pre[i][j]%2!=0){
					if(ans[i][j]==1){
						System.out.print(0);
					}else{
						System.out.print(1);
					}
				}else{
					System.out.print(ans[i][j]);
				}
			}
			System.out.println();
		}
	}
}