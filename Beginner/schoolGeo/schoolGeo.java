//run as java -ea schoolGeo
import java.util.Scanner;
import java.util.Arrays;

public class schoolGeo{
	public static void main(String[] args){
		int T,N,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";

			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			for(int i=0;i<N;i++){
				B[i] = scan.nextInt();
				assert(B[i]>=1 && B[i]<=1000000000) : "B["+i+"] must be 1 <= B[i] <= 10^9";
			}

			Arrays.sort(A);
			Arrays.sort(B);

			sum = 0;

			for(int i=0;i<N;i++){
				sum += min(A[i],B[i]);
			}

			System.out.println(sum);

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