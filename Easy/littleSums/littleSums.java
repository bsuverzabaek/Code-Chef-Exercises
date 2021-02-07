//run as java -ea littleSums
import java.util.Scanner;

public class littleSums{
	public static void main(String[] args){
		int T,N,m;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];
			m = 100000;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
				m = min(m,A[i]);
			}

			for(int i=0;i<N;i++){
				if(A[i]==m){
					System.out.println(i+1);
					break;
				}
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