//run as java -ea xennyTasks
import java.util.Scanner;

public class xennyTasks{
	public static void main(String[] args){
		int T,N,a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=20000) : "N must be 1 <= N <= 2*10^4";

			int[] X = new int[N];
			int[] Y = new int[N];

			a = 0;
			b = 0;

			for(int i=0;i<N;i++){
				X[i] = scan.nextInt();
				assert(X[i]>=1 && X[i]<=100000) : "X["+i+"] must be 1 <= X[i] <= 10^5";
			}

			for(int i=0;i<N;i++){
				Y[i] = scan.nextInt();
				assert(Y[i]>=1 && Y[i]<=100000) : "Y["+i+"] must be 1 <= Y[i] <= 10^5";

				if(i%2==0){
					a += X[i];
					b += Y[i];
				}else{
					a += Y[i];
					b += X[i];
				}
			}

			if(a<b){
				System.out.println(a);
			}else{
				System.out.println(b);
			}

			T--;
		}
	}
}