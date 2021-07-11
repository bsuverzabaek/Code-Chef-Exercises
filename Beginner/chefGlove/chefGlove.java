//run as java -ea chefGlove
import java.util.Scanner;

public class chefGlove{
	public static void main(String[] args){
		int T,N,a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] L = new int[N];
			int[] G = new int[N];

			for(int i=0;i<N;i++){
				L[i] = scan.nextInt();
				assert(L[i]>=1 && L[i]<=1000000000) : "L["+i+"] must be 1 <= L[i] <= 10^9";
			}

			for(int i=0;i<N;i++){
				G[i] = scan.nextInt();
				assert(G[i]>=1 && G[i]<=1000000000) : "G["+i+"] must be 1 <= G[i] <= 10^9";
			}

			a = 0;
			b = 0;

			for(int i=0;i<N;i++){
				if(L[i]<=G[i]){
					a++;
				}

				if(L[N-i-1]<=G[i]){
					b++;
				}
			}

			if(a==N && b==N){
				System.out.println("both");
			}else if(a!=N && b==N){
				System.out.println("back");
			}else if(a==N && b!=N){
				System.out.println("front");
			}else if(a!=N && b!=N){
				System.out.println("none");
			}

			T--;
		}
	}
}