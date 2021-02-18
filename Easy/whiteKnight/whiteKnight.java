//run as java -ea whiteKnight
import java.util.Scanner;

public class whiteKnight{
	public static void main(String[] args){
		int T,N,i,j,r;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=4 && N<=1000) : "N must be 4 <= N <= 1000";
			scan.nextLine();

			char[][] board = new char[1000][1000];
			int[][] ans = new int[1000][1000];

			for(i=0;i<N;i++){
				String line = scan.nextLine();
				for(j=0;j<N;j++){
					board[i][j] = line.charAt(j);
				}
			}

			for(j=N-1;j>=0;j--){
				for(i=0;i<N;i++){
					r = 0;

					if(j+1<N && i+2<N){
						r = max(r,ans[i+2][j+1]);
					}

					if(j+1<N && i-2>=0){
						r = max(r,ans[i-2][j+1]);
					}

					if(j+2<N && i+1<N){
						r = max(r,ans[i+1][j+2]);
					}

					if(j+2<N && i-1>=0){
						r = max(r,ans[i-1][j+2]);
					}

					if(board[i][j]=='P'){
						ans[i][j] = r+1;
					}else{
						ans[i][j] = r;
					}

					if(board[i][j]=='K'){
						break;
					}
				}

				if(i<N){
					break;
				}
			}

			System.out.println(ans[i][j]);

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}