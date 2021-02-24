//run as java -ea matches
import java.util.Scanner;

public class matches{
	public static void main(String[] args){
		int T;
		long N,M,X,Y,k,r;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextLong();
			M = scan.nextLong();

			assert(N>=1 && N<=1000000000000000000L) : "N must be 1 <= N <= 10^18";
			assert(M>=1 && M<=1000000000000000000L) : "M must be 1 <= M <= 10^18";

			X = max(N,M);
			Y = min(N,M);
			k = 0;

			while(true){
				k++;

				if(X==Y){
					System.out.println("Ari");
					break;
				}else if(Y==0){
					if(k%2==1){
						System.out.println("Ari");
						break;
					}else{
						System.out.println("Rich");
						break;
					}
				}else if(X/Y>=2){
					if(k%2==1){
						System.out.println("Ari");
						break;
					}else{
						System.out.println("Rich");
						break;
					}
				}

				r = X;
				X = Y;
				Y = r%Y;
			}

			T--;
		}
	}

	public static long max(long a,long b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}

	public static long min(long a,long b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}