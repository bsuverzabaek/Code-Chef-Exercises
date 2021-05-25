//run as java -ea vogonZoo
import java.util.Scanner;
import java.util.Arrays;

public class vogonZoo{
	public static void main(String[] args){
		int N,K,next,counter;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		K = scan.nextInt();
		assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 10^6";

		int[] numberCount = new int[N];

		for(int i=0;i<N;i++){
			numberCount[i] = scan.nextInt();
			assert(numberCount[i]>=1 && numberCount[i]<=10000000) : "Each type must be 1 <= type <= 10^7";
		}

		Arrays.sort(numberCount);
		next = numberCount[0];
		counter = 1;

		for(int i=1;i<N;i++){
			if((numberCount[i]-next)>=K){
				counter++;
				next = numberCount[i];
			}
		}

		System.out.println(counter);
	}
}