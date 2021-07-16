//run as java -ea chefFantasy
import java.util.Scanner;

public class chefFantasy{
	public static void main(String[] args){
		int T,N,S,def,up;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			S = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(S>=13 && S<=100) : "S must be 13 <= S <= 100";

			int[] P = new int[N];
			int[] c = new int[N];

			for(int i=0;i<N;i++){
				P[i] = scan.nextInt();
				assert(P[i]>=1 && P[i]<=100) : "P["+i+"] must be 1 <= P[i] <= 100";
			}

			for(int i=0;i<N;i++){
				c[i] = scan.nextInt();
			}

			def = 1000;
			up = 1000;

			for(int i=0;i<N;i++){
				if(c[i]==0){
					def = min(def,P[i]);
				}else if(c[i]==1){
					up = min(up,P[i]);
				}
			}

			if((S+up+def)>100){
				System.out.println("no");
			}else{
				System.out.println("yes");
			}

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}