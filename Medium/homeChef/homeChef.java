//run as java -ea homeChef
import java.util.Scanner;
import java.util.Arrays;

public class homeChef{
	public static void main(String[] args){
		int T,N;
		long a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N<=1000) : "N must be <= 10^3";

			long[] X = new long[N];
			long[] Y = new long[N];

			for(int i=0;i<N;i++){
				X[i] = scan.nextLong();
				Y[i] = scan.nextLong();
				assert(X[i]>=-100000000 && X[i]<=100000000) : "X["+i+"] must be -10^8 <= X[i] <= 10^8";
				assert(Y[i]>=-100000000 && Y[i]<=100000000) : "Y["+i+"] must be -10^8 <= Y[i] <= 10^8";
			}

			if(N%2!=0){
				System.out.println(1);
			}else{
				Arrays.sort(X);
				Arrays.sort(Y);

				a = X[N/2]-X[N/2-1]+1;
				b = Y[N/2]-Y[N/2-1]+1;

				System.out.println(a*b);
			}

			T--;
		}
	}
}