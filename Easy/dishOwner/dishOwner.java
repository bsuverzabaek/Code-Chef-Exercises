//run as java -ea dishOwner
import java.util.Scanner;

public class dishOwner{
	public static void main(String[] args){
		int T,N,Q,l,x,y,fx,fy;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=25) : "T must be 1 <= T <= 25";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";

			int[] S = new int[N];
			int[] X = new int[N];

			for(int i=0;i<N;i++){
				S[i] = scan.nextInt();
				assert(S[i]>=0 && S[i]<=1000000) : "S["+i+"] must be 0 <= S[i] <= 10^6";
				X[i] = i;
			}

			Q = scan.nextInt();
			assert(Q>=1 && Q<=10000) : "Q must be 1 <= Q <= 10^4";

			while(Q>0){
				l = scan.nextInt();
				assert(l==0 || l==1) : "l must be either 0 or 1";

				if(l==0){
					x = scan.nextInt();
					y = scan.nextInt();
					assert(x>=1 && x<=N && y>=1 && y<=N) : "x and y must be 1 <= x,y <= N";

					x--;
					y--;

					fx = find(x,X);
					fy = find(y,X);

					if(fx==fy){
						System.out.println("Invalid query!");
					}else{
						if(S[fx]>S[fy]){
							X[fy] = fx;
						}else if(S[fx]<S[fy]){
							X[fx] = fy;
						}
					}
				}else{
					x = scan.nextInt();
					assert(x>=1 && x<=N) : "x must be 1 <= x <= N";

					System.out.println(find(x-1,X)+1);
				}

				Q--;
			}

			T--;
		}
	}

	public static int find(int x,int[] X){
		int y = x;

		while(x!=X[x]){
			x = X[x];
		}

		while(y!=x){
			int t = X[y];
			X[y] = x;
			y = t;
		}

		return x;
	}
}