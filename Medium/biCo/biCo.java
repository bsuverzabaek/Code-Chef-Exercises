//run as java -ea biCo
import java.util.Scanner;

public class biCo{
	public static void main(String[] args){
		int T,R,C,moves;
		long G;
		Scanner scan = new Scanner(System.in);

		long[][] grid = new long[100][50];
		long[] coins = new long[50];

		for(int i=0;i<100;i++){
			grid[i][0] = 1;

			for(int j=1;j<=i && j<50;j++){
				if(i==j){
					grid[i][j] = 1;
				}else{
					grid[i][j] = grid[i-1][j-1]+grid[i-1][j];
				}
			}
		}

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10000";

		while(T>0){
			R = scan.nextInt();
			C = scan.nextInt();
			G = scan.nextLong();

			assert(C>=0 && C<=49) : "C must be 0 <= C <= 49";
			assert(R>=0 && R<=99) : "R must be 0 <= R <= 99";
			assert(G>=1 && G<=1000000000000L) : "G must be 1 <= G <= 10^12";

			moves = 0;

			while(G>0){
				R = C;

				while(R<100 && grid[R][C]<=G){
					R++;
				}

				R--;
				G -= grid[R][C];
				coins[moves] = grid[R][C];
				moves++;
				C--;
			}

			System.out.println(moves);

			for(int i=0;i<moves;i++){
				System.out.print(coins[i] + " ");
			}

			System.out.println();

			T--;
		}

	}
}