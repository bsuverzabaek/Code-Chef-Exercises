//run as java -ea culturalProgramme
import java.util.Scanner;

public class culturalProgramme{
	public static void main(String[] args){
		int N,start,end,max;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

		max = 0;

		int[] A = new int[10000001];

		for(int i=0;i<10000001;i++){
			A[i] = 0;
		}

		while(N>0){
			start = scan.nextInt();
			end = scan.nextInt();

			assert(start>=1 && start<=10000000) : "The entry time must be 1 <= start <= 10^7";
			assert(end>=1 && end<=10000000) : "The exit time must be 1 <= end <= 10^7";

			A[start] += 1;
			A[end+1] -= 1;

			N--;
		}

		for(int i=2;i<10000001;i++){
			A[i] += A[i-1];

			if(max<A[i]){
				max = A[i];
			}
		}

		System.out.println(max);
	}
}