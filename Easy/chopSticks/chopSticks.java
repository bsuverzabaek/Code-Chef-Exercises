//run as java -ea chopSticks
import java.util.Scanner;
import java.util.Arrays;

public class chopSticks{
	public static void main(String[] args){
		int N,D,count;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		D = scan.nextInt();

		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
		assert(D>=0 && D<=1000000000) : "D must be 0 <= D <= 10^9";

		int[] L = new int[N];

		for(int i=0;i<N;i++){
			L[i] = scan.nextInt();
			assert(L[i]>=1 && L[i]<=1000000000) : "L["+i+"] must be 1 <= L[i] <= 10^9";
		}

		Arrays.sort(L);
		count = 0;

		for(int i=0;i<N-1;i++){
			if((L[i+1]-L[i])<=D){
				count++;
				i++;
			}
		}

		System.out.println(count);
	}
}