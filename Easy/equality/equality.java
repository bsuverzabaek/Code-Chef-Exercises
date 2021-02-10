//run as java -ea equality
import java.util.Scanner;

public class equality{
	public static void main(String[] args){
		int T,N,sumN;
		long sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=25000) : "T must be 1 <= T <= 25000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=50000) : "N must be 2 <= N <= 50000";
			sumN += N;

			if(T==1){
				assert(sumN<=50000) : "Sum of N must not be greater than 50000";
			}

			long[] a = new long[N];
			sum = 0;

			for(int i=0;i<N;i++){
				a[i] = scan.nextLong();
				assert(a[i]>=1 && a[i]<=5000000000000L) : "a["+i+"] must be 1 <= a[i] <= 5*10^12";
				sum += a[i];
			}

			sum /= N-1;

			for(int i=0;i<N;i++){
				assert(sum-a[i]>=1 && sum-a[i]<=100000000) : "x["+i+"] must be 1 <= x[i] <= 10^8";
				System.out.print(sum-a[i] + " ");
			}

			System.out.println();

			T--;
		}
	}
}