//run as java -ea squareNumbers
import java.util.Scanner;
import java.lang.Math;

public class squareNumbers{
	public static void main(String[] args){
		int T,N,foundAns;
		long x,ans,g,div,s;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			long[] A = new long[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000000000000L) : "A["+i+"] must be 1 <= A[i] <= 10^18";
			}

			foundAns = 0;
			ans = -1;

			for(int i=0;i<N-1;i++){
				for(int j=i+1;j<N;j++){
					g = gcd(A[i],A[j]);

					if(g>1){
						ans = g;
						foundAns = 1;
						break;
					}
				}

				if(foundAns!=0){
					break;
				}
			}

			for(int i=0;i<N;i++){
				for(x=1;(x*x*x)<=A[i];x++){
					if(x>1 && A[i]%(x*x)==0){
						ans = x;
						foundAns = 1;
						break;
					}

					if(A[i]%x==0){
						div = A[i]/x;
						s = (long)Math.sqrt(div) + (long)1E-6;

						if(s>1 && (s*s)==div){
							ans = s;
							foundAns = 1;
							break;
						}
					}
				}

				if(foundAns!=0){
					break;
				}
			}

			System.out.println(ans);

			T--;
		}
	}

	public static long gcd(long a,long b){
		while(b!=0){
			long mod = a%b;
			a = b;
			b = mod;
		}

		return a;
	}
}