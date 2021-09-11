//run as java -ea copyPaste
import java.util.Scanner;

public class copyPaste{
	public static void main(String[] args){
		int T,N,ai,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=20) : "T must be 1 <= T <= 20";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[100000];

			for(int i=0;i<100000;i++){
				A[i] = 0;
			}

			count = 0;

			while(N>0){
				ai = scan.nextInt();
				assert(ai>=1 && ai<=100000) : "A[i] must be 1 <= A[i] <= 10^5";

				A[ai]++;

				if(A[ai]==1){
					count++;
				}

				N--;
			}

			System.out.println(count);

			T--;
		}
	}
}