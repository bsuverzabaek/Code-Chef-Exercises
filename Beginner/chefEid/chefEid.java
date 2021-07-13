//run as java -ea chefEid
import java.util.Scanner;
import java.util.Arrays;

public class chefEid{
	public static void main(String[] args){
		int T,N,sumN,min;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";

			sumN += N;

			if(T==1){
				assert(sumN<=500000) : "Sum of N must be <= 5*10^5";
			}

			int[] v = new int[N];

			for(int i=0;i<N;i++){
				v[i] = scan.nextInt();
				assert(v[i]>=1 && v[i]<=1000000) : "v["+i+"] must be 1 <= v[i] <= 10^6";
			}

			Arrays.sort(v);
			min = 10000000;

			for(int i=0;i<N-1;i++){
				if(v[i+1]-v[i]<=min){
					min = v[i+1]-v[i];
				}
			}

			System.out.println(min);

			T--;
		}
	}
}