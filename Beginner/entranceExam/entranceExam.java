//run as java -ea entranceExam
import java.util.Scanner;
import java.util.Arrays;

public class entranceExam{
	public static void main(String[] args){
		int T,N,K,E,M;
		int tot,score,x,y,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();
			E = scan.nextInt();
			M = scan.nextInt();

			assert(K>=1 && K<N && N>K && N<=10000) : "N and K must be 1 <= K < N <= 10^4";
			assert(M>=1 && M<=1000000000) : "M must be 1 <= M <= 10^9";
			assert(E>=1 && E<=4) : "E must be 1 <= E <= 4";

			int[] totals = new int[N-1];

			for(int i=0;i<N-1;i++){
				tot = 0;
				for(int j=0;j<E;j++){
					score = scan.nextInt();
					assert(score>=1 && score<=M) : "Score must be 1 <= score <= M";
					tot += score;
				}
				totals[i] = tot;
			}

			Arrays.sort(totals);
			x = totals[1];
			y = 0;

			for(int i=0;i<E-1;i++){
				score = scan.nextInt();
				assert(score>=1 && score<=M) : "Score must be 1 <= score <= M";
				y += score;
			}

			if(max(0,x-y+1)>M){
				System.out.println("Impossible");
			}else{
				System.out.println(max(0,x-y+1));
			}

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