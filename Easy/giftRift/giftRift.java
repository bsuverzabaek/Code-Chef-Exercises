//run as java -ea giftRift
import java.util.Scanner;

public class giftRift{
	public static void main(String[] args){
		int R,C,ans;
		Scanner scan = new Scanner(System.in);

		R = scan.nextInt();
		C = scan.nextInt();

		assert(R>=1 && R<=100) : "R must be 1 <= R <= 100";
		assert(C>=1 && C<=100) : "C must be 1 <= C <= 100";

		int[][] gift = new int[R][C];
		int[] mn = new int[R];
		int[] mx = new int[C];

		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				gift[i][j] = scan.nextInt();
				assert(gift[i][j]>=1 && gift[i][j]<100000000) : "Gift costs must be 1 <= gc <= 10^8";
			}
		}

		for(int i=0;i<R;i++){
			mn[i] = gift[i][0];
		}

		for(int i=0;i<C;i++){
			mx[i] = gift[0][i];
		}

		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				if(mn[i]>gift[i][j]){
					mn[i] = gift[i][j];
				}

				if(mx[j]<gift[i][j]){
					mx[j] = gift[i][j];
				}
			}
		}

		ans = 0;

		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				if(gift[i][j]==mn[i] && gift[i][j]==mx[j]){
					ans = gift[i][j];
				}
			}
		}

		if(ans!=0){
			System.out.println(ans);
		}else{
			System.out.println("GUESS");
		}
	}
}