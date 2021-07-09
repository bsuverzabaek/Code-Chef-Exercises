//run as java -ea andrashStipend
import java.util.Scanner;

public class andrashStipend{
	public static void main(String[] args){
		int T,N,count,fail,total;
		double avg;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=40) : "T must be 1 <= T <= 40";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];

			count = 0;
			fail = 0;
			total = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=2 && A[i]<=5) : "A["+i+"] must be 2 <= A[i] <= 5";

				total += A[i];

				if(A[i]==5){
					count = 1;
				}else if(A[i]==2){
					fail = 1;
				}
			}

			avg = (double)total/(double)N;

			if(avg>=4.0 && count==1 && fail==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--;
		}
	}
}