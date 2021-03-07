//run as java -ea buddyNim
import java.util.Scanner;
import java.util.Arrays;

public class buddyNim{
	public static void main(String[] args){
		int T,N,M,x,a,b,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 10^2";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 10^2";
			assert(M>=1 && M<=100) : "M must be 1 <= M <= 10^2";

			int[] A = new int[N];
			int[] B = new int[M];

			a = 0;
			b = 0;
			flag = 0;

			for(int i=0;i<N;i++){
				x = scan.nextInt();
				assert(x>=0 && x<=1000000000) : "A["+i+"] must be 0 <= A[i] <= 10^9";

				if(x>0){
					A[a++] = x;
				}
			}

			for(int i=0;i<M;i++){
				x = scan.nextInt();
				assert(x>=0 && x<=1000000000) : "B["+i+"] must be 0 <= B[i] <= 10^9";

				if(x>0){
					B[b++] = x;
				}
			}

			Arrays.sort(A);
			Arrays.sort(B);

			if(a==b){
				for(int i=0;i<a;i++){
					if(A[i]!=B[i]){
						flag = 1;
						break;
					}
				}
			}

			if(a==b && flag==0){
				System.out.println("Bob");
			}else{
				System.out.println("Alice");
			}

			T--;
		}
	}
}