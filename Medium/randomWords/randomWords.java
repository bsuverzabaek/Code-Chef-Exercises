//run as java -ea randomWords
import java.util.Scanner;

public class randomWords{
	public static void main(String[] args){
		int T,N;
		long sum,prefSum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			long[] a = new long[N];

			for(int i=0;i<N;i++){
				a[i] = scan.nextLong();
				assert(a[i]>=1 && a[i]<1073741824) : "a["+i+"] must be 1 <= a[i] <= 2^30";
			}

			sum = 0;
			prefSum = 0;

			for(int i=0;i<N;i++){
				prefSum += a[i];
				sum = (sum|a[i])|prefSum;
			}

			System.out.println(sum);

			T--;
		}
	}
}