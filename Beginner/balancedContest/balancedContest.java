//run as java -ea balancedContest
import java.util.Scanner;

public class balancedContest{
	public static void main(String[] args){
		int T,N,P,s,r,easy,hard;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=500) : "T must be 1 <= T <= 500";

		while(T>0){
			N = scan.nextInt();
			P = scan.nextInt();

			assert(N>=1 && N<=500) : "N must be 1 <= N <= 500";
			assert(P>=1 && P<=100000000) : "P must be 1 <= P <= 10^8";

			int[] a = new int[N];

			s = P/2;
			r = P/10;
			easy = 0;
			hard = 0;

			for(int i=0;i<N;i++){
				a[i] = scan.nextInt();
				assert(a[i]>=1 && a[i]<=P) : "Number of participants must be 1 <= a <= P";

				if(a[i]>=s){
					easy++;
				}else if(a[i]<=r){
					hard++;
				}
			}

			if(hard==2 && easy==1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}
}